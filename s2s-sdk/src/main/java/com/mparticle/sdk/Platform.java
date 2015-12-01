package com.mparticle.sdk;

import com.squareup.okhttp.OkHttpClient;
import retrofit.client.Client;
import retrofit.client.OkClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.MIN_PRIORITY;

class Platform {
    static final String THREAD_NAME = "mParticle SDK";

    private static final Platform PLATFORM = findPlatform();

    static Platform get() {
        return PLATFORM;
    }

    private static Platform findPlatform() {
        return new Platform();
    }

    Client defaultClient() {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(15, TimeUnit.SECONDS);
        client.setReadTimeout(15, TimeUnit.SECONDS);
        client.setWriteTimeout(15, TimeUnit.SECONDS);
        return new OkClient(client);
    }

    ExecutorService defaultNetworkExecutor() {
        return Executors.newCachedThreadPool(defaultThreadFactory());
    }

    ThreadFactory defaultThreadFactory() {
        return new ThreadFactory() {
            @Override
            public Thread newThread(final Runnable r) {
                return new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Thread.currentThread().setPriority(MIN_PRIORITY);
                        r.run();
                    }
                }, THREAD_NAME);
            }
        };
    }

    public long defaultFlushIntervalInMillis() {
        return 1000 * 1000;
    }

    public int defaultMaxQueueSize() {
        return 1000;
    }

    public int defaultMaxBatchSize() {
        return 100;
    }
}
