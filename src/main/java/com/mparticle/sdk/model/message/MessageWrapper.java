
package com.mparticle.sdk.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mparticle.sdk.model.Message;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageWrapper {

    @JsonProperty("data")
    private Message data;
    @JsonProperty("event_type")
    private String messageType;

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public Message getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public MessageWrapper setData(Message data) {
        this.data = data;
        return this;
    }

    /**
     * 
     * @return
     *     The eventType
     */
    @JsonProperty("event_type")
    public String getMessageType() {
        return messageType;
    }

    /**
     * 
     * @param messageType
     *     The event_type
     */
    @JsonProperty("event_type")
    public MessageWrapper setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

}
