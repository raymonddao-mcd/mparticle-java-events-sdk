
package com.mparticle.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Message {

    @JsonProperty("application_transition_type")
    protected String applicationTransitionType;
    @JsonProperty("event_id")
    protected Double eventId;
    @JsonProperty("session_uuid")
    protected String sessionUuid;
    @JsonProperty("timestamp_unixtime_ms")
    protected Double timestamp;
    @JsonProperty("location")
    protected Location location;
    @JsonProperty("device_current_state")
    protected DeviceCurrentState deviceCurrentState;
    @JsonProperty("source_message_id")
    protected String sourceMessageId;

    /**
     * 
     * @return
     *     The eventId
     */
    @JsonProperty("event_id")
    public Double getEventId() {
        return eventId;
    }

    /**
     * 
     * @param eventId
     *     The event_id
     */
    @JsonProperty("event_id")
    public Message setEventId(Double eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 
     * @return
     *     The sessionUuid
     */
    @JsonProperty("session_uuid")
    public String getSessionUuid() {
        return sessionUuid;
    }

    /**
     * 
     * @param sessionUuid
     *     The session_uuid
     */
    @JsonProperty("session_uuid")
    public Message setSessionUuid(String sessionUuid) {
        this.sessionUuid = sessionUuid;
        return this;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    @JsonProperty("timestamp_unixtime_ms")
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp_unixtime_ms
     */
    @JsonProperty("timestamp_unixtime_ms")
    public Message setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public Message setLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * @return
     *     The deviceCurrentState
     */
    @JsonProperty("device_current_state")
    public DeviceCurrentState getDeviceCurrentState() {
        return deviceCurrentState;
    }

    /**
     * 
     * @param deviceCurrentState
     *     The device_current_state
     */
    @JsonProperty("device_current_state")
    public Message setDeviceCurrentState(DeviceCurrentState deviceCurrentState) {
        this.deviceCurrentState = deviceCurrentState;
        return this;
    }

    /**
     *
     * @return
     *     The sourceMessageId
     */
    @JsonProperty("source_message_id")
    public String getSourceMessageId() {
        return sourceMessageId;
    }

    /**
     *
     * @param sourceMessageId
     *     The source_message_id
     */
    @JsonProperty("source_message_id")
    public Message setSourceMessageId(String sourceMessageId) {
        this.sourceMessageId = sourceMessageId;
        return this;
    }

    @JsonIgnore
    public abstract String getMessageType();
}
