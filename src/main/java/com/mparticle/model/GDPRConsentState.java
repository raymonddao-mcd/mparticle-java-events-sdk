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
 * GDPRConsentState
 */

public class GDPRConsentState {
  public static final String SERIALIZED_NAME_REGULATION = "regulation";
  @SerializedName(SERIALIZED_NAME_REGULATION)
  private String regulation;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private String document;

  public static final String SERIALIZED_NAME_CONSENTED = "consented";
  @SerializedName(SERIALIZED_NAME_CONSENTED)
  private Boolean consented;

  public static final String SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS = "timestamp_unixtime_ms";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS)
  private Integer timestampUnixtimeMs;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_HARDWARE_ID = "hardware_id";
  @SerializedName(SERIALIZED_NAME_HARDWARE_ID)
  private String hardwareId;

  public GDPRConsentState regulation(String regulation) {
    this.regulation = regulation;
    return this;
  }

   /**
   * Get regulation
   * @return regulation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRegulation() {
    return regulation;
  }

  public void setRegulation(String regulation) {
    this.regulation = regulation;
  }

  public GDPRConsentState document(String document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public GDPRConsentState consented(Boolean consented) {
    this.consented = consented;
    return this;
  }

   /**
   * Get consented
   * @return consented
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getConsented() {
    return consented;
  }

  public void setConsented(Boolean consented) {
    this.consented = consented;
  }

  public GDPRConsentState timestampUnixtimeMs(Integer timestampUnixtimeMs) {
    this.timestampUnixtimeMs = timestampUnixtimeMs;
    return this;
  }

   /**
   * Get timestampUnixtimeMs
   * @return timestampUnixtimeMs
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTimestampUnixtimeMs() {
    return timestampUnixtimeMs;
  }

  public void setTimestampUnixtimeMs(Integer timestampUnixtimeMs) {
    this.timestampUnixtimeMs = timestampUnixtimeMs;
  }

  public GDPRConsentState location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public GDPRConsentState hardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
    return this;
  }

   /**
   * Get hardwareId
   * @return hardwareId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHardwareId() {
    return hardwareId;
  }

  public void setHardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GDPRConsentState gdPRConsentState = (GDPRConsentState) o;
    return Objects.equals(this.regulation, gdPRConsentState.regulation) &&
        Objects.equals(this.document, gdPRConsentState.document) &&
        Objects.equals(this.consented, gdPRConsentState.consented) &&
        Objects.equals(this.timestampUnixtimeMs, gdPRConsentState.timestampUnixtimeMs) &&
        Objects.equals(this.location, gdPRConsentState.location) &&
        Objects.equals(this.hardwareId, gdPRConsentState.hardwareId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulation, document, consented, timestampUnixtimeMs, location, hardwareId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GDPRConsentState {\n");
    sb.append("    regulation: ").append(toIndentedString(regulation)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    consented: ").append(toIndentedString(consented)).append("\n");
    sb.append("    timestampUnixtimeMs: ").append(toIndentedString(timestampUnixtimeMs)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    hardwareId: ").append(toIndentedString(hardwareId)).append("\n");
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

