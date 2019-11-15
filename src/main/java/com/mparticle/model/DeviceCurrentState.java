package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * DeviceCurrentState
 */

public class DeviceCurrentState {
  public static final String SERIALIZED_NAME_TIME_SINCE_START_MS = "time_since_start_ms";
  @SerializedName(SERIALIZED_NAME_TIME_SINCE_START_MS)
  private Long timeSinceStartMs;

  public static final String SERIALIZED_NAME_BATTERY_LEVEL = "battery_level";
  @SerializedName(SERIALIZED_NAME_BATTERY_LEVEL)
  private BigDecimal batteryLevel;

  public static final String SERIALIZED_NAME_DATA_CONNECTION_TYPE = "data_connection_type";
  @SerializedName(SERIALIZED_NAME_DATA_CONNECTION_TYPE)
  private String dataConnectionType;

  public static final String SERIALIZED_NAME_DATA_CONNECTION_TYPE_DETAIL = "data_connection_type_detail";
  @SerializedName(SERIALIZED_NAME_DATA_CONNECTION_TYPE_DETAIL)
  private String dataConnectionTypeDetail;

  public static final String SERIALIZED_NAME_GPS_STATE = "gps_state";
  @SerializedName(SERIALIZED_NAME_GPS_STATE)
  private Boolean gpsState;

  public static final String SERIALIZED_NAME_TOTAL_SYSTEM_MEMORY_USAGE_BYTES = "total_system_memory_usage_bytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_SYSTEM_MEMORY_USAGE_BYTES)
  private Long totalSystemMemoryUsageBytes;

  public static final String SERIALIZED_NAME_DISK_SPACE_FREE_BYTES = "disk_space_free_bytes";
  @SerializedName(SERIALIZED_NAME_DISK_SPACE_FREE_BYTES)
  private Long diskSpaceFreeBytes;

