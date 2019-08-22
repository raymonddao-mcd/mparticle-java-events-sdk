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
 * SessionEndEventData
 */

public class SessionEndEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_SESSION_DURATION_MS = "session_duration_ms";
  @SerializedName(SERIALIZED_NAME_SESSION_DURATION_MS)
  private Integer sessionDurationMs;

  public SessionEndEventData sessionDurationMs(Integer sessionDurationMs) {
    this.sessionDurationMs = sessionDurationMs;
    return this;
  }

   /**
   * Get sessionDurationMs
   * @return sessionDurationMs
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSessionDurationMs() {
    return sessionDurationMs;
  }

  public void setSessionDurationMs(Integer sessionDurationMs) {
    this.sessionDurationMs = sessionDurationMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionEndEventData sessionEndEventData = (SessionEndEventData) o;
    return Objects.equals(this.sessionDurationMs, sessionEndEventData.sessionDurationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionDurationMs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionEndEventData {\n");
    sb.append("    sessionDurationMs: ").append(toIndentedString(sessionDurationMs)).append("\n");
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

