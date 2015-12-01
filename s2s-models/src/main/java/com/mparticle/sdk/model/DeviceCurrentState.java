
package com.mparticle.sdk.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceCurrentState {

    @JsonProperty("cpu")
    private String cpu;
    @JsonProperty("system_memory_available_Bytes")
    private Double systemMemoryAvailableBytes;
    @JsonProperty("total_system_memory_usage_bytes")
    private Integer totalSystemMemoryUsageBytes;
    @JsonProperty("system_memory_low")
    private Boolean systemMemoryLow;
    @JsonProperty("system_memory_threshold_bytes")
    private Integer systemMemoryThresholdBytes;
    @JsonProperty("application_memory_available_bytes")
    private Integer applicationMemoryAvailableBytes;
    @JsonProperty("application_memory_max_bytes")
    private Integer applicationMemoryMaxBytes;
    @JsonProperty("application_memory_total_bytes")
    private Double applicationMemoryTotalBytes;
    @JsonProperty("device_orientation")
    private String deviceOrientation;
    @JsonProperty("status_bar_orientation")
    private String statusBarOrientation;
    @JsonProperty("time_since_start_ms")
    private Integer timeSinceStartMs;
    @JsonProperty("battery_level")
    private Double batteryLevel;
    @JsonProperty("data_connection_type")
    private String dataConnectionType;
    @JsonProperty("data_connection_type_detail")
    private String dataConnectionTypeDetail;
    @JsonProperty("gps_state")
    private Boolean gpsState;
    @JsonProperty("disk_space_free_bytes")
    private Integer diskSpaceFreeBytes;
    @JsonProperty("external_disk_space_free_bytes")
    private Integer externalDiskSpaceFreeBytes;

    /**
     * 
     * @return
     *     The cpu
     */
    @JsonProperty("cpu")
    public String getCpu() {
        return cpu;
    }

    /**
     * 
     * @param cpu
     *     The cpu
     */
    @JsonProperty("cpu")
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * 
     * @return
     *     The systemMemoryAvailableBytes
     */
    @JsonProperty("system_memory_available_Bytes")
    public Double getSystemMemoryAvailableBytes() {
        return systemMemoryAvailableBytes;
    }

    /**
     * 
     * @param systemMemoryAvailableBytes
     *     The system_memory_available_Bytes
     */
    @JsonProperty("system_memory_available_Bytes")
    public void setSystemMemoryAvailableBytes(Double systemMemoryAvailableBytes) {
        this.systemMemoryAvailableBytes = systemMemoryAvailableBytes;
    }

    /**
     * 
     * @return
     *     The totalSystemMemoryUsageBytes
     */
    @JsonProperty("total_system_memory_usage_bytes")
    public Integer getTotalSystemMemoryUsageBytes() {
        return totalSystemMemoryUsageBytes;
    }

    /**
     * 
     * @param totalSystemMemoryUsageBytes
     *     The total_system_memory_usage_bytes
     */
    @JsonProperty("total_system_memory_usage_bytes")
    public void setTotalSystemMemoryUsageBytes(Integer totalSystemMemoryUsageBytes) {
        this.totalSystemMemoryUsageBytes = totalSystemMemoryUsageBytes;
    }

    /**
     * 
     * @return
     *     The systemMemoryLow
     */
    @JsonProperty("system_memory_low")
    public Boolean getSystemMemoryLow() {
        return systemMemoryLow;
    }

    /**
     * 
     * @param systemMemoryLow
     *     The system_memory_low
     */
    @JsonProperty("system_memory_low")
    public void setSystemMemoryLow(Boolean systemMemoryLow) {
        this.systemMemoryLow = systemMemoryLow;
    }

    /**
     * 
     * @return
     *     The systemMemoryThresholdBytes
     */
    @JsonProperty("system_memory_threshold_bytes")
    public Integer getSystemMemoryThresholdBytes() {
        return systemMemoryThresholdBytes;
    }

    /**
     * 
     * @param systemMemoryThresholdBytes
     *     The system_memory_threshold_bytes
     */
    @JsonProperty("system_memory_threshold_bytes")
    public void setSystemMemoryThresholdBytes(Integer systemMemoryThresholdBytes) {
        this.systemMemoryThresholdBytes = systemMemoryThresholdBytes;
    }

    /**
     * 
     * @return
     *     The applicationMemoryAvailableBytes
     */
    @JsonProperty("application_memory_available_bytes")
    public Integer getApplicationMemoryAvailableBytes() {
        return applicationMemoryAvailableBytes;
    }

    /**
     * 
     * @param applicationMemoryAvailableBytes
     *     The application_memory_available_bytes
     */
    @JsonProperty("application_memory_available_bytes")
    public void setApplicationMemoryAvailableBytes(Integer applicationMemoryAvailableBytes) {
        this.applicationMemoryAvailableBytes = applicationMemoryAvailableBytes;
    }

    /**
     * 
     * @return
     *     The applicationMemoryMaxBytes
     */
    @JsonProperty("application_memory_max_bytes")
    public Integer getApplicationMemoryMaxBytes() {
        return applicationMemoryMaxBytes;
    }

    /**
     * 
     * @param applicationMemoryMaxBytes
     *     The application_memory_max_bytes
     */
    @JsonProperty("application_memory_max_bytes")
    public void setApplicationMemoryMaxBytes(Integer applicationMemoryMaxBytes) {
        this.applicationMemoryMaxBytes = applicationMemoryMaxBytes;
    }

    /**
     * 
     * @return
     *     The applicationMemoryTotalBytes
     */
    @JsonProperty("application_memory_total_bytes")
    public Double getApplicationMemoryTotalBytes() {
        return applicationMemoryTotalBytes;
    }

    /**
     * 
     * @param applicationMemoryTotalBytes
     *     The application_memory_total_bytes
     */
    @JsonProperty("application_memory_total_bytes")
    public void setApplicationMemoryTotalBytes(Double applicationMemoryTotalBytes) {
        this.applicationMemoryTotalBytes = applicationMemoryTotalBytes;
    }

    /**
     * 
     * @return
     *     The deviceOrientation
     */
    @JsonProperty("device_orientation")
    public String getDeviceOrientation() {
        return deviceOrientation;
    }

    /**
     * 
     * @param deviceOrientation
     *     The device_orientation
     */
    @JsonProperty("device_orientation")
    public void setDeviceOrientation(String deviceOrientation) {
        this.deviceOrientation = deviceOrientation;
    }

    /**
     * 
     * @return
     *     The statusBarOrientation
     */
    @JsonProperty("status_bar_orientation")
    public String getStatusBarOrientation() {
        return statusBarOrientation;
    }

    /**
     * 
     * @param statusBarOrientation
     *     The status_bar_orientation
     */
    @JsonProperty("status_bar_orientation")
    public void setStatusBarOrientation(String statusBarOrientation) {
        this.statusBarOrientation = statusBarOrientation;
    }

    /**
     * 
     * @return
     *     The timeSinceStartMs
     */
    @JsonProperty("time_since_start_ms")
    public Integer getTimeSinceStartMs() {
        return timeSinceStartMs;
    }

    /**
     * 
     * @param timeSinceStartMs
     *     The time_since_start_ms
     */
    @JsonProperty("time_since_start_ms")
    public void setTimeSinceStartMs(Integer timeSinceStartMs) {
        this.timeSinceStartMs = timeSinceStartMs;
    }

    /**
     * 
     * @return
     *     The batteryLevel
     */
    @JsonProperty("battery_level")
    public Double getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * 
     * @param batteryLevel
     *     The battery_level
     */
    @JsonProperty("battery_level")
    public void setBatteryLevel(Double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * 
     * @return
     *     The dataConnectionType
     */
    @JsonProperty("data_connection_type")
    public String getDataConnectionType() {
        return dataConnectionType;
    }

    /**
     * 
     * @param dataConnectionType
     *     The data_connection_type
     */
    @JsonProperty("data_connection_type")
    public void setDataConnectionType(String dataConnectionType) {
        this.dataConnectionType = dataConnectionType;
    }

    /**
     * 
     * @return
     *     The dataConnectionTypeDetail
     */
    @JsonProperty("data_connection_type_detail")
    public String getDataConnectionTypeDetail() {
        return dataConnectionTypeDetail;
    }

    /**
     * 
     * @param dataConnectionTypeDetail
     *     The data_connection_type_detail
     */
    @JsonProperty("data_connection_type_detail")
    public void setDataConnectionTypeDetail(String dataConnectionTypeDetail) {
        this.dataConnectionTypeDetail = dataConnectionTypeDetail;
    }

    /**
     * 
     * @return
     *     The gpsState
     */
    @JsonProperty("gps_state")
    public Boolean getGpsState() {
        return gpsState;
    }

    /**
     * 
     * @param gpsState
     *     The gps_state
     */
    @JsonProperty("gps_state")
    public void setGpsState(Boolean gpsState) {
        this.gpsState = gpsState;
    }

    /**
     * 
     * @return
     *     The diskSpaceFreeBytes
     */
    @JsonProperty("disk_space_free_bytes")
    public Integer getDiskSpaceFreeBytes() {
        return diskSpaceFreeBytes;
    }

    /**
     * 
     * @param diskSpaceFreeBytes
     *     The disk_space_free_bytes
     */
    @JsonProperty("disk_space_free_bytes")
    public void setDiskSpaceFreeBytes(Integer diskSpaceFreeBytes) {
        this.diskSpaceFreeBytes = diskSpaceFreeBytes;
    }

    /**
     * 
     * @return
     *     The externalDiskSpaceFreeBytes
     */
    @JsonProperty("external_disk_space_free_bytes")
    public Integer getExternalDiskSpaceFreeBytes() {
        return externalDiskSpaceFreeBytes;
    }

    /**
     * 
     * @param externalDiskSpaceFreeBytes
     *     The external_disk_space_free_bytes
     */
    @JsonProperty("external_disk_space_free_bytes")
    public void setExternalDiskSpaceFreeBytes(Integer externalDiskSpaceFreeBytes) {
        this.externalDiskSpaceFreeBytes = externalDiskSpaceFreeBytes;
    }

}
