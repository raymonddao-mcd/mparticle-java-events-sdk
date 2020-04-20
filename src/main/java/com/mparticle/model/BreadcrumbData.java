package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * BreadcrumbData
 */

public class BreadcrumbData {
  public static final String SERIALIZED_NAME_SESSION_NUMBER = "session_number";
  @SerializedName(SERIALIZED_NAME_SESSION_NUMBER)
  private Integer sessionNumber;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public BreadcrumbData sessionNumber(Integer sessionNumber) {
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

  public BreadcrumbData label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreadcrumbData breadcrumbData = (BreadcrumbData) o;
    return Objects.equals(this.sessionNumber, breadcrumbData.sessionNumber) &&
        Objects.equals(this.label, breadcrumbData.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionNumber, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreadcrumbData {\n");
    sb.append("    sessionNumber: ").append(toIndentedString(sessionNumber)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

