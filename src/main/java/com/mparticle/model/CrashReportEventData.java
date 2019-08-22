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
import java.util.ArrayList;
import java.util.List;

/**
 * CrashReportEventData
 */

public class CrashReportEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_BREADCRUMBS = "breadcrumbs";
  @SerializedName(SERIALIZED_NAME_BREADCRUMBS)
  private List<String> breadcrumbs = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CLASS_NAME = "class_name";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STACK_TRACE = "stack_trace";
  @SerializedName(SERIALIZED_NAME_STACK_TRACE)
  private String stackTrace;

  public static final String SERIALIZED_NAME_EXCEPTION_HANDLED = "exception_handled";
  @SerializedName(SERIALIZED_NAME_EXCEPTION_HANDLED)
  private Boolean exceptionHandled;

  public static final String SERIALIZED_NAME_TOPMOST_CONTEXT = "topmost_context";
  @SerializedName(SERIALIZED_NAME_TOPMOST_CONTEXT)
  private String topmostContext;

  public static final String SERIALIZED_NAME_PL_CRASH_REPORT_FILE_BASE64 = "pl_crash_report_file_base64";
  @SerializedName(SERIALIZED_NAME_PL_CRASH_REPORT_FILE_BASE64)
  private String plCrashReportFileBase64;

  public static final String SERIALIZED_NAME_IOS_IMAGE_BASE_ADDRESS = "ios_image_base_address";
  @SerializedName(SERIALIZED_NAME_IOS_IMAGE_BASE_ADDRESS)
  private Integer iosImageBaseAddress;

  public static final String SERIALIZED_NAME_IOS_IMAGE_SIZE = "ios_image_size";
  @SerializedName(SERIALIZED_NAME_IOS_IMAGE_SIZE)
  private Integer iosImageSize;

  public static final String SERIALIZED_NAME_SESSION_NUMBER = "session_number";
  @SerializedName(SERIALIZED_NAME_SESSION_NUMBER)
  private Integer sessionNumber;

  public CrashReportEventData breadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
    return this;
  }

  public CrashReportEventData addBreadcrumbsItem(String breadcrumbsItem) {
    if (this.breadcrumbs == null) {
      this.breadcrumbs = new ArrayList<String>();
    }
    this.breadcrumbs.add(breadcrumbsItem);
    return this;
  }

   /**
   * Get breadcrumbs
   * @return breadcrumbs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getBreadcrumbs() {
    return breadcrumbs;
  }

  public void setBreadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
  }

  public CrashReportEventData className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public CrashReportEventData severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public CrashReportEventData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CrashReportEventData stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public CrashReportEventData exceptionHandled(Boolean exceptionHandled) {
    this.exceptionHandled = exceptionHandled;
    return this;
  }

   /**
   * Get exceptionHandled
   * @return exceptionHandled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getExceptionHandled() {
    return exceptionHandled;
  }

  public void setExceptionHandled(Boolean exceptionHandled) {
    this.exceptionHandled = exceptionHandled;
  }

  public CrashReportEventData topmostContext(String topmostContext) {
    this.topmostContext = topmostContext;
    return this;
  }

   /**
   * Get topmostContext
   * @return topmostContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getTopmostContext() {
    return topmostContext;
  }

  public void setTopmostContext(String topmostContext) {
    this.topmostContext = topmostContext;
  }

  public CrashReportEventData plCrashReportFileBase64(String plCrashReportFileBase64) {
    this.plCrashReportFileBase64 = plCrashReportFileBase64;
    return this;
  }

   /**
   * Get plCrashReportFileBase64
   * @return plCrashReportFileBase64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPlCrashReportFileBase64() {
    return plCrashReportFileBase64;
  }

  public void setPlCrashReportFileBase64(String plCrashReportFileBase64) {
    this.plCrashReportFileBase64 = plCrashReportFileBase64;
  }

  public CrashReportEventData iosImageBaseAddress(Integer iosImageBaseAddress) {
    this.iosImageBaseAddress = iosImageBaseAddress;
    return this;
  }

   /**
   * Get iosImageBaseAddress
   * @return iosImageBaseAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getIosImageBaseAddress() {
    return iosImageBaseAddress;
  }

  public void setIosImageBaseAddress(Integer iosImageBaseAddress) {
    this.iosImageBaseAddress = iosImageBaseAddress;
  }

  public CrashReportEventData iosImageSize(Integer iosImageSize) {
    this.iosImageSize = iosImageSize;
    return this;
  }

   /**
   * Get iosImageSize
   * @return iosImageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getIosImageSize() {
    return iosImageSize;
  }

  public void setIosImageSize(Integer iosImageSize) {
    this.iosImageSize = iosImageSize;
  }

  public CrashReportEventData sessionNumber(Integer sessionNumber) {
    this.sessionNumber = sessionNumber;
    return this;
  }

   /**
   * Get sessionNumber
   * @return sessionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getSessionNumber() {
    return sessionNumber;
  }

  public void setSessionNumber(Integer sessionNumber) {
    this.sessionNumber = sessionNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrashReportEventData crashReportEventData = (CrashReportEventData) o;
    return Objects.equals(this.breadcrumbs, crashReportEventData.breadcrumbs) &&
        Objects.equals(this.className, crashReportEventData.className) &&
        Objects.equals(this.severity, crashReportEventData.severity) &&
        Objects.equals(this.message, crashReportEventData.message) &&
        Objects.equals(this.stackTrace, crashReportEventData.stackTrace) &&
        Objects.equals(this.exceptionHandled, crashReportEventData.exceptionHandled) &&
        Objects.equals(this.topmostContext, crashReportEventData.topmostContext) &&
        Objects.equals(this.plCrashReportFileBase64, crashReportEventData.plCrashReportFileBase64) &&
        Objects.equals(this.iosImageBaseAddress, crashReportEventData.iosImageBaseAddress) &&
        Objects.equals(this.iosImageSize, crashReportEventData.iosImageSize) &&
        Objects.equals(this.sessionNumber, crashReportEventData.sessionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breadcrumbs, className, severity, message, stackTrace, exceptionHandled, topmostContext, plCrashReportFileBase64, iosImageBaseAddress, iosImageSize, sessionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrashReportEventData {\n");
    sb.append("    breadcrumbs: ").append(toIndentedString(breadcrumbs)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    exceptionHandled: ").append(toIndentedString(exceptionHandled)).append("\n");
    sb.append("    topmostContext: ").append(toIndentedString(topmostContext)).append("\n");
    sb.append("    plCrashReportFileBase64: ").append(toIndentedString(plCrashReportFileBase64)).append("\n");
    sb.append("    iosImageBaseAddress: ").append(toIndentedString(iosImageBaseAddress)).append("\n");
    sb.append("    iosImageSize: ").append(toIndentedString(iosImageSize)).append("\n");
    sb.append("    sessionNumber: ").append(toIndentedString(sessionNumber)).append("\n");
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

