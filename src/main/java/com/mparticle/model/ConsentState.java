package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ConsentState
 */

public class ConsentState {
  public static final String SERIALIZED_NAME_GDPR = "gdpr";
  @SerializedName(SERIALIZED_NAME_GDPR)
  private GDPRConsentState gdpr = null;

  public ConsentState gdpr(GDPRConsentState gdpr) {
    this.gdpr = gdpr;
    return this;
  }

   /**
   * Get gdpr
   * @return gdpr
  **/
  @ApiModelProperty(required = true, value = "")
  public GDPRConsentState getGdpr() {
    return gdpr;
  }

  public void setGdpr(GDPRConsentState gdpr) {
    this.gdpr = gdpr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentState consentState = (ConsentState) o;
    return Objects.equals(this.gdpr, consentState.gdpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gdpr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentState {\n");
    sb.append("    gdpr: ").append(toIndentedString(gdpr)).append("\n");
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

