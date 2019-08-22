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
 * ProfileEventData
 */

public class ProfileEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_PREVIOUS_MPID = "previous_mpid";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_MPID)
  private Integer previousMpid;

  public static final String SERIALIZED_NAME_CURRENT_MPID = "current_mpid";
  @SerializedName(SERIALIZED_NAME_CURRENT_MPID)
  private Integer currentMpid;

  /**
   * Gets or Sets profileEventType
   */
  @JsonAdapter(ProfileEventTypeEnum.Adapter.class)
  public enum ProfileEventTypeEnum {
    SIGNUP("signup"),
    
    LOGIN("login"),
    
    LOGOUT("logout"),
    
    UPDATE("update"),
    
    DELETE("delete");

    private String value;

    ProfileEventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProfileEventTypeEnum fromValue(String value) {
      for (ProfileEventTypeEnum b : ProfileEventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProfileEventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProfileEventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProfileEventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProfileEventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROFILE_EVENT_TYPE = "profile_event_type";
  @SerializedName(SERIALIZED_NAME_PROFILE_EVENT_TYPE)
  private ProfileEventTypeEnum profileEventType;

  public ProfileEventData previousMpid(Integer previousMpid) {
    this.previousMpid = previousMpid;
    return this;
  }

   /**
   * Get previousMpid
   * @return previousMpid
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPreviousMpid() {
    return previousMpid;
  }

  public void setPreviousMpid(Integer previousMpid) {
    this.previousMpid = previousMpid;
  }

  public ProfileEventData currentMpid(Integer currentMpid) {
    this.currentMpid = currentMpid;
    return this;
  }

   /**
   * Get currentMpid
   * @return currentMpid
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCurrentMpid() {
    return currentMpid;
  }

  public void setCurrentMpid(Integer currentMpid) {
    this.currentMpid = currentMpid;
  }

  public ProfileEventData profileEventType(ProfileEventTypeEnum profileEventType) {
    this.profileEventType = profileEventType;
    return this;
  }

   /**
   * Get profileEventType
   * @return profileEventType
  **/
  @ApiModelProperty(required = true, value = "")
  public ProfileEventTypeEnum getProfileEventType() {
    return profileEventType;
  }

  public void setProfileEventType(ProfileEventTypeEnum profileEventType) {
    this.profileEventType = profileEventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileEventData profileEventData = (ProfileEventData) o;
    return Objects.equals(this.previousMpid, profileEventData.previousMpid) &&
        Objects.equals(this.currentMpid, profileEventData.currentMpid) &&
        Objects.equals(this.profileEventType, profileEventData.profileEventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousMpid, currentMpid, profileEventType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileEventData {\n");
    sb.append("    previousMpid: ").append(toIndentedString(previousMpid)).append("\n");
    sb.append("    currentMpid: ").append(toIndentedString(currentMpid)).append("\n");
    sb.append("    profileEventType: ").append(toIndentedString(profileEventType)).append("\n");
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

