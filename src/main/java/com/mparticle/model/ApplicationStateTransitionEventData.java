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
 * ApplicationStateTransitionEventData
 */

public class ApplicationStateTransitionEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_SUCCESSFULLY_CLOSED = "successfully_closed";
  @SerializedName(SERIALIZED_NAME_SUCCESSFULLY_CLOSED)
  private Boolean successfullyClosed;

  public static final String SERIALIZED_NAME_IS_FIRST_RUN = "is_first_run";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_RUN)
  private Boolean isFirstRun;

  public static final String SERIALIZED_NAME_IS_UPGRADE = "is_upgrade";
  @SerializedName(SERIALIZED_NAME_IS_UPGRADE)
  private Boolean isUpgrade;

  public static final String SERIALIZED_NAME_PUSH_NOTIFICATION_PAYLOAD = "push_notification_payload";
  @SerializedName(SERIALIZED_NAME_PUSH_NOTIFICATION_PAYLOAD)
  private String pushNotificationPayload;

  public static final String SERIALIZED_NAME_LAUNCH_REFERRAL = "launch_referral";
  @SerializedName(SERIALIZED_NAME_LAUNCH_REFERRAL)
  private String launchReferral;

  /**
   * Gets or Sets applicationTransitionType
   */
  @JsonAdapter(ApplicationTransitionTypeEnum.Adapter.class)
  public enum ApplicationTransitionTypeEnum {
    INITIALIZED("application_initialized"),
    
    EXIT("application_exit"),
    
    BACKGROUND("application_background"),
    
    FOREGROUND("application_foreground");

    private String value;

    ApplicationTransitionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicationTransitionTypeEnum fromValue(String value) {
      for (ApplicationTransitionTypeEnum b : ApplicationTransitionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApplicationTransitionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicationTransitionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicationTransitionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApplicationTransitionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPLICATION_TRANSITION_TYPE = "application_transition_type";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TRANSITION_TYPE)
  private ApplicationTransitionTypeEnum applicationTransitionType;

  public ApplicationStateTransitionEventData successfullyClosed(Boolean successfullyClosed) {
    this.successfullyClosed = successfullyClosed;
    return this;
  }

   /**
   * Get successfullyClosed
   * @return successfullyClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getSuccessfullyClosed() {
    return successfullyClosed;
  }

  public void setSuccessfullyClosed(Boolean successfullyClosed) {
    this.successfullyClosed = successfullyClosed;
  }

  public ApplicationStateTransitionEventData isFirstRun(Boolean isFirstRun) {
    this.isFirstRun = isFirstRun;
    return this;
  }

   /**
   * Get isFirstRun
   * @return isFirstRun
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsFirstRun() {
    return isFirstRun;
  }

  public void setIsFirstRun(Boolean isFirstRun) {
    this.isFirstRun = isFirstRun;
  }

  public ApplicationStateTransitionEventData isUpgrade(Boolean isUpgrade) {
    this.isUpgrade = isUpgrade;
    return this;
  }

   /**
   * Get isUpgrade
   * @return isUpgrade
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsUpgrade() {
    return isUpgrade;
  }

  public void setIsUpgrade(Boolean isUpgrade) {
    this.isUpgrade = isUpgrade;
  }

  public ApplicationStateTransitionEventData pushNotificationPayload(String pushNotificationPayload) {
    this.pushNotificationPayload = pushNotificationPayload;
    return this;
  }

   /**
   * Get pushNotificationPayload
   * @return pushNotificationPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPushNotificationPayload() {
    return pushNotificationPayload;
  }

  public void setPushNotificationPayload(String pushNotificationPayload) {
    this.pushNotificationPayload = pushNotificationPayload;
  }

  public ApplicationStateTransitionEventData launchReferral(String launchReferral) {
    this.launchReferral = launchReferral;
    return this;
  }

   /**
   * Get launchReferral
   * @return launchReferral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getLaunchReferral() {
    return launchReferral;
  }

  public void setLaunchReferral(String launchReferral) {
    this.launchReferral = launchReferral;
  }

  public ApplicationStateTransitionEventData applicationTransitionType(ApplicationTransitionTypeEnum applicationTransitionType) {
    this.applicationTransitionType = applicationTransitionType;
    return this;
  }

   /**
   * Get applicationTransitionType
   * @return applicationTransitionType
  **/
  @ApiModelProperty(required = true, value = "")
  public ApplicationTransitionTypeEnum getApplicationTransitionType() {
    return applicationTransitionType;
  }

  public void setApplicationTransitionType(ApplicationTransitionTypeEnum applicationTransitionType) {
    this.applicationTransitionType = applicationTransitionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationStateTransitionEventData applicationStateTransitionEventData = (ApplicationStateTransitionEventData) o;
    return Objects.equals(this.successfullyClosed, applicationStateTransitionEventData.successfullyClosed) &&
        Objects.equals(this.isFirstRun, applicationStateTransitionEventData.isFirstRun) &&
        Objects.equals(this.isUpgrade, applicationStateTransitionEventData.isUpgrade) &&
        Objects.equals(this.pushNotificationPayload, applicationStateTransitionEventData.pushNotificationPayload) &&
        Objects.equals(this.launchReferral, applicationStateTransitionEventData.launchReferral) &&
        Objects.equals(this.applicationTransitionType, applicationStateTransitionEventData.applicationTransitionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfullyClosed, isFirstRun, isUpgrade, pushNotificationPayload, launchReferral, applicationTransitionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationStateTransitionEventData {\n");
    sb.append("    successfullyClosed: ").append(toIndentedString(successfullyClosed)).append("\n");
    sb.append("    isFirstRun: ").append(toIndentedString(isFirstRun)).append("\n");
    sb.append("    isUpgrade: ").append(toIndentedString(isUpgrade)).append("\n");
    sb.append("    pushNotificationPayload: ").append(toIndentedString(pushNotificationPayload)).append("\n");
    sb.append("    launchReferral: ").append(toIndentedString(launchReferral)).append("\n");
    sb.append("    applicationTransitionType: ").append(toIndentedString(applicationTransitionType)).append("\n");
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

