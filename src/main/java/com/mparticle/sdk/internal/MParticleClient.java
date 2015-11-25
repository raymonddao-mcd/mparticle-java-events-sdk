package com.mparticle.sdk.internal;

import com.mparticle.sdk.Callback;
import com.mparticle.sdk.Logger;
import com.mparticle.sdk.http.MParticleService;
import com.mparticle.sdk.model.Batch;
import com.segment.backo.Backo;
import retrofit.RetrofitError;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static com.mparticle.sdk.Logger.Level.*;

public class MParticleClient {

    private final BlockingQueue<Batch> messageQueue;
    private final MParticleService service;
    private final int batchSize;
    private final Logger logger;
    private final Callback callback;
    private final ExecutorService networkExecutor;
    private final ExecutorService looperExecutor;
    private final ScheduledExecutorService flushScheduler;

    public static MParticleClient create(MParticleService mParticleService, int maxQueueSize, int maxBatchSize,
                                         long flushIntervalInMillis, Logger logger, ThreadFactory threadFactory,
                                         ExecutorService networkExecutor, Callback callback) {
        return new MParticleClient(new LinkedBlockingQueue<Batch>(maxQueueSize), mParticleService, maxBatchSize,
                flushIntervalInMillis, logger, threadFactory, networkExecutor, callback);
    }

    MParticleClient(BlockingQueue<Batch> messageQueue, MParticleService service, int maxBatchSize,
                    long flushIntervalInMillis, Logger logger, ThreadFactory threadFactory,
                    ExecutorService networkExecutor, Callback callback) {
        this.messageQueue = messageQueue;
        this.service = service;
        this.batchSize = maxBatchSize;
        this.logger = logger;
        this.callback = callback;
        this.looperExecutor = Executors.newSingleThreadExecutor(threadFactory);
        this.networkExecutor = networkExecutor;

        looperExecutor.submit(new Looper());

        flushScheduler = Executors.newScheduledThreadPool(1, threadFactory);
        flushScheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                flush();
            }
        }, flushIntervalInMillis, flushIntervalInMillis, TimeUnit.MILLISECONDS);
    }

    public void upload(Batch message) {
        try {
            messageQueue.put(message);
        } catch (InterruptedException e) {
            logger.print(ERROR, e, "Interrupted while adding message %s.", message);
        }
    }

    public void flush() {
        upload(FlushMessage.FLUSH);
    }

    public void shutdown() {
        messageQueue.clear();
        looperExecutor.shutdownNow();
        flushScheduler.shutdownNow();
        networkExecutor.shutdown(); // Let in-flight requests complete.
    }

    /**
     * Looper runs on a background thread and takes messages from the queue. Once it collects enough
     * messages, it triggers a flush.
     */
    class Looper implements Runnable {
        @Override
        public void run() {
            List<Batch> messages = new ArrayList<>();
            List<Future<?>> pendingRequests = new ArrayList<>();
            try {
                while (true) {
                    Batch message = messageQueue.take();

                    if (message != FlushMessage.FLUSH) {
                        messages.add(message);
                    } else if (messages.size() < 1) {
                        logger.print(VERBOSE, "No batches to flush.");
                        continue;
                    }

                    if (messages.size() >= batchSize || message == FlushMessage.FLUSH) {
                        logger.print(VERBOSE, "Uploading bulk batch with %s batch(es).", messages.size());
                        try {
                            networkExecutor.submit(BatchUploadTask.create(MParticleClient.this, messages));
                            messages = new ArrayList<>();
                        }catch (RejectedExecutionException executionException) {
                            logger.print(ERROR, "Failed to queue upload task: " + executionException.toString());
                        }catch (Exception e) {
                            logger.print(ERROR, "Failed to queue upload task: " + e.toString());
                        }
                    }
                }
            } catch (InterruptedException e) {
                logger.print(DEBUG, "Looper interrupted while polling for messages.");
            }
        }
    }

    static class BatchUploadTask implements Runnable {
        private static final Backo BACKO = Backo.builder()
                .base(TimeUnit.SECONDS, 2)
                .cap(TimeUnit.HOURS, 1)
                .jitter(1)
                .build();
        private static final int MAX_ATTEMPTS = 50;

        private final MParticleClient client;
        private final Backo backo;
        final List<Batch> batch;

        static BatchUploadTask create(MParticleClient client, List<Batch> batch) {
            return new BatchUploadTask(client, BACKO, batch);
        }

        BatchUploadTask(MParticleClient client, Backo backo, List<Batch> batch) {
            this.client = client;
            this.batch = batch;
            this.backo = backo;
        }

        /**
         * Returns {@code true} to indicate a batch should be retried. {@code false} otherwise.
         */
        boolean upload() {
            try {
                // Ignore return value, UploadResponse#onSuccess will never return false for 200 OK
                client.service.upload(batch);

                client.logger.print(VERBOSE, "Uploaded batch: %s.", batch);
                if (client.callback != null) {
                    for (Batch message : batch) {
                        client.callback.success(message);
                    }
                }
                return false;
            } catch (RetrofitError error) {
                switch (error.getKind()) {
                    case NETWORK:
                        client.logger.print(DEBUG, error, "Could not upload batch: %s. Retrying.", batch);
                        return true;
                    case HTTP:
                        if (error.getResponse().getStatus() == 429) {
                            client.logger.print(ERROR, error, "Could not upload batch due to throttling.", batch);
                            return true;
                        }
                    default:
                        client.logger.print(ERROR, error, "Could not upload batch: %s. Giving up.", batch);
                        if (client.callback != null) {
                            for (Batch message : batch) {
                                client.callback.failure(message, error);
                            }
                        }
                        return false; // Don't retry
                }
            }
        }

        @Override
        public void run() {
            try {
                for (int attempt = 0; attempt < MAX_ATTEMPTS; attempt++) {
                    boolean retry = upload();

                    if (!retry) return;

                    try {
                        backo.sleep(1);
                    } catch (InterruptedException e) {
                        client.logger.print(DEBUG, "Thread interrupted while backing off for batch: %s.", batch);
                        return;
                    }
                }

                client.logger.print(ERROR, "Could not upload batch: %s. Retries exhausted.", batch);
                IOException exception = new IOException(MAX_ATTEMPTS + " retries exhausted");
                if (client.callback != null) {
                    for (Batch message : batch) {
                        client.callback.failure(message, exception);
                    }
                }
            }catch (Exception e) {
                return;
            }
        }
    }
}
