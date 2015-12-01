package com.mparticle.sdk.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UploadResponse {

    @JsonProperty("errors")
    private List<Error> errors = new ArrayList<Error>();

    /**
     * 
     * @return
     *     The errors
     */
    @JsonProperty("errors")
    public List<Error> getErrors() {
        return errors;
    }

    /**
     *
     * @param errors
     *     The errors
     */
    @JsonProperty("errors")
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        if (errors != null) {
            StringBuilder builder = new StringBuilder("mParticle response errors:\n");
            for (Error error : errors) {
                builder.append(error.toString());
                builder.append("\n");
            }
            return builder.toString();
        }else {
            return "Empty Response";
        }
    }
}
