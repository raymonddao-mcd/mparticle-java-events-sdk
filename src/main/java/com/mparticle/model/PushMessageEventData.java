package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * PushMessageEventData
 */

public class PushMessageEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_PUSH_MESSAGE_TOKEN = "push_message_token";
  @SerializedName(SERIALIZED_NAME_PUSH_MESSAGE_TOKEN)
  private String pushMessageToken;

  /**
   * Gets or Sets pushMessageType
   */
  public enum PushMessageTypeEnum {
    SENT("sent"),
    
    RECEIVED("received"),
    
    ACTION("action");

    private String value;

    PushMessageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PushMessageTypeEnum fromValue(String value) {
      for (PushMessageTypeEnum b : PushMessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_PUSH_MESSAGE_TYPE = "push_message_type";
  @SerializedName(SERIALIZED_NAME_PUSH_MESSAGE_TYPE)
  private PushMessageTypeEnum pushMessageType;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_PUSH_NOTIFICATION_PAYLOAD = "push_notification_payload";
  @SerializedName(SERIALIZED_NAME_PUSH_NOTIFICATION_PAYLOAD)
  private String pushNotificationPayload;

  /**
   * Gets or Sets applicationState
   */
  public enum ApplicationStateEnum {
    NOT_RUNNING("not_running"),
    
    BACKGROUND("background"),
    
    FOREGROUND("foreground");

    private String value;

    ApplicationStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicationStateEnum fromValue(String value) {
      for (ApplicationStateEnum b : ApplicationStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_APPLICATION_STATE = "application_state";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STATE)
  private ApplicationStateEnum applicationState;

  public static final String SERIALIZED_NAME_ACTION_IDENTIFIER = "action_identifier";
  @SerializedName(SERIALIZED_NAME_ACTION_IDENTIFIER)
  private String actionIdentifier;

  /**
   * Gets or Sets pushMessageBehavior
   */
  public enum PushMessageBehaviorEnum {
    RECEIVED("Received"),
    
    DIRECTOPEN("DirectOpen"),
    
    READ("Read"),
    
    INFLUENCEDOPEN("InfluencedOpen"),
    
    DISPLAYED("Displayed");

    private String value;

    PushMessageBehaviorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PushMessageBehaviorEnum fromValue(String value) {
      for (PushMessageBehaviorEnum b : PushMessageBehaviorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_PUSH_MESSAGE_BEHAVIOR = "push_message_behavior";
  @SerializedName(SERIALIZED_NAME_PUSH_MESSAGE_BEHAVIOR)
  private PushMessageBehaviorEnum pushMessageBehavior;

  public PushMessageEventData pushMessageToken(String pushMessageToken) {
    this.pushMessageToken = pushMessageToken;
    return this;
  }

   /**
   * Get pushMessageToken
   * @return pushMessageToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPushMessageToken() {
    return pushMessageToken;
  }

  public void setPushMessageToken(String pushMessageToken) {
    this.pushMessageToken = pushMessageToken;
  }

  public PushMessageEventData pushMessageType(PushMessageTypeEnum pushMessageType) {
    this.pushMessageType = pushMessageType;
    return this;
  }

   /**
   * Get pushMessageType
   * @return pushMessageType
  **/
  @ApiModelProperty(required = true, value = "")
  public PushMessageTypeEnum getPushMessageType() {
    return pushMessageType;
  }

  public void setPushMessageType(PushMessageTypeEnum pushMessageType) {
    this.pushMessageType = pushMessageType;
  }

  public PushMessageEventData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PushMessageEventData network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public PushMessageEventData pushNotificationPayload(String pushNotificationPayload) {
    this.pushNotificationPayload = pushNotificationPayload;
    return this;
  }

   /**
   * Get pushNotificationPayload
   * @return pushNotificationPayload
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPushNotificationPayload() {
    return pushNotificationPayload;
  }

  public void setPushNotificationPayload(String pushNotificationPayload) {
    this.pushNotificationPayload = pushNotificationPayload;
  }

  public PushMessageEventData applicationState(ApplicationStateEnum applicationState) {
    this.applicationState = applicationState;
    return this;
  }

   /**
   * Get applicationState
   * @return applicationState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApplicationStateEnum getApplicationState() {
    return applicationState;
  }

  public void setApplicationState(ApplicationStateEnum applicationState) {
    this.applicationState = applicationState;
  }

  public PushMessageEventData actionIdentifier(String actionIdentifier) {
    this.actionIdentifier = actionIdentifier;
    return this;
  }

   /**
   * Get actionIdentifier
   * @return actionIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getActionIdentifier() {
    return actionIdentifier;
  }

  public void setActionIdentifier(String actionIdentifier) {
    this.actionIdentifier = actionIdentifier;
  }

  public PushMessageEventData pushMessageBehavior(PushMessageBehaviorEnum pushMessageBehavior) {
    this.pushMessageBehavior = pushMessageBehavior;
    return this;
  }

   /**
   * Get pushMessageBehavior
   * @return pushMessageBehavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public PushMessageBehaviorEnum getPushMessageBehavior() {
    return pushMessageBehavior;
  }

  public void setPushMessageBehavior(PushMessageBehaviorEnum pushMessageBehavior) {
    this.pushMessageBehavior = pushMessageBehavior;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushMessageEventData pushMessageEventData = (PushMessageEventData) o;
    return Objects.equals(this.pushMessageToken, pushMessageEventData.pushMessageToken) &&
        Objects.equals(this.pushMessageType, pushMessageEventData.pushMessageType) &&
        Objects.equals(this.message, pushMessageEventData.message) &&
        Objects.equals(this.network, pushMessageEventData.network) &&
        Objects.equals(this.pushNotificationPayload, pushMessageEventData.pushNotificationPayload) &&
        Objects.equals(this.applicationState, pushMessageEventData.applicationState) &&
        Objects.equals(this.actionIdentifier, pushMessageEventData.actionIdentifier) &&
        Objects.equals(this.pushMessageBehavior, pushMessageEventData.pushMessageBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushMessageToken, pushMessageType, message, network, pushNotificationPayload, applicationState, actionIdentifier, pushMessageBehavior);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushMessageEventData {\n");
    sb.append("    pushMessageToken: ").append(toIndentedString(pushMessageToken)).append("\n");
    sb.append("    pushMessageType: ").append(toIndentedString(pushMessageType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    pushNotificationPayload: ").append(toIndentedString(pushNotificationPayload)).append("\n");
    sb.append("    applicationState: ").append(toIndentedString(applicationState)).append("\n");
    sb.append("    actionIdentifier: ").append(toIndentedString(actionIdentifier)).append("\n");
    sb.append("    pushMessageBehavior: ").append(toIndentedString(pushMessageBehavior)).append("\n");
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

