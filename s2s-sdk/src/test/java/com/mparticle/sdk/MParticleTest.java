package com.mparticle.sdk;

import com.mparticle.sdk.model.*;
import com.mparticle.sdk.model.message.CustomEvent;
import com.mparticle.sdk.model.message.CustomEventType;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;


public class MParticleTest {
    static final Logger STDOUT = new Logger() {
        @Override public void print(Level level, String format, Object... args) {
            if (level.equals(Level.ERROR))
                System.out.println(level + "\t:" + String.format(format, args));
        }

        @Override public void print(Level level, Throwable error, String format, Object... args) {
            if (level.equals(Level.ERROR)) {
                System.out.println(level + "\t:" + String.format(format, args));
                System.out.println(error);
            }
        }
    };

    static final Callback CALLBACK = new Callback() {
        @Override public void success(Batch message) {
            System.out.println("Successfully uploaded " + message);
        }

        @Override public void failure(Batch message, Throwable throwable) {
            System.out.println("Could not upload " + message);
            System.out.println(throwable);
        }
    };

    private static final String TEST_APP_KEY = "";
    private static final String TEST_APP_SECRET = "";
    private static MParticle mParticle;

    @Test
    public void testBuilder() throws Exception {
        Exception exception = null;
        try {
            MParticle mParticle = MParticle.builder(null, null, true).build();
        }catch (NullPointerException npe) {
            exception = npe;
        }
        assertNotNull("Builder should have thrown NPE", exception);
    }

    @Test
    public void testUpload() throws Exception {

        mParticle = MParticle.builder(TEST_APP_KEY, TEST_APP_SECRET, true).logger(STDOUT).callback(CALLBACK).build();

        new Thread() {
            @Override
            public void run() {
                super.run();

                ApplicationInfo applicationInfo = new ApplicationInfo();
                applicationInfo.setApplicationName("Particlebox Android s2s")
                        .setApplicationVersion("10")
                        .setPackage("com.mparticle.particlebox");
                DeviceInfo deviceInfo = new DeviceInfo()
                        .setDevice("Sam's Sweet Made-up Phone")
                        .setIosAdvertisingId("96bd03b6-defc-4203-83d3-dc1c730801f7")
                        .setBrand("Dozor Inc");

                List<Message> events = new LinkedList<>();
                Map<String, String> attributes = new HashMap<String, String>();
                attributes.put("test attribute key", "test attribute value");
                events.add(new CustomEvent("S2S test event with attributes")
                        .setCustomEventType(CustomEventType.OTHER)
                        .setCustomAttributes(attributes));

                Map<String, String> userAttributes = new HashMap<>();
                userAttributes.put(Constants.UserAttributes.FIRST_NAME, "john");
                userAttributes.put(Constants.UserAttributes.LAST_NAME, "doe");
                UserIdentities userIdentities = new UserIdentities().setEmail("john.doe@gmail.com");
                Batch.Builder builder = new Batch.Builder("some api key")
                        .applicationInfo(applicationInfo)
                        .deviceInfo(deviceInfo)
                        .events(events)
                        .userAttributes(userAttributes)
                        .userIdentities(userIdentities);
                int i = 0;
                while (i < 100000) {
                    mParticle.upload(builder);
                    i++;
                }
                mParticle.flush();
            }
        }.start();
        // Give some time for requests to complete.
        Thread.sleep(TimeUnit.SECONDS.toMillis(3000));

        mParticle.shutdown();
    }

    @Test
    public void testFlush() throws Exception {

    }

    @Test
    public void testShutdown() throws Exception {

    }
}