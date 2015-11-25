
package com.mparticle.sdk.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mparticle.sdk.model.Constants;
import com.mparticle.sdk.model.Message;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionEndMessage extends Message {

    @JsonProperty("session_duration_ms")
    private Double sessionDurationMs;
    @JsonProperty("source_message_id")
    private String sourceMessageId;

    /**
     * 
     * @return
     *     The sessionDurationMs
     */
    @JsonProperty("session_duration_ms")
    public Double getSessionDurationMs() {
        return sessionDurationMs;
    }

    /**
     * 
     * @param sessionDurationMs
     *     The session_duration_ms
     */
    @JsonProperty("session_duration_ms")
    public SessionEndMessage setSessionDurationMs(Double sessionDurationMs) {
        this.sessionDurationMs = sessionDurationMs;
        return this;
    }

    @Override
    public String getMessageType() {
        return Constants.MessageTypes.SESSION_END;
    }
}
