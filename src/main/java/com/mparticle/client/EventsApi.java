package com.mparticle.client;

import retrofit2.Call;
import retrofit2.http.*;

import com.mparticle.model.Batch;

import java.util.List;

public interface EventsApi {
  /**
   * Send events to mParticle
   * 
   * @param batch  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bulkevents")
  Call<Void> bulkUploadEvents(
    @retrofit2.http.Body List<Batch> batch
  );

  /**
   * Send events to mParticle
   * 
   * @param batch  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("events")
  Call<Void> uploadEvents(
    @retrofit2.http.Body Batch batch
  );

}
