package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ProfileEventData
 */

public class ProfileEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_PREVIOUS_MPID = "previous_mpid";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_MPID)
  private Long previousMpid;

  public static final String SERIALIZED_NAME_CURRENT_MPID = "current_mpid";
  @SerializedName(SERIALIZED_NAME_CURRENT_MPID)
  private Long currentMpid;

  /**
   * Gets or Sets profileEventType
   */
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
  }

  public static final String SERIALIZED_NAME_PROFILE_EVENT_TYPE = "profile_event_type";
  @SerializedName(SERIALIZED_NAME_PROFILE_EVENT_TYPE)
  private ProfileEventTypeEnum profileEventType;

  public ProfileEventData previousMpid(Long previousMpid) {
    this.previousMpid = previousMpid;
    return this;
  }

   /**
   * Get previousMpid
   * @return previousMpid
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getPreviousMpid() {
    return previousMpid;
  }

  public void setPreviousMpid(Long previousMpid) {
    this.previousMpid = previousMpid;
  }

  public ProfileEventData currentMpid(Long currentMpid) {
    this.currentMpid = currentMpid;
    return this;
  }

   /**
   * Get currentMpid
   * @return currentMpid
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCurrentMpid() {
    return currentMpid;
  }

  public void setCurrentMpid(Long currentMpid) {
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

