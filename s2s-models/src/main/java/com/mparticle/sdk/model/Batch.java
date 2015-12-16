package com.mparticle.sdk.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mparticle.sdk.model.message.MessageWrapper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Batch {

    public static final String ENVIRONMENT_DEVELOPMENT = "development";
    public static final String ENVIRONMENT_PRODUCTION = "production";

    private Batch(){}

    private Batch(Builder builder) {
        apiKey = builder.apiKey;
        if (builder.developmentMode == null) {
            throw new IllegalStateException("Must specify development mode");
        }else if (builder.developmentMode) {
            this.environment = ENVIRONMENT_DEVELOPMENT;
        }else {
            this.environment = ENVIRONMENT_PRODUCTION;
        }
        this.apiKey = builder.apiKey;
        this.schemaVersion = builder.schemaVersion;

        this.deviceInfo = builder.deviceInfo;
        this.applicationInfo = builder.applicationInfo;
        this.userAttributes = builder.userAttributes;
        this.deletedUserAttributes = builder.deletedUserAttributes;
        this.userIdentities = builder.userIdentities;

        for (Message message : builder.messages) {
            this.events.add(
                    new MessageWrapper()
                            .setData(message)
                            .setMessageType(message.getMessageType())
            );
        }
    }

    @JsonProperty("schema_version")
    private Integer schemaVersion;
    @JsonProperty("environment")
    private String environment;
    @JsonProperty("device_info")
    private DeviceInfo deviceInfo;
    @JsonProperty("application_info")
    private ApplicationInfo applicationInfo;
    @JsonProperty("user_attributes")
    private Map<String, String> userAttributes;
    @JsonProperty("deleted_user_attributes")
    private List<String> deletedUserAttributes = new ArrayList<String>();
    @JsonProperty("user_identities")
    private UserIdentities userIdentities;
    @JsonProperty("events")
    private List<MessageWrapper> events = new LinkedList<>();
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * 
     * @return
     *     The schemaVersion
     */
    @JsonProperty("schema_version")
    public Integer getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * 
     * @return
     *     The environment
     */
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     * 
     * @return
     *     The deviceInfo
     */
    @JsonProperty("device_info")
    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * 
     * @return
     *     The applicationInfo
     */
    @JsonProperty("application_info")
    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    /**
     * 
     * @return
     *     The userAttributes
     */
    @JsonProperty("user_attributes")
    public Map<String, String> getUserAttributes() {
        return userAttributes;
    }

    /**
     * 
     * @return
     *     The deletedUserAttributes
     */
    @JsonProperty("deleted_user_attributes")
    public List<String> getDeletedUserAttributes() {
        return deletedUserAttributes;
    }

    /**
     * 
     * @return
     *     The userIdentities
     */
    @JsonProperty("user_identities")
    public UserIdentities getUserIdentities() {
        return userIdentities;
    }

    /**
     * 
     * @return
     *     The messages
     */
    @JsonProperty("events")
    public List<MessageWrapper> getEvents() {
        return events;
    }

    public static class Builder {

        private String apiKey;
        private Integer schemaVersion;
        private DeviceInfo deviceInfo;
        private ApplicationInfo applicationInfo;
        private Map<String, String> userAttributes;
        private List<String> deletedUserAttributes = new ArrayList<String>();
        private UserIdentities userIdentities;
        private List<Message> messages = new ArrayList<Message>();
        private Boolean developmentMode;

        private Builder(){}
        public Builder(String apiKey) {
            if (apiKey == null || apiKey.trim().length() < 1) {
                throw new IllegalArgumentException("Must specify API key");
            }
            this.apiKey = apiKey;
        }

        /**
         *
         * @return
         *     The schemaVersion
         */
        public Integer getSchemaVersion() {
            return schemaVersion;
        }

        /**
         *
         * @param schemaVersion
         *     The schema_version
         */
        public Builder schemaVersion(Integer schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         *
         * @return
         *     The environment
         */
        public Boolean getDevelopmentMode() {
            return this.developmentMode;
        }

        /**
         *
         * @param developmentMode
         *     The environment
         */
        public Builder developmentMode(Boolean developmentMode) {
            this.developmentMode = developmentMode;
            return this;
        }

        /**
         *
         * @return
         *     The deviceInfo
         */
        public DeviceInfo getDeviceInfo() {
            return deviceInfo;
        }

        /**
         *
         * @param deviceInfo
         *     The device_info
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         *
         * @return
         *     The applicationInfo
         */
        public ApplicationInfo getApplicationInfo() {
            return applicationInfo;
        }

        /**
         *
         * @param applicationInfo
         *     The application_info
         */
        public Builder applicationInfo(ApplicationInfo applicationInfo) {
            this.applicationInfo = applicationInfo;
            return this;
        }

        /**
         *
         * @return
         *     The userAttributes
         */
        public Map<String, String> getUserAttributes() {
            return userAttributes;
        }

        /**
         *
         * @param userAttributes
         *     The user_attributes
         */
        public Builder userAttributes(Map<String, String> userAttributes) {
            this.userAttributes = userAttributes;
            return this;
        }

        /**
         *
         * @return
         *     The deletedUserAttributes
         */
        public List<String> getDeletedUserAttributes() {
            return deletedUserAttributes;
        }

        /**
         *
         * @param deletedUserAttributes
         *     The deleted_user_attributes
         */
        public Builder deletedUserAttributes(List<String> deletedUserAttributes) {
            this.deletedUserAttributes = deletedUserAttributes;
            return this;
        }

        /**
         *
         * @return
         *     The userIdentities
         */
        public UserIdentities getUserIdentities() {
            return userIdentities;
        }

        /**
         *
         * @param userIdentities
         *     The user_identities
         */
        public Builder userIdentities(UserIdentities userIdentities) {
            this.userIdentities = userIdentities;
            return this;
        }

        /**
         *
         * @return
         *     The messages
         */
        public List<Message> getMessages() {
            return messages;
        }

        /**
         *
         * @param messages
         *     The messages
         */
        public Builder events(List<Message> messages) {
            this.messages = messages;
            return this;
        }

        public Batch build() {
            return new Batch(this);
        }
    }
}
