package com.mparticle.sdk;

import com.mparticle.sdk.model.Batch;

/**
 * Callback invoked when the client library is done processing a message.
 * <p/>
 * Methods may be called on background threads, implementations must implement their own
 * synchronization if needed. Implementations should also take care to make the methods
 * non-blocking.
 */
public interface Callback {
    /**
     * Invoked when the message is successfully uploaded to mParticle.
     * <p/>
     */
    void success(Batch message);

    /**
     * Invoked when the library gives up on sending a message.
     * <p/>
     * This could be due to exhausting retries, or other unexpected errors. Use the {@code throwable}
     * provided to take further action.
     */
    void failure(Batch message, Throwable throwable);
}
