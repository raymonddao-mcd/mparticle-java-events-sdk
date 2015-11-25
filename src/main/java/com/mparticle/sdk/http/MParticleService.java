package com.mparticle.sdk.http;

import com.mparticle.sdk.model.Batch;
import retrofit.http.Body;
import retrofit.http.POST;

import java.util.List;

/**
 * REST interface for the mParticle API.
 */
public interface MParticleService {
    @POST("/v2/bulkevents")
    UploadResponse upload(@Body List<Batch> batch);
}
