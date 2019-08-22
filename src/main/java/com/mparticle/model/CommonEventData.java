package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CommonEventData
 */

public class CommonEventData {
  public static final String SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS = "timestamp_unixtime_ms";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS)
  private Integer timestampUnixtimeMs;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public static final String SERIALIZED_NAME_SOURCE_MESSAGE_ID = "source_message_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_MESSAGE_ID)
  private String sourceMessageId;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private Long sessionId;

  public static final String SERIALIZED_NAME_SESSION_UUID = "session_uuid";
  @SerializedName(SERIALIZED_NAME_SESSION_UUID)
  private String sessionUuid;

  public static final String SERIALIZED_NAME_SESSION_START_UNIXTIME_MS = "session_start_unixtime_ms";
  @SerializedName(SERIALIZED_NAME_SESSION_START_UNIXTIME_MS)
  private Integer sessionStartUnixtimeMs;

  public static final String SERIALIZED_NAME_EVENT_START_UNIXTIME_MS = "event_start_unixtime_ms";
  @SerializedName(SERIALIZED_NAME_EVENT_START_UNIXTIME_MS)
  private Integer eventStartUnixtimeMs;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "custom_attributes";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private Map<String, String> customAttributes = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private GeoLocation location = null;

  public static final String SERIALIZED_NAME_DEVICE_CURRENT_STATE = "device_current_state";
  @SerializedName(SERIALIZED_NAME_DEVICE_CURRENT_STATE)
  private DeviceCurrentState deviceCurrentState = null;

  public static final String SERIALIZED_NAME_IS_GOAL_DEFINED = "is_goal_defined";
  @SerializedName(SERIALIZED_NAME_IS_GOAL_DEFINED)
  private Boolean isGoalDefined;

  public static final String SERIALIZED_NAME_LIFETIME_VALUE_CHANGE = "lifetime_value_change";
  @SerializedName(SERIALIZED_NAME_LIFETIME_VALUE_CHANGE)
  private Boolean lifetimeValueChange;

  public static final String SERIALIZED_NAME_LIFETIME_VALUE_ATTRIBUTE_NAME = "lifetime_value_attribute_name";
  @SerializedName(SERIALIZED_NAME_LIFETIME_VALUE_ATTRIBUTE_NAME)
  private String lifetimeValueAttributeName;

  public static final String SERIALIZED_NAME_DATA_CONNECTION_TYPE = "data_connection_type";
  @SerializedName(SERIALIZED_NAME_DATA_CONNECTION_TYPE)
  private String dataConnectionType;

  public static final String SERIALIZED_NAME_EVENT_NUM = "event_num";
  @SerializedName(SERIALIZED_NAME_EVENT_NUM)
  private Integer eventNum;

  public static final String SERIALIZED_NAME_VIEW_CONTROLLER = "view_controller";
  @SerializedName(SERIALIZED_NAME_VIEW_CONTROLLER)
  private String viewController;

  public static final String SERIALIZED_NAME_IS_MAIN_THREAD = "is_main_thread";
  @SerializedName(SERIALIZED_NAME_IS_MAIN_THREAD)
  private Boolean isMainThread;

  public static final String SERIALIZED_NAME_CANONICAL_NAME = "canonical_name";
  @SerializedName(SERIALIZED_NAME_CANONICAL_NAME)
  private String canonicalName;

  public static final String SERIALIZED_NAME_EVENT_SYSTEM_NOTIFICATION_INFO = "event_system_notification_info";
  @SerializedName(SERIALIZED_NAME_EVENT_SYSTEM_NOTIFICATION_INFO)
  private EventSystemNotificationInfo eventSystemNotificationInfo = null;

  public CommonEventData timestampUnixtimeMs(Integer timestampUnixtimeMs) {
    this.timestampUnixtimeMs = timestampUnixtimeMs;
    return this;
  }

  /**
   * Get timestampUnixtimeMs
   * @return timestampUnixtimeMs
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getTimestampUnixtimeMs() {
    return timestampUnixtimeMs;
  }

  public void setTimestampUnixtimeMs(Integer timestampUnixtimeMs) {
    this.timestampUnixtimeMs = timestampUnixtimeMs;
  }

  /**
   * Get eventId
   * @return eventId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getEventId() {
    return eventId;
  }

  public CommonEventData sourceMessageId(String sourceMessageId) {
    this.sourceMessageId = sourceMessageId;
    return this;
  }

  /**
   * Get sourceMessageId
   * @return sourceMessageId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getSourceMessageId() {
    return sourceMessageId;
  }

  public void setSourceMessageId(String sourceMessageId) {
    this.sourceMessageId = sourceMessageId;
  }

  public CommonEventData sessionId(Long sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getSessionId() {
    return sessionId;
  }

  public void setSessionId(Long sessionId) {
    this.sessionId = sessionId;
  }

  public CommonEventData sessionUuid(String sessionUuid) {
    this.sessionUuid = sessionUuid;
    return this;
  }

  /**
   * Get sessionUuid
   * @return sessionUuid
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getSessionUuid() {
    return sessionUuid;
  }

  public void setSessionUuid(String sessionUuid) {
    this.sessionUuid = sessionUuid;
  }

  public CommonEventData sessionStartUnixtimeMs(Integer sessionStartUnixtimeMs) {
    this.sessionStartUnixtimeMs = sessionStartUnixtimeMs;
    return this;
  }

  /**
   * Get sessionStartUnixtimeMs
   * @return sessionStartUnixtimeMs
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getSessionStartUnixtimeMs() {
    return sessionStartUnixtimeMs;
  }

  public void setSessionStartUnixtimeMs(Integer sessionStartUnixtimeMs) {
    this.sessionStartUnixtimeMs = sessionStartUnixtimeMs;
  }

  public CommonEventData eventStartUnixtimeMs(Integer eventStartUnixtimeMs) {
    this.eventStartUnixtimeMs = eventStartUnixtimeMs;
    return this;
  }

  /**
   * Get eventStartUnixtimeMs
   * @return eventStartUnixtimeMs
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getEventStartUnixtimeMs() {
    return eventStartUnixtimeMs;
  }

  public void setEventStartUnixtimeMs(Integer eventStartUnixtimeMs) {
    this.eventStartUnixtimeMs = eventStartUnixtimeMs;
  }

  public CommonEventData customAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public CommonEventData putCustomAttributesItem(String key, String customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new HashMap<String, String>();
    }
    this.customAttributes.put(key, customAttributesItem);
    return this;
  }

  /**
   * Get customAttributes
   * @return customAttributes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, String> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public CommonEventData location(GeoLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public GeoLocation getLocation() {
    return location;
  }

  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  public CommonEventData deviceCurrentState(DeviceCurrentState deviceCurrentState) {
    this.deviceCurrentState = deviceCurrentState;
    return this;
  }

  /**
   * Get deviceCurrentState
   * @return deviceCurrentState
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public DeviceCurrentState getDeviceCurrentState() {
    return deviceCurrentState;
  }

  public void setDeviceCurrentState(DeviceCurrentState deviceCurrentState) {
    this.deviceCurrentState = deviceCurrentState;
  }

  public CommonEventData isGoalDefined(Boolean isGoalDefined) {
    this.isGoalDefined = isGoalDefined;
    return this;
  }

  /**
   * Get isGoalDefined
   * @return isGoalDefined
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getIsGoalDefined() {
    return isGoalDefined;
  }

  public void setIsGoalDefined(Boolean isGoalDefined) {
    this.isGoalDefined = isGoalDefined;
  }

  public CommonEventData lifetimeValueChange(Boolean lifetimeValueChange) {
    this.lifetimeValueChange = lifetimeValueChange;
    return this;
  }

  /**
   * Get lifetimeValueChange
   * @return lifetimeValueChange
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getLifetimeValueChange() {
    return lifetimeValueChange;
  }

  public void setLifetimeValueChange(Boolean lifetimeValueChange) {
    this.lifetimeValueChange = lifetimeValueChange;
  }

  public CommonEventData lifetimeValueAttributeName(String lifetimeValueAttributeName) {
    this.lifetimeValueAttributeName = lifetimeValueAttributeName;
    return this;
  }

  /**
   * Get lifetimeValueAttributeName
   * @return lifetimeValueAttributeName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getLifetimeValueAttributeName() {
    return lifetimeValueAttributeName;
  }

  public void setLifetimeValueAttributeName(String lifetimeValueAttributeName) {
    this.lifetimeValueAttributeName = lifetimeValueAttributeName;
  }

  public CommonEventData dataConnectionType(String dataConnectionType) {
    this.dataConnectionType = dataConnectionType;
    return this;
  }

  /**
   * Get dataConnectionType
   * @return dataConnectionType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDataConnectionType() {
    return dataConnectionType;
  }

  public void setDataConnectionType(String dataConnectionType) {
    this.dataConnectionType = dataConnectionType;
  }

  public CommonEventData eventNum(Integer eventNum) {
    this.eventNum = eventNum;
    return this;
  }

  /**
   * Get eventNum
   * @return eventNum
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getEventNum() {
    return eventNum;
  }

  public void setEventNum(Integer eventNum) {
    this.eventNum = eventNum;
  }

  public CommonEventData viewController(String viewController) {
    this.viewController = viewController;
    return this;
  }

  /**
   * Get viewController
   * @return viewController
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getViewController() {
    return viewController;
  }

  public void setViewController(String viewController) {
    this.viewController = viewController;
  }

  public CommonEventData isMainThread(Boolean isMainThread) {
    this.isMainThread = isMainThread;
    return this;
  }

  /**
   * Get isMainThread
   * @return isMainThread
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getIsMainThread() {
    return isMainThread;
  }

  public void setIsMainThread(Boolean isMainThread) {
    this.isMainThread = isMainThread;
  }

  public CommonEventData canonicalName(String canonicalName) {
    this.canonicalName = canonicalName;
    return this;
  }

  /**
   * Get canonicalName
   * @return canonicalName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getCanonicalName() {
    return canonicalName;
  }

  public void setCanonicalName(String canonicalName) {
    this.canonicalName = canonicalName;
  }

  public CommonEventData eventSystemNotificationInfo(EventSystemNotificationInfo eventSystemNotificationInfo) {
    this.eventSystemNotificationInfo = eventSystemNotificationInfo;
    return this;
  }

  /**
   * Get eventSystemNotificationInfo
   * @return eventSystemNotificationInfo
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public EventSystemNotificationInfo getEventSystemNotificationInfo() {
    return eventSystemNotificationInfo;
  }

  public void setEventSystemNotificationInfo(EventSystemNotificationInfo eventSystemNotificationInfo) {
    this.eventSystemNotificationInfo = eventSystemNotificationInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonEventData commonEventData = (CommonEventData) o;
    return Objects.equals(this.timestampUnixtimeMs, commonEventData.timestampUnixtimeMs) &&
            Objects.equals(this.eventId, commonEventData.eventId) &&
            Objects.equals(this.sourceMessageId, commonEventData.sourceMessageId) &&
            Objects.equals(this.sessionId, commonEventData.sessionId) &&
            Objects.equals(this.sessionUuid, commonEventData.sessionUuid) &&
            Objects.equals(this.sessionStartUnixtimeMs, commonEventData.sessionStartUnixtimeMs) &&
            Objects.equals(this.eventStartUnixtimeMs, commonEventData.eventStartUnixtimeMs) &&
            Objects.equals(this.customAttributes, commonEventData.customAttributes) &&
            Objects.equals(this.location, commonEventData.location) &&
            Objects.equals(this.deviceCurrentState, commonEventData.deviceCurrentState) &&
            Objects.equals(this.isGoalDefined, commonEventData.isGoalDefined) &&
            Objects.equals(this.lifetimeValueChange, commonEventData.lifetimeValueChange) &&
            Objects.equals(this.lifetimeValueAttributeName, commonEventData.lifetimeValueAttributeName) &&
            Objects.equals(this.dataConnectionType, commonEventData.dataConnectionType) &&
            Objects.equals(this.eventNum, commonEventData.eventNum) &&
            Objects.equals(this.viewController, commonEventData.viewController) &&
            Objects.equals(this.isMainThread, commonEventData.isMainThread) &&
            Objects.equals(this.canonicalName, commonEventData.canonicalName) &&
            Objects.equals(this.eventSystemNotificationInfo, commonEventData.eventSystemNotificationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampUnixtimeMs, eventId, sourceMessageId, sessionId, sessionUuid, sessionStartUnixtimeMs, eventStartUnixtimeMs, customAttributes, location, deviceCurrentState, isGoalDefined, lifetimeValueChange, lifetimeValueAttributeName, dataConnectionType, eventNum, viewController, isMainThread, canonicalName, eventSystemNotificationInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonEventData {\n");
    sb.append("    timestampUnixtimeMs: ").append(toIndentedString(timestampUnixtimeMs)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    sourceMessageId: ").append(toIndentedString(sourceMessageId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionUuid: ").append(toIndentedString(sessionUuid)).append("\n");
    sb.append("    sessionStartUnixtimeMs: ").append(toIndentedString(sessionStartUnixtimeMs)).append("\n");
    sb.append("    eventStartUnixtimeMs: ").append(toIndentedString(eventStartUnixtimeMs)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    deviceCurrentState: ").append(toIndentedString(deviceCurrentState)).append("\n");
    sb.append("    isGoalDefined: ").append(toIndentedString(isGoalDefined)).append("\n");
    sb.append("    lifetimeValueChange: ").append(toIndentedString(lifetimeValueChange)).append("\n");
    sb.append("    lifetimeValueAttributeName: ").append(toIndentedString(lifetimeValueAttributeName)).append("\n");
    sb.append("    dataConnectionType: ").append(toIndentedString(dataConnectionType)).append("\n");
    sb.append("    eventNum: ").append(toIndentedString(eventNum)).append("\n");
    sb.append("    viewController: ").append(toIndentedString(viewController)).append("\n");
    sb.append("    isMainThread: ").append(toIndentedString(isMainThread)).append("\n");
    sb.append("    canonicalName: ").append(toIndentedString(canonicalName)).append("\n");
    sb.append("    eventSystemNotificationInfo: ").append(toIndentedString(eventSystemNotificationInfo)).append("\n");
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