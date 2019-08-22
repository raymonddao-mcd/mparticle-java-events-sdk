package com.mparticle.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ApplicationInformation
 */

public class ApplicationInformation {
  public static final String SERIALIZED_NAME_APPLICATION_NAME = "application_name";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_APPLICATION_VERSION = "application_version";
  @SerializedName(SERIALIZED_NAME_APPLICATION_VERSION)
  private String applicationVersion;

  public static final String SERIALIZED_NAME_APPLICATION_BUILD_NUMBER = "application_build_number";
  @SerializedName(SERIALIZED_NAME_APPLICATION_BUILD_NUMBER)
  private String applicationBuildNumber;

  public static final String SERIALIZED_NAME_INSTALL_REFERRER = "install_referrer";
  @SerializedName(SERIALIZED_NAME_INSTALL_REFERRER)
  private String installReferrer;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private String _package;

  /**
   * Gets or Sets os
   */
  @JsonAdapter(OsEnum.Adapter.class)
  public enum OsEnum {
    UNKNOWN("Unknown"),
    
    IOS("IOS"),
    
    ANDROID("Android"),
    
    WINDOWSPHONE("WindowsPhone"),
    
    MOBILEWEB("MobileWeb"),
    
    UNITYIOS("UnityIOS"),
    
    UNITYANDROID("UnityAndroid"),
    
    DESKTOP("Desktop"),
    
    TVOS("TVOS"),
    
    ROKU("Roku"),
    
    OUTOFBAND("OutOfBand"),
    
    ALEXA("Alexa"),
    
    SMARTTV("SmartTV"),
    
    FIRETV("FireTV"),
    
    XBOX("Xbox");

    private String value;

    OsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OsEnum fromValue(String value) {
      for (OsEnum b : OsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private OsEnum os = OsEnum.UNKNOWN;

  public static final String SERIALIZED_NAME_APPLE_SEARCH_ADS_ATTRIBUTES = "apple_search_ads_attributes";
  @SerializedName(SERIALIZED_NAME_APPLE_SEARCH_ADS_ATTRIBUTES)
  private Map<String, Map<String, String>> appleSearchAdsAttributes = new HashMap<String, Map<String, String>>();

  public ApplicationInformation applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public ApplicationInformation applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Get applicationVersion
   * @return applicationVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public ApplicationInformation applicationBuildNumber(String applicationBuildNumber) {
    this.applicationBuildNumber = applicationBuildNumber;
    return this;
  }

   /**
   * Get applicationBuildNumber
   * @return applicationBuildNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getApplicationBuildNumber() {
    return applicationBuildNumber;
  }

  public void setApplicationBuildNumber(String applicationBuildNumber) {
    this.applicationBuildNumber = applicationBuildNumber;
  }

  public ApplicationInformation installReferrer(String installReferrer) {
    this.installReferrer = installReferrer;
    return this;
  }

   /**
   * Get installReferrer
   * @return installReferrer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getInstallReferrer() {
    return installReferrer;
  }

  public void setInstallReferrer(String installReferrer) {
    this.installReferrer = installReferrer;
  }

  public ApplicationInformation _package(String _package) {
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPackage() {
    return _package;
  }

  public void setPackage(String _package) {
    this._package = _package;
  }

  public ApplicationInformation os(OsEnum os) {
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public OsEnum getOs() {
    return os;
  }

  public void setOs(OsEnum os) {
    this.os = os;
  }

  public ApplicationInformation appleSearchAdsAttributes(Map<String, Map<String, String>> appleSearchAdsAttributes) {
    this.appleSearchAdsAttributes = appleSearchAdsAttributes;
    return this;
  }

  public ApplicationInformation putAppleSearchAdsAttributesItem(String key, Map<String, String> appleSearchAdsAttributesItem) {
    if (this.appleSearchAdsAttributes == null) {
      this.appleSearchAdsAttributes = new HashMap<String, Map<String, String>>();
    }
    this.appleSearchAdsAttributes.put(key, appleSearchAdsAttributesItem);
    return this;
  }

   /**
   * Get appleSearchAdsAttributes
   * @return appleSearchAdsAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, Map<String, String>> getAppleSearchAdsAttributes() {
    return appleSearchAdsAttributes;
  }

  public void setAppleSearchAdsAttributes(Map<String, Map<String, String>> appleSearchAdsAttributes) {
    this.appleSearchAdsAttributes = appleSearchAdsAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationInformation applicationInformation = (ApplicationInformation) o;
    return Objects.equals(this.applicationName, applicationInformation.applicationName) &&
        Objects.equals(this.applicationVersion, applicationInformation.applicationVersion) &&
        Objects.equals(this.applicationBuildNumber, applicationInformation.applicationBuildNumber) &&
        Objects.equals(this.installReferrer, applicationInformation.installReferrer) &&
        Objects.equals(this._package, applicationInformation._package) &&
        Objects.equals(this.os, applicationInformation.os) &&
        Objects.equals(this.appleSearchAdsAttributes, applicationInformation.appleSearchAdsAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, applicationVersion, applicationBuildNumber, installReferrer, _package, os, appleSearchAdsAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationInformation {\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    applicationBuildNumber: ").append(toIndentedString(applicationBuildNumber)).append("\n");
    sb.append("    installReferrer: ").append(toIndentedString(installReferrer)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    appleSearchAdsAttributes: ").append(toIndentedString(appleSearchAdsAttributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

