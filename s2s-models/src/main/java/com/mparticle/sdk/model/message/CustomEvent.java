package com.mparticle.sdk.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mparticle.sdk.model.Constants;
import com.mparticle.sdk.model.Message;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomEvent extends Message {

    @JsonProperty("event_name")
    private String eventName;
    @JsonProperty("custom_event_type")
    private String customEventType = CustomEventType.OTHER.toString();
    @JsonProperty("custom_attributes")
    private Map<String, String> customAttributes;

    private CustomEvent(){}
    public CustomEvent(String eventName) {
        super();
        setEventName(eventName);
    }

    /**
     * 
     * @return
     *     The eventName
     */
    @JsonProperty("event_name")
    public String getEventName() {
        return eventName;
    }

    /**
     * 
     * @param eventName
     *     The event_name
     */
    @JsonProperty("event_name")
    public CustomEvent setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 
     * @return
     *     The customEventType
     */
    @JsonProperty("custom_event_type")
    public CustomEventType getCustomEventType() {
        return CustomEventType.valueOf(customEventType);
    }

    /**
     * 
     * @param customAttributes
     *     The customAttributes
     */
    @JsonProperty("custom_attributes")
    public CustomEvent setCustomAttributes(Map<String, String> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    /**
     *
     * @return
     *     The customEventType
     */
    @JsonProperty("custom_attributes")
    public Map<String, String> getCustomAttributes() {
        return customAttributes;
    }

    /**
     *
     * @param customEventType
     *     The custom_event_type
     */
    @JsonProperty("custom_event_type")
    public CustomEvent setCustomEventType(CustomEventType customEventType) {
        this.customEventType = customEventType.toString();
        return this;
    }

    @Override
    public String getMessageType() {
        return Constants.MessageTypes.CUSTOM_EVENT;
    }
}
