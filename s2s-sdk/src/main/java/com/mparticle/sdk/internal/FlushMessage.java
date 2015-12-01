package com.mparticle.sdk.internal;

import com.mparticle.sdk.model.Batch;
import com.mparticle.sdk.model.message.CustomEvent;
import com.mparticle.sdk.model.Message;

import java.util.Arrays;

class FlushMessage {
    static final Batch FLUSH = new Batch.Builder("api key").developmentMode(true).events(Arrays.asList(
            (Message) new CustomEvent("flush")
    )).build();

    @Override
    public String toString() {
        return "FlushMessage{}";
    }
}
