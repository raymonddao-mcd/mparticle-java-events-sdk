package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * PushRegistrationEventData
 */

public class PushRegistrationEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_REGISTER = "register";
  @SerializedName(SERIALIZED_NAME_REGISTER)
  private Boolean register;

  public static final String SERIALIZED_NAME_REGISTRATION_TOKEN = "registration_token";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_TOKEN)
  private String registrationToken;

  public PushRegistrationEventData register(Boolean register) {
    this.register = register;
    return this;
  }

   /**
   * Get register
   * @return register
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getRegister() {
    return register;
  }

  public void setRegister(Boolean register) {
    this.register = register;
  }

  public PushRegistrationEventData registrationToken(String registrationToken) {
    this.registrationToken = registrationToken;
    return this;
  }

   /**
   * Get registrationToken
   * @return registrationToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRegistrationToken() {
    return registrationToken;
  }

  public void setRegistrationToken(String registrationToken) {
    this.registrationToken = registrationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushRegistrationEventData pushRegistrationEventData = (PushRegistrationEventData) o;
    return Objects.equals(this.register, pushRegistrationEventData.register) &&
        Objects.equals(this.registrationToken, pushRegistrationEventData.registrationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(register, registrationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushRegistrationEventData {\n");
    sb.append("    register: ").append(toIndentedString(register)).append("\n");
    sb.append("    registrationToken: ").append(toIndentedString(registrationToken)).append("\n");
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

