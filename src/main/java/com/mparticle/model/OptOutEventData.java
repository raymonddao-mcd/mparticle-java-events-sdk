package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * OptOutEventData
 */

public class OptOutEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_IS_OPTED_OUT = "is_opted_out";
  @SerializedName(SERIALIZED_NAME_IS_OPTED_OUT)
  private Boolean isOptedOut;

  public OptOutEventData isOptedOut(Boolean isOptedOut) {
    this.isOptedOut = isOptedOut;
    return this;
  }

   /**
   * Get isOptedOut
   * @return isOptedOut
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsOptedOut() {
    return isOptedOut;
  }

  public void setIsOptedOut(Boolean isOptedOut) {
    this.isOptedOut = isOptedOut;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptOutEventData optOutEventData = (OptOutEventData) o;
    return Objects.equals(this.isOptedOut, optOutEventData.isOptedOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOptedOut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptOutEventData {\n");
    sb.append("    isOptedOut: ").append(toIndentedString(isOptedOut)).append("\n");
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

