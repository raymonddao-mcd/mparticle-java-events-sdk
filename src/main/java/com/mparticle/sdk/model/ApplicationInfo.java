package com.mparticle.sdk.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationInfo {

    @JsonProperty("application_name")
    private String applicationName;
    @JsonProperty("application_version")
    private String applicationVersion;
    @JsonProperty("install_referrer")
    private String installReferrer;
    @JsonProperty("package")
    private String _package;

    /**
     * 
     * @return
     *     The applicationName
     */
    @JsonProperty("application_name")
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * 
     * @param applicationName
     *     The application_name
     */
    @JsonProperty("application_name")
    public ApplicationInfo setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * 
     * @return
     *     The applicationVersion
     */
    @JsonProperty("application_version")
    public String getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * 
     * @param applicationVersion
     *     The application_version
     */
    @JsonProperty("application_version")
    public ApplicationInfo setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }

    /**
     * 
     * @retur
     *     The installReferrer
     */
    @JsonProperty("install_referrer")
    public String getInstallReferrer() {
        return installReferrer;
    }

    /**
     * 
     * @param installReferrer
     *     The install_referrer
     */
    @JsonProperty("install_referrer")
    public ApplicationInfo setInstallReferrer(String installReferrer) {
        this.installReferrer = installReferrer;
        return this;
    }

    /**
     * 
     * @return
     *     The _package
     */
    @JsonProperty("package")
    public String getPackage() {
        return _package;
    }

    /**
     * 
     * @param _package
     *     The package
     */
    @JsonProperty("package")
    public ApplicationInfo setPackage(String _package) {
        this._package = _package;
        return this;
    }
}
