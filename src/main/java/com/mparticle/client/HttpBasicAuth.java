package com.mparticle.client;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpBasicAuth implements Interceptor {

    private String apiKey;
    private String apiSecret;

    public void setCredentials(String apiKey, String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        // If the request already have an authorization (eg. Basic auth), do nothing
        if (request.header("Authorization") == null) {
            String credentials = Credentials.basic(apiKey, apiSecret);
            request = request.newBuilder()
                    .addHeader("Authorization", credentials)
                    .build();
        }
        return chain.proceed(request);
    }
}
