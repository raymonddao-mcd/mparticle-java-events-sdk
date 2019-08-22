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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ScreenViewEventData
 */

public class ScreenViewEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_SCREEN_NAME = "screen_name";
  @SerializedName(SERIALIZED_NAME_SCREEN_NAME)
  private String screenName;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activity_type";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private String activityType;

  public static final String SERIALIZED_NAME_CUSTOM_FLAGS = "custom_flags";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FLAGS)
  private Map<String, String> customFlags = new HashMap<String, String>();

  public ScreenViewEventData screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }

   /**
   * Get screenName
   * @return screenName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getScreenName() {
    return screenName;
  }

  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }

  public ScreenViewEventData activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public ScreenViewEventData customFlags(Map<String, String> customFlags) {
    this.customFlags = customFlags;
    return this;
  }

  public ScreenViewEventData putCustomFlagsItem(String key, String customFlagsItem) {
    if (this.customFlags == null) {
      this.customFlags = new HashMap<String, String>();
    }
    this.customFlags.put(key, customFlagsItem);
    return this;
  }

   /**
   * Get customFlags
   * @return customFlags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, String> getCustomFlags() {
    return customFlags;
  }

  public void setCustomFlags(Map<String, String> customFlags) {
    this.customFlags = customFlags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenViewEventData screenViewEventData = (ScreenViewEventData) o;
    return Objects.equals(this.screenName, screenViewEventData.screenName) &&
        Objects.equals(this.activityType, screenViewEventData.activityType) &&
        Objects.equals(this.customFlags, screenViewEventData.customFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screenName, activityType, customFlags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenViewEventData {\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    customFlags: ").append(toIndentedString(customFlags)).append("\n");
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

