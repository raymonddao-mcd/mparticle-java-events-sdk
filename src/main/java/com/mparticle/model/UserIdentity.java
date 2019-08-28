package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * UserIdentity
 */

public class UserIdentity {
  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private IdentityType identityType;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS = "timestamp_unixtime_ms";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS)
  private Integer timestampUnixtimeMs;

  public static final String SERIALIZED_NAME_CREATED_THIS_BATCH = "created_this_batch";
  @SerializedName(SERIALIZED_NAME_CREATED_THIS_BATCH)
  private Boolean createdThisBatch;

  public UserIdentity identityType(IdentityType identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @ApiModelProperty(required = true, value = "")
  public IdentityType getIdentityType() {
    return identityType;
  }

  public void setIdentityType(IdentityType identityType) {
    this.identityType = identityType;
  }

  public UserIdentity identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public UserIdentity timestampUnixtimeMs(Integer timestampUnixtimeMs) {
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

  public UserIdentity createdThisBatch(Boolean createdThisBatch) {
    this.createdThisBatch = createdThisBatch;
    return this;
  }

   /**
   * Get createdThisBatch
   * @return createdThisBatch
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getCreatedThisBatch() {
    return createdThisBatch;
  }

  public void setCreatedThisBatch(Boolean createdThisBatch) {
    this.createdThisBatch = createdThisBatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdentity userIdentity = (UserIdentity) o;
    return Objects.equals(this.identityType, userIdentity.identityType) &&
        Objects.equals(this.identity, userIdentity.identity) &&
        Objects.equals(this.timestampUnixtimeMs, userIdentity.timestampUnixtimeMs) &&
        Objects.equals(this.createdThisBatch, userIdentity.createdThisBatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityType, identity, timestampUnixtimeMs, createdThisBatch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentity {\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    timestampUnixtimeMs: ").append(toIndentedString(timestampUnixtimeMs)).append("\n");
    sb.append("    createdThisBatch: ").append(toIndentedString(createdThisBatch)).append("\n");
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

