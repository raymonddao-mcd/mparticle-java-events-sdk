package com.mparticle.sdk.model;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MessageSerializerTest {
    @Test
    public void testSerializingTheSerializer() throws Exception {
        MessageSerializer serializer = new MessageSerializer();
        MessageSerializer serializer2 = SerializationUtils.clone(serializer);
        assertNotNull(serializer2);
    }

    @Test
    public void testUserAttributes() throws Exception {
        Map<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("attribute 1", "value 1");
        userAttributes.put("attribute 2", "value 2");

        Map<String, List<String>> userAttributeLists = new HashMap<String, List<String>>();
        List<String> list1 = new ArrayList<String>();
        list1.add("list value 1");
        list1.add("list value 2");
        List<String> list2 = new ArrayList<String>();
        list2.add("list value 3");
        list2.add("list value 4");
        userAttributeLists.put("attribute 3", list1);
        userAttributeLists.put("attribute 4", list2);

        Batch batch = new Batch.Builder("api key")
                .developmentMode(true)
                .userAttributes(userAttributes)
                .userAttributeLists(userAttributeLists)
                .build();

        Map<String, Object> attributes = batch.getUserAttributes();
        assertEquals("value 1", attributes.get("attribute 1"));
        assertEquals("value 2", attributes.get("attribute 2"));
        assertEquals(list1, attributes.get("attribute 3"));
        assertEquals(list2, attributes.get("attribute 4"));


        MessageSerializer serializer = new MessageSerializer();
        String serializedBatch = serializer.serialize(batch);
        Batch deserializedBatch = serializer.deserialize(serializedBatch, Batch.class);
        attributes = deserializedBatch.getUserAttributes();
        assertEquals("value 1", attributes.get("attribute 1"));
        assertEquals("value 2", attributes.get("attribute 2"));
        assertEquals(list1, attributes.get("attribute 3"));
        assertEquals(list2, attributes.get("attribute 4"));
    }

    @Test
    public void testDuplicateAttributes() {
        Map<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("attribute 1", "value 1");
        userAttributes.put("attribute 2", "value 2");

        Map<String, List<String>> userAttributeLists = new HashMap<String, List<String>>();
        List<String> list1 = new ArrayList<String>();
        list1.add("list value 1");
        list1.add("list value 2");
        List<String> list2 = new ArrayList<String>();
        list2.add("list value 3");
        list2.add("list value 4");
        userAttributeLists.put("attribute 2", list1);
        userAttributeLists.put("attribute 4", list2);

        Exception e = null;
        try {
            Batch batch = new Batch.Builder("api key")
                    .developmentMode(true)
                    .userAttributes(userAttributes)
                    .userAttributeLists(userAttributeLists)
                    .build();
        }catch (IllegalArgumentException ise) {
            e = ise;
        }
        assertNotNull(e);
    }
}