
package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * UserIdentityChangeEventData
 */

public class UserIdentityChangeEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private UserIdentity _new = null;

  public static final String SERIALIZED_NAME_OLD = "old";
  @SerializedName(SERIALIZED_NAME_OLD)
  private UserIdentity old = null;

  public UserIdentityChangeEventData _new(UserIdentity _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @ApiModelProperty(required = true, value = "")
  public UserIdentity getNew() {
    return _new;
  }

  public void setNew(UserIdentity _new) {
    this._new = _new;
  }

  public UserIdentityChangeEventData old(UserIdentity old) {
    this.old = old;
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  @ApiModelProperty(required = true, value = "")
  public UserIdentity getOld() {
    return old;
  }

  public void setOld(UserIdentity old) {
    this.old = old;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdentityChangeEventData userIdentityChangeEventData = (UserIdentityChangeEventData) o;
    return Objects.equals(this._new, userIdentityChangeEventData._new) &&
        Objects.equals(this.old, userIdentityChangeEventData.old);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_new, old);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentityChangeEventData {\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
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

