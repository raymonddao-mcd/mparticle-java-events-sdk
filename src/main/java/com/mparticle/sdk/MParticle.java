package com.mparticle.sdk;

import com.mparticle.sdk.http.MParticleService;
import com.mparticle.sdk.internal.MParticleClient;
import com.mparticle.sdk.model.Batch;
import com.mparticle.sdk.model.Constants;
import com.squareup.okhttp.Credentials;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.converter.JacksonConverter;

import java.util.concurrent.*;

public class MParticle {
    private final MParticleClient client;
    private final Logger logger;
    private final boolean developmentMode;

    MParticle(MParticleClient client, Logger logger, boolean developmentMode) {
        this.client = client;
        this.logger = logger;
        this.developmentMode = developmentMode;
    }

    public static Builder builder(String appKey, String appSecret, boolean developmentMode) {
        return new Builder(appKey, appSecret, developmentMode);
    }

    public void upload(Batch.Builder builder) {
        if (builder.getDevelopmentMode() == null) {
            builder.developmentMode(developmentMode);
        }
        client.upload(builder.build());
    }

    /**
     * Flush events in the message queue.
     */
    public void flush() {
        client.flush();
    }

    /**
     * Stops this instance from processing further requests.
     */
    public void shutdown() {
        client.shutdown();
    }

    public static class Builder {
        private static final String AUTHORIZATION_HEADER = "Authorization";

        private final String appKey;
        private final String appSecret;
        private Client client;
        private Logger logger;
        private ExecutorService networkExecutor;
        private ThreadFactory threadFactory;
        private int maxBatchSize;
        private int maxQueueSize;
        private long flushIntervalInMillis;
        private Callback callback;
        private Boolean developmentMode;
        private String endpoint = Constants.US_ENDPOINT;

        Builder(String appKey, String appSecret, boolean developmentMode) {
            if (appKey == null || appKey.trim().length() == 0) {
                throw new NullPointerException("appKey cannot be null or empty.");
            }
            if (appSecret == null || appSecret.trim().length() == 0) {
                throw new NullPointerException("appSecret cannot be null or empty.");
            }
            this.appKey = appKey;
            this.appSecret = appSecret;
            this.developmentMode = developmentMode;
        }

        /**
         * Set a custom networking client.
         */
        public Builder client(Client client) {
            if (client == null) {
                throw new NullPointerException("Null client");
            }
            this.client = client;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Configure debug logging mechanism. By default, nothing is logged.
         */
        public Builder logger(Logger logger) {
            if (logger == null) {
                throw new NullPointerException("Null logger");
            }
            this.logger = logger;
            return this;
        }

        public Builder developmentMode(boolean developmentMode) {
            this.developmentMode = developmentMode;
            return this;
        }

        /**
         * Set the queueSize at which the queue will block
         */
        public Builder maxQueueSize(int maxQueueSize) {
            if (maxQueueSize < 1) {
                throw new IllegalArgumentException("maxQueueSize must not be less than 1.");
            }
            this.maxQueueSize = maxQueueSize;
            return this;
        }

        /**
         * Set the queueSize at which flushes should be triggered.
         */
        public Builder maxBatchSize(int maxBatchSize) {
            if (maxBatchSize < 1) {
                throw new IllegalArgumentException("maxBatchSize must not be less than 1.");
            }
            this.maxBatchSize = maxBatchSize;
            return this;
        }


        /**
         * Set the interval at which the queue should be flushed.
         */

        public Builder flushInterval(long flushInterval, TimeUnit unit) {
            long flushIntervalInMillis = unit.toMillis(flushInterval);
            if (flushIntervalInMillis < 1000) {
                throw new IllegalArgumentException("flushInterval must not be less than 1 second.");
            }
            this.flushIntervalInMillis = flushIntervalInMillis;
            return this;
        }

        /**
         * Set the {@link ExecutorService} on which all HTTP requests will be made.
         */
        public Builder networkExecutor(ExecutorService networkExecutor) {
            if (networkExecutor == null) {
                throw new NullPointerException("Null networkExecutor");
            }
            this.networkExecutor = networkExecutor;
            return this;
        }

        /**
         * Set the {@link ThreadFactory} used to create threads.
         */
        Builder threadFactory(ThreadFactory threadFactory) {
            if (threadFactory == null) {
                throw new NullPointerException("Null threadFactory");
            }
            this.threadFactory = threadFactory;
            return this;
        }

        /**
         * Set the {@link Callback} to be notified when an event is processed.
         */
        public Builder callback(Callback callback) {
            if (callback == null) {
                throw new NullPointerException("Null callback");
            }
            this.callback = callback;
            return this;
        }

        /**
         * Create an {@link MParticle} client.
         */
        public MParticle build() {

            if (client == null) {
                client = Platform.get().defaultClient();
            }
            if (logger == null) {
                logger = Logger.NONE;
            }
            if (flushIntervalInMillis == 0) {
                flushIntervalInMillis = Platform.get().defaultFlushIntervalInMillis();
            }
            if (maxQueueSize == 0) {
                maxQueueSize = Platform.get().defaultMaxQueueSize();
            }
            if (maxBatchSize == 0) {
                maxBatchSize = Platform.get().defaultMaxBatchSize();
            }
            if (networkExecutor == null) {
                networkExecutor = Platform.get().defaultNetworkExecutor();
            }
            if (threadFactory == null) {
                threadFactory = Platform.get().defaultThreadFactory();
            }
            if (developmentMode == null) {
                developmentMode = false;
            }

            RestAdapter restAdapter = new RestAdapter.Builder().setConverter(new JacksonConverter())
                    .setEndpoint(endpoint)
                    .setClient(client)
                    .setRequestInterceptor(new RequestInterceptor() {
                        @Override
                        public void intercept(RequestFacade request) {
                            request.addHeader(AUTHORIZATION_HEADER, Credentials.basic(appKey, appSecret));
                        }
                    })
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setLog(new RestAdapter.Log() {
                        @Override
                        public void log(String message) {
                            logger.print(Logger.Level.VERBOSE, message);
                        }
                    })
                    .build();

            MParticleService mparticleService = restAdapter.create(MParticleService.class);

            MParticleClient mparticleClient =
                    MParticleClient.create(mparticleService, maxQueueSize, maxBatchSize, flushIntervalInMillis, logger,
                            threadFactory, networkExecutor, callback);
            return new MParticle(mparticleClient, logger, developmentMode);
        }
    }
}
