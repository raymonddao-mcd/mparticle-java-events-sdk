
package com.mparticle.sdk.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mparticle.sdk.model.Constants;
import com.mparticle.sdk.model.Message;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StateTransitionMessage extends Message {

    @JsonProperty("application_transition_type")
    private String applicationTransitionType;

    /**
     * 
     * @return
     *     The applicationTransitionType
     */
    @JsonProperty("application_transition_type")
    public String getApplicationTransitionType() {
        return applicationTransitionType;
    }

    /**
     * 
     * @param applicationTransitionType
     *     The application_transition_type
     */
    @JsonProperty("application_transition_type")
    public StateTransitionMessage setApplicationTransitionType(String applicationTransitionType) {
        this.applicationTransitionType = applicationTransitionType;
        return this;
    }

    @Override
    public String getMessageType() {
        return Constants.MessageTypes.STATE_TRANSITION;
    }
}
