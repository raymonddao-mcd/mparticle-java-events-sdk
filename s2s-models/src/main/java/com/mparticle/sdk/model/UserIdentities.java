
package com.mparticle.sdk.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserIdentities {

    @JsonProperty("customer_id")
    private String customerid;
    @JsonProperty("email")
    private String email;
    @JsonProperty("facebook")
    private String facebook;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("google")
    private String google;
    @JsonProperty("microsoft")
    private String microsoft;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("other")
    private String other;
    /**
     * 
     * @return
     *     The customerid
     */
    @JsonProperty("customerid")
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 
     * @param customerId
     *     The customerid
     */
    @JsonProperty("customerid")
    public UserIdentities setCustomerId(String customerId) {
        this.customerid = customerId;
        return this;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public UserIdentities setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 
     * @return
     *     The facebook
     */
    @JsonProperty("facebook")
    public String getFacebookId() {
        return facebook;
    }

    /**
     * 
     * @param facebookId
     *     The facebook
     */
    @JsonProperty("facebook")
    public UserIdentities setFacebookId(String facebookId) {
        this.facebook = facebookId;
        return this;
    }

    /**
     * 
     * @return
     *     The twitter
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     * 
     * @param twitterId
     *     The twitter
     */
    @JsonProperty("twitter")
    public UserIdentities setTwitterId(String twitterId) {
        this.twitter = twitterId;
        return this;
    }

    /**
     * 
     * @return
     *     The google
     */
    @JsonProperty("google")
    public String getGoogleId() {
        return google;
    }

    /**
     * 
     * @param googleId
     *     The google
     */
    @JsonProperty("google")
    public UserIdentities setGoogleId(String googleId) {
        this.google = googleId;
        return this;
    }

    /**
     * 
     * @return
     *     The microsoft
     */
    @JsonProperty("microsoft")
    public String getMicrosoftId() {
        return microsoft;
    }

    /**
     * 
     * @param microsoftId
     *     The microsoft
     */
    @JsonProperty("microsoft")
    public UserIdentities setMicrosoftId(String microsoftId) {
        this.microsoft = microsoftId;
        return this;
    }

    /**
     * 
     * @return
     *     The alias
     */
    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    /**
     * 
     * @param alias
     *     The alias
     */
    @JsonProperty("alias")
    public UserIdentities setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 
     * @return
     *     The other
     */
    @JsonProperty("other")
    public String getOther() {
        return other;
    }

    /**
     * 
     * @param otherId
     *     The other
     */
    @JsonProperty("other")
    public UserIdentities setOtherId(String otherId) {
        this.other = otherId;
        return this;
    }

}
