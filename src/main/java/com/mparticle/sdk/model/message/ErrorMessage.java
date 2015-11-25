
package com.mparticle.sdk.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mparticle.sdk.model.Constants;
import com.mparticle.sdk.model.Message;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessage extends Message {

    @JsonProperty("class_name")
    private String className;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("message")
    private String message;
    @JsonProperty("stack_trace")
    private String stackTrace;
    @JsonProperty("topmost_context")
    private String topmostContext;
    @JsonProperty("pl_crash_report_file_base64")
    private String plCrashReportFileBase64;
    @JsonProperty("ios_image_base_address")
    private Integer iosImageBaseAddress;
    @JsonProperty("ios_image_size")
    private Integer iosImageSize;

    /**
     * 
     * @return
     *     The className
     */
    @JsonProperty("class_name")
    public String getClassName() {
        return className;
    }

    /**
     * 
     * @param className
     *     The class_name
     */
    @JsonProperty("class_name")
    public ErrorMessage setClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * 
     * @return
     *     The severity
     */
    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    /**
     * 
     * @param severity
     *     The severity
     */
    @JsonProperty("severity")
    public ErrorMessage setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public ErrorMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 
     * @return
     *     The stackTrace
     */
    @JsonProperty("stack_trace")
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * 
     * @param stackTrace
     *     The stack_trace
     */
    @JsonProperty("stack_trace")
    public ErrorMessage setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    /**
     * 
     * @return
     *     The topmostContext
     */
    @JsonProperty("topmost_context")
    public String getTopmostContext() {
        return topmostContext;
    }

    /**
     * 
     * @param topmostContext
     *     The topmost_context
     */
    @JsonProperty("topmost_context")
    public ErrorMessage setTopmostContext(String topmostContext) {
        this.topmostContext = topmostContext;
        return this;
    }

    /**
     * 
     * @return
     *     The plCrashReportFileBase64
     */
    @JsonProperty("pl_crash_report_file_base64")
    public String getPlCrashReportFileBase64() {
        return plCrashReportFileBase64;
    }

    /**
     * 
     * @param plCrashReportFileBase64
     *     The pl_crash_report_file_base64
     */
    @JsonProperty("pl_crash_report_file_base64")
    public ErrorMessage setPlCrashReportFileBase64(String plCrashReportFileBase64) {
        this.plCrashReportFileBase64 = plCrashReportFileBase64;
        return this;
    }

    /**
     * 
     * @return
     *     The iosImageBaseAddress
     */
    @JsonProperty("ios_image_base_address")
    public Integer getIosImageBaseAddress() {
        return iosImageBaseAddress;
    }

    /**
     * 
     * @param iosImageBaseAddress
     *     The ios_image_base_address
     */
    @JsonProperty("ios_image_base_address")
    public ErrorMessage setIosImageBaseAddress(Integer iosImageBaseAddress) {
        this.iosImageBaseAddress = iosImageBaseAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The iosImageSize
     */
    @JsonProperty("ios_image_size")
    public Integer getIosImageSize() {
        return iosImageSize;
    }

    /**
     * 
     * @param iosImageSize
     *     The ios_image_size
     */
    @JsonProperty("ios_image_size")
    public ErrorMessage setIosImageSize(Integer iosImageSize) {
        this.iosImageSize = iosImageSize;
        return this;
    }

    @Override
    public String getMessageType() {
        return Constants.MessageTypes.ERROR;
    }
}
