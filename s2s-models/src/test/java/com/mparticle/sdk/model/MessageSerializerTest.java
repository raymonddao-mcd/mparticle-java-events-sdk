package com.mparticle.sdk.model;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageSerializerTest {
    @Test
    public void testSerializingTheSerializer() throws Exception {
        MessageSerializer serializer = new MessageSerializer();
        MessageSerializer serializer2 = SerializationUtils.clone(serializer);
        assertNotNull(serializer2);
    }
}