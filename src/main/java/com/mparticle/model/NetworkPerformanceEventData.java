package com.mparticle.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NetworkPerformanceEventData
 */

public class NetworkPerformanceEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_HTTP_VERB = "http_verb";
  @SerializedName(SERIALIZED_NAME_HTTP_VERB)
  private String httpVerb;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TIME_ELAPSED = "time_elapsed";
  @SerializedName(SERIALIZED_NAME_TIME_ELAPSED)
  private Integer timeElapsed;

  public static final String SERIALIZED_NAME_BYTES_IN = "bytes_in";
  @SerializedName(SERIALIZED_NAME_BYTES_IN)
  private Integer bytesIn;

  public static final String SERIALIZED_NAME_BYTES_OUT = "bytes_out";
  @SerializedName(SERIALIZED_NAME_BYTES_OUT)
  private Integer bytesOut;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "response_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private Integer responseCode;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public NetworkPerformanceEventData httpVerb(String httpVerb) {
    this.httpVerb = httpVerb;
    return this;
  }

   /**
   * Get httpVerb
   * @return httpVerb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getHttpVerb() {
    return httpVerb;
  }

  public void setHttpVerb(String httpVerb) {
    this.httpVerb = httpVerb;
  }

  public NetworkPerformanceEventData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public NetworkPerformanceEventData timeElapsed(Integer timeElapsed) {
    this.timeElapsed = timeElapsed;
    return this;
  }

   /**
   * Get timeElapsed
   * @return timeElapsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getTimeElapsed() {
    return timeElapsed;
  }

  public void setTimeElapsed(Integer timeElapsed) {
    this.timeElapsed = timeElapsed;
  }

  public NetworkPerformanceEventData bytesIn(Integer bytesIn) {
    this.bytesIn = bytesIn;
    return this;
  }

   /**
   * Get bytesIn
   * @return bytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getBytesIn() {
    return bytesIn;
  }

  public void setBytesIn(Integer bytesIn) {
    this.bytesIn = bytesIn;
  }

  public NetworkPerformanceEventData bytesOut(Integer bytesOut) {
    this.bytesOut = bytesOut;
    return this;
  }

   /**
   * Get bytesOut
   * @return bytesOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getBytesOut() {
    return bytesOut;
  }

  public void setBytesOut(Integer bytesOut) {
    this.bytesOut = bytesOut;
  }

  public NetworkPerformanceEventData responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public NetworkPerformanceEventData data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkPerformanceEventData networkPerformanceEventData = (NetworkPerformanceEventData) o;
    return Objects.equals(this.httpVerb, networkPerformanceEventData.httpVerb) &&
        Objects.equals(this.url, networkPerformanceEventData.url) &&
        Objects.equals(this.timeElapsed, networkPerformanceEventData.timeElapsed) &&
        Objects.equals(this.bytesIn, networkPerformanceEventData.bytesIn) &&
        Objects.equals(this.bytesOut, networkPerformanceEventData.bytesOut) &&
        Objects.equals(this.responseCode, networkPerformanceEventData.responseCode) &&
        Objects.equals(this.data, networkPerformanceEventData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpVerb, url, timeElapsed, bytesIn, bytesOut, responseCode, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkPerformanceEventData {\n");
    sb.append("    httpVerb: ").append(toIndentedString(httpVerb)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