  public static final String SERIALIZED_NAME_EXTERNAL_DISK_SPACE_FREE_BYTES = "external_disk_space_free_bytes";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_DISK_SPACE_FREE_BYTES)
  private Long externalDiskSpaceFreeBytes;

  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private String cpu;

  public static final String SERIALIZED_NAME_SYSTEM_MEMORY_AVAILABLE_BYTES = "system_memory_available_bytes";
  @SerializedName(SERIALIZED_NAME_SYSTEM_MEMORY_AVAILABLE_BYTES)
  private BigDecimal systemMemoryAvailableBytes;

  public static final String SERIALIZED_NAME_SYSTEM_MEMORY_LOW = "system_memory_low";
  @SerializedName(SERIALIZED_NAME_SYSTEM_MEMORY_LOW)
  private Boolean systemMemoryLow;

  public static final String SERIALIZED_NAME_SYSTEM_MEMORY_THRESHOLD_BYTES = "system_memory_threshold_bytes";
  @SerializedName(SERIALIZED_NAME_SYSTEM_MEMORY_THRESHOLD_BYTES)
  private BigDecimal systemMemoryThresholdBytes;

  public static final String SERIALIZED_NAME_APPLICATION_MEMORY_AVAILABLE_BYTES = "application_memory_available_bytes";
  @SerializedName(SERIALIZED_NAME_APPLICATION_MEMORY_AVAILABLE_BYTES)
  private BigDecimal applicationMemoryAvailableBytes;

  public static final String SERIALIZED_NAME_APPLICATION_MEMORY_MAX_BYTES = "application_memory_max_bytes";
  @SerializedName(SERIALIZED_NAME_APPLICATION_MEMORY_MAX_BYTES)
  private BigDecimal applicationMemoryMaxBytes;

  public static final String SERIALIZED_NAME_APPLICATION_MEMORY_TOTAL_BYTES = "application_memory_total_bytes";
  @SerializedName(SERIALIZED_NAME_APPLICATION_MEMORY_TOTAL_BYTES)
  private BigDecimal applicationMemoryTotalBytes;

  /**
   * Gets or Sets deviceOrientation
   */
  public enum DeviceOrientationEnum {
    PORTRAIT("portrait"),
    
    PORTRAIT_UPSIDE_DOWN("portrait_upside_down"),
    
    LANDSCAPE("landscape"),
    
    LANDSCAPELEFT("LandscapeLeft"),
    
    LANDSCAPERIGHT("LandscapeRight"),
    
    FACEUP("FaceUp"),
    
    FACEDOWN("FaceDown"),
    
    SQUARE("Square");

    private String value;

    DeviceOrientationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceOrientationEnum fromValue(String value) {
      for (DeviceOrientationEnum b : DeviceOrientationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_DEVICE_ORIENTATION = "device_orientation";
  @SerializedName(SERIALIZED_NAME_DEVICE_ORIENTATION)
  private DeviceOrientationEnum deviceOrientation;

  /**
   * Gets or Sets statusBarOrientation
   */
  public enum StatusBarOrientationEnum {
    PORTRAIT("portrait"),
    
    PORTRAIT_UPSIDE_DOWN("portrait_upside_down"),
    
    LANDSCAPE("landscape"),
    
    LANDSCAPELEFT("LandscapeLeft"),
    
    LANDSCAPERIGHT("LandscapeRight"),
    
    FACEUP("FaceUp"),
    
    FACEDOWN("FaceDown"),
    
    SQUARE("Square");

    private String value;

    StatusBarOrientationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusBarOrientationEnum fromValue(String value) {
      for (StatusBarOrientationEnum b : StatusBarOrientationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_STATUS_BAR_ORIENTATION = "status_bar_orientation";
  @SerializedName(SERIALIZED_NAME_STATUS_BAR_ORIENTATION)
  private StatusBarOrientationEnum statusBarOrientation;

  public DeviceCurrentState timeSinceStartMs(Long timeSinceStartMs) {
    this.timeSinceStartMs = timeSinceStartMs;
    return this;
  }

   /**
   * Get timeSinceStartMs
   * @return timeSinceStartMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getTimeSinceStartMs() {
    return timeSinceStartMs;
  }

  public void setTimeSinceStartMs(Long timeSinceStartMs) {
    this.timeSinceStartMs = timeSinceStartMs;
  }

  public DeviceCurrentState batteryLevel(BigDecimal batteryLevel) {
    this.batteryLevel = batteryLevel;
    return this;
  }

   /**
   * Get batteryLevel
   * @return batteryLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getBatteryLevel() {
    return batteryLevel;
  }

  public void setBatteryLevel(BigDecimal batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  public DeviceCurrentState dataConnectionType(String dataConnectionType) {
    this.dataConnectionType = dataConnectionType;
    return this;
  }

   /**
   * Get dataConnectionType
   * @return dataConnectionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDataConnectionType() {
    return dataConnectionType;
  }

  public void setDataConnectionType(String dataConnectionType) {
    this.dataConnectionType = dataConnectionType;
  }

  public DeviceCurrentState dataConnectionTypeDetail(String dataConnectionTypeDetail) {
    this.dataConnectionTypeDetail = dataConnectionTypeDetail;
    return this;
  }

   /**
   * Get dataConnectionTypeDetail
   * @return dataConnectionTypeDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDataConnectionTypeDetail() {
    return dataConnectionTypeDetail;
  }

  public void setDataConnectionTypeDetail(String dataConnectionTypeDetail) {
    this.dataConnectionTypeDetail = dataConnectionTypeDetail;
  }

  public DeviceCurrentState gpsState(Boolean gpsState) {
    this.gpsState = gpsState;
    return this;
  }

   /**
   * Get gpsState
   * @return gpsState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getGpsState() {
    return gpsState;
  }

  public void setGpsState(Boolean gpsState) {
    this.gpsState = gpsState;
  }

  public DeviceCurrentState totalSystemMemoryUsageBytes(Long totalSystemMemoryUsageBytes) {
    this.totalSystemMemoryUsageBytes = totalSystemMemoryUsageBytes;
    return this;
  }

   /**
   * Get totalSystemMemoryUsageBytes
   * @return totalSystemMemoryUsageBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getTotalSystemMemoryUsageBytes() {
    return totalSystemMemoryUsageBytes;
  }

  public void setTotalSystemMemoryUsageBytes(Long totalSystemMemoryUsageBytes) {
    this.totalSystemMemoryUsageBytes = totalSystemMemoryUsageBytes;
  }

  public DeviceCurrentState diskSpaceFreeBytes(Long diskSpaceFreeBytes) {
    this.diskSpaceFreeBytes = diskSpaceFreeBytes;
    return this;
  }

   /**
   * Get diskSpaceFreeBytes
   * @return diskSpaceFreeBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getDiskSpaceFreeBytes() {
    return diskSpaceFreeBytes;
  }

  public void setDiskSpaceFreeBytes(Long diskSpaceFreeBytes) {
    this.diskSpaceFreeBytes = diskSpaceFreeBytes;
  }

  public DeviceCurrentState externalDiskSpaceFreeBytes(Long externalDiskSpaceFreeBytes) {
    this.externalDiskSpaceFreeBytes = externalDiskSpaceFreeBytes;
    return this;
  }

   /**
   * Get externalDiskSpaceFreeBytes
   * @return externalDiskSpaceFreeBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getExternalDiskSpaceFreeBytes() {
    return externalDiskSpaceFreeBytes;
  }

  public void setExternalDiskSpaceFreeBytes(Long externalDiskSpaceFreeBytes) {
    this.externalDiskSpaceFreeBytes = externalDiskSpaceFreeBytes;
  }

  public DeviceCurrentState cpu(String cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public DeviceCurrentState systemMemoryAvailableBytes(BigDecimal systemMemoryAvailableBytes) {
    this.systemMemoryAvailableBytes = systemMemoryAvailableBytes;
    return this;
  }

   /**
   * Get systemMemoryAvailableBytes
   * @return systemMemoryAvailableBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getSystemMemoryAvailableBytes() {
    return systemMemoryAvailableBytes;
  }

  public void setSystemMemoryAvailableBytes(BigDecimal systemMemoryAvailableBytes) {
    this.systemMemoryAvailableBytes = systemMemoryAvailableBytes;
  }

  public DeviceCurrentState systemMemoryLow(Boolean systemMemoryLow) {
    this.systemMemoryLow = systemMemoryLow;
    return this;
  }

   /**
   * Get systemMemoryLow
   * @return systemMemoryLow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getSystemMemoryLow() {
    return systemMemoryLow;
  }

  public void setSystemMemoryLow(Boolean systemMemoryLow) {
    this.systemMemoryLow = systemMemoryLow;
  }

  public DeviceCurrentState systemMemoryThresholdBytes(BigDecimal systemMemoryThresholdBytes) {
    this.systemMemoryThresholdBytes = systemMemoryThresholdBytes;
    return this;
  }

   /**
   * Get systemMemoryThresholdBytes
   * @return systemMemoryThresholdBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getSystemMemoryThresholdBytes() {
    return systemMemoryThresholdBytes;
  }

  public void setSystemMemoryThresholdBytes(BigDecimal systemMemoryThresholdBytes) {
    this.systemMemoryThresholdBytes = systemMemoryThresholdBytes;
  }

  public DeviceCurrentState applicationMemoryAvailableBytes(BigDecimal applicationMemoryAvailableBytes) {
    this.applicationMemoryAvailableBytes = applicationMemoryAvailableBytes;
    return this;
  }

   /**
   * Get applicationMemoryAvailableBytes
   * @return applicationMemoryAvailableBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getApplicationMemoryAvailableBytes() {
    return applicationMemoryAvailableBytes;
  }

  public void setApplicationMemoryAvailableBytes(BigDecimal applicationMemoryAvailableBytes) {
    this.applicationMemoryAvailableBytes = applicationMemoryAvailableBytes;
  }

  public DeviceCurrentState applicationMemoryMaxBytes(BigDecimal applicationMemoryMaxBytes) {
    this.applicationMemoryMaxBytes = applicationMemoryMaxBytes;
    return this;
  }

   /**
   * Get applicationMemoryMaxBytes
   * @return applicationMemoryMaxBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getApplicationMemoryMaxBytes() {
    return applicationMemoryMaxBytes;
  }

  public void setApplicationMemoryMaxBytes(BigDecimal applicationMemoryMaxBytes) {
    this.applicationMemoryMaxBytes = applicationMemoryMaxBytes;
  }

  public DeviceCurrentState applicationMemoryTotalBytes(BigDecimal applicationMemoryTotalBytes) {
    this.applicationMemoryTotalBytes = applicationMemoryTotalBytes;
    return this;
  }

   /**
   * Get applicationMemoryTotalBytes
   * @return applicationMemoryTotalBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getApplicationMemoryTotalBytes() {
    return applicationMemoryTotalBytes;
  }

  public void setApplicationMemoryTotalBytes(BigDecimal applicationMemoryTotalBytes) {
    this.applicationMemoryTotalBytes = applicationMemoryTotalBytes;
  }

  public DeviceCurrentState deviceOrientation(DeviceOrientationEnum deviceOrientation) {
    this.deviceOrientation = deviceOrientation;
    return this;
  }

   /**
   * Get deviceOrientation
   * @return deviceOrientation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public DeviceOrientationEnum getDeviceOrientation() {
    return deviceOrientation;
  }

  public void setDeviceOrientation(DeviceOrientationEnum deviceOrientation) {
    this.deviceOrientation = deviceOrientation;
  }

  public DeviceCurrentState statusBarOrientation(StatusBarOrientationEnum statusBarOrientation) {
    this.statusBarOrientation = statusBarOrientation;
    return this;
  }

   /**
   * Get statusBarOrientation
   * @return statusBarOrientation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public StatusBarOrientationEnum getStatusBarOrientation() {
    return statusBarOrientation;
  }

  public void setStatusBarOrientation(StatusBarOrientationEnum statusBarOrientation) {
    this.statusBarOrientation = statusBarOrientation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceCurrentState deviceCurrentState = (DeviceCurrentState) o;
    return Objects.equals(this.timeSinceStartMs, deviceCurrentState.timeSinceStartMs) &&
        Objects.equals(this.batteryLevel, deviceCurrentState.batteryLevel) &&
        Objects.equals(this.dataConnectionType, deviceCurrentState.dataConnectionType) &&
        Objects.equals(this.dataConnectionTypeDetail, deviceCurrentState.dataConnectionTypeDetail) &&
        Objects.equals(this.gpsState, deviceCurrentState.gpsState) &&
        Objects.equals(this.totalSystemMemoryUsageBytes, deviceCurrentState.totalSystemMemoryUsageBytes) &&
        Objects.equals(this.diskSpaceFreeBytes, deviceCurrentState.diskSpaceFreeBytes) &&
        Objects.equals(this.externalDiskSpaceFreeBytes, deviceCurrentState.externalDiskSpaceFreeBytes) &&
        Objects.equals(this.cpu, deviceCurrentState.cpu) &&
        Objects.equals(this.systemMemoryAvailableBytes, deviceCurrentState.systemMemoryAvailableBytes) &&
        Objects.equals(this.systemMemoryLow, deviceCurrentState.systemMemoryLow) &&
        Objects.equals(this.systemMemoryThresholdBytes, deviceCurrentState.systemMemoryThresholdBytes) &&
        Objects.equals(this.applicationMemoryAvailableBytes, deviceCurrentState.applicationMemoryAvailableBytes) &&
        Objects.equals(this.applicationMemoryMaxBytes, deviceCurrentState.applicationMemoryMaxBytes) &&
        Objects.equals(this.applicationMemoryTotalBytes, deviceCurrentState.applicationMemoryTotalBytes) &&
        Objects.equals(this.deviceOrientation, deviceCurrentState.deviceOrientation) &&
        Objects.equals(this.statusBarOrientation, deviceCurrentState.statusBarOrientation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSinceStartMs, batteryLevel, dataConnectionType, dataConnectionTypeDetail, gpsState, totalSystemMemoryUsageBytes, diskSpaceFreeBytes, externalDiskSpaceFreeBytes, cpu, systemMemoryAvailableBytes, systemMemoryLow, systemMemoryThresholdBytes, applicationMemoryAvailableBytes, applicationMemoryMaxBytes, applicationMemoryTotalBytes, deviceOrientation, statusBarOrientation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceCurrentState {\n");
    sb.append("    timeSinceStartMs: ").append(toIndentedString(timeSinceStartMs)).append("\n");
    sb.append("    batteryLevel: ").append(toIndentedString(batteryLevel)).append("\n");
    sb.append("    dataConnectionType: ").append(toIndentedString(dataConnectionType)).append("\n");
    sb.append("    dataConnectionTypeDetail: ").append(toIndentedString(dataConnectionTypeDetail)).append("\n");
    sb.append("    gpsState: ").append(toIndentedString(gpsState)).append("\n");
    sb.append("    totalSystemMemoryUsageBytes: ").append(toIndentedString(totalSystemMemoryUsageBytes)).append("\n");
    sb.append("    diskSpaceFreeBytes: ").append(toIndentedString(diskSpaceFreeBytes)).append("\n");
    sb.append("    externalDiskSpaceFreeBytes: ").append(toIndentedString(externalDiskSpaceFreeBytes)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    systemMemoryAvailableBytes: ").append(toIndentedString(systemMemoryAvailableBytes)).append("\n");
    sb.append("    systemMemoryLow: ").append(toIndentedString(systemMemoryLow)).append("\n");
    sb.append("    systemMemoryThresholdBytes: ").append(toIndentedString(systemMemoryThresholdBytes)).append("\n");
    sb.append("    applicationMemoryAvailableBytes: ").append(toIndentedString(applicationMemoryAvailableBytes)).append("\n");
    sb.append("    applicationMemoryMaxBytes: ").append(toIndentedString(applicationMemoryMaxBytes)).append("\n");
    sb.append("    applicationMemoryTotalBytes: ").append(toIndentedString(applicationMemoryTotalBytes)).append("\n");
    sb.append("    deviceOrientation: ").append(toIndentedString(deviceOrientation)).append("\n");
    sb.append("    statusBarOrientation: ").append(toIndentedString(statusBarOrientation)).append("\n");
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

