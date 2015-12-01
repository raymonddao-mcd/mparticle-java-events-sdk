package com.mparticle.sdk.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {

    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;

    /**
     * @return The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (code != null) {
            builder.append("code: " + code + " ");
        }
        if (message != null) {
            builder.append("message: " + message + " ");
        }
        return builder.toString();
    }
}
