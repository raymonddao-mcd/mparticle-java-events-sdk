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

/**
 * SourceInformation
 */

public class SourceInformation {
  /**
   * Gets or Sets channel
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    NATIVE("native"),
    
    JAVASCRIPT("javascript"),
    
    PIXEL("pixel"),
    
    DESKTOP("desktop"),
    
    PARTNER("partner"),
    
    SERVER_TO_SERVER("server_to_server");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel;

  public static final String SERIALIZED_NAME_PARTNER = "partner";
  @SerializedName(SERIALIZED_NAME_PARTNER)
  private String partner;

  public static final String SERIALIZED_NAME_REPLAY_REQUEST_ID = "replay_request_id";
  @SerializedName(SERIALIZED_NAME_REPLAY_REQUEST_ID)
  private String replayRequestId;

  public static final String SERIALIZED_NAME_REPLAY_JOB_ID = "replay_job_id";
  @SerializedName(SERIALIZED_NAME_REPLAY_JOB_ID)
  private String replayJobId;

  public static final String SERIALIZED_NAME_IS_HISTORICAL = "is_historical";
  @SerializedName(SERIALIZED_NAME_IS_HISTORICAL)
  private Boolean isHistorical;

  public SourceInformation channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ChannelEnum getChannel() {
    return channel;
  }

  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }

  public SourceInformation partner(String partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }

  public SourceInformation replayRequestId(String replayRequestId) {
    this.replayRequestId = replayRequestId;
    return this;
  }

   /**
   * Get replayRequestId
   * @return replayRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getReplayRequestId() {
    return replayRequestId;
  }

  public void setReplayRequestId(String replayRequestId) {
    this.replayRequestId = replayRequestId;
  }

  public SourceInformation replayJobId(String replayJobId) {
    this.replayJobId = replayJobId;
    return this;
  }

   /**
   * Get replayJobId
   * @return replayJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getReplayJobId() {
    return replayJobId;
  }

  public void setReplayJobId(String replayJobId) {
    this.replayJobId = replayJobId;
  }

  public SourceInformation isHistorical(Boolean isHistorical) {
    this.isHistorical = isHistorical;
    return this;
  }

   /**
   * Get isHistorical
   * @return isHistorical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getIsHistorical() {
    return isHistorical;
  }

  public void setIsHistorical(Boolean isHistorical) {
    this.isHistorical = isHistorical;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceInformation sourceInformation = (SourceInformation) o;
    return Objects.equals(this.channel, sourceInformation.channel) &&
        Objects.equals(this.partner, sourceInformation.partner) &&
        Objects.equals(this.replayRequestId, sourceInformation.replayRequestId) &&
        Objects.equals(this.replayJobId, sourceInformation.replayJobId) &&
        Objects.equals(this.isHistorical, sourceInformation.isHistorical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, partner, replayRequestId, replayJobId, isHistorical);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceInformation {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    replayRequestId: ").append(toIndentedString(replayRequestId)).append("\n");
    sb.append("    replayJobId: ").append(toIndentedString(replayJobId)).append("\n");
    sb.append("    isHistorical: ").append(toIndentedString(isHistorical)).append("\n");
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

