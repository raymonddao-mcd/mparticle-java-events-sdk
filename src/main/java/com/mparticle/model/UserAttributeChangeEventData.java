package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * UserAttributeChangeEventData
 */

public class UserAttributeChangeEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_USER_ATTRIBUTE_NAME = "user_attribute_name";
  @SerializedName(SERIALIZED_NAME_USER_ATTRIBUTE_NAME)
  private String userAttributeName;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Object _new = null;

  public static final String SERIALIZED_NAME_OLD = "old";
  @SerializedName(SERIALIZED_NAME_OLD)
  private Object old = null;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_IS_NEW_ATTRIBUTE = "is_new_attribute";
  @SerializedName(SERIALIZED_NAME_IS_NEW_ATTRIBUTE)
  private Boolean isNewAttribute;

  public UserAttributeChangeEventData userAttributeName(String userAttributeName) {
    this.userAttributeName = userAttributeName;
    return this;
  }

   /**
   * Get userAttributeName
   * @return userAttributeName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserAttributeName() {
    return userAttributeName;
  }

  public void setUserAttributeName(String userAttributeName) {
    this.userAttributeName = userAttributeName;
  }

  public UserAttributeChangeEventData _new(Object _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getNew() {
    return _new;
  }

  public void setNew(Object _new) {
    this._new = _new;
  }

  public UserAttributeChangeEventData old(Object old) {
    this.old = old;
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getOld() {
    return old;
  }

  public void setOld(Object old) {
    this.old = old;
  }

  public UserAttributeChangeEventData deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public UserAttributeChangeEventData isNewAttribute(Boolean isNewAttribute) {
    this.isNewAttribute = isNewAttribute;
    return this;
  }

   /**
   * Get isNewAttribute
   * @return isNewAttribute
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsNewAttribute() {
    return isNewAttribute;
  }

  public void setIsNewAttribute(Boolean isNewAttribute) {
    this.isNewAttribute = isNewAttribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAttributeChangeEventData userAttributeChangeEventData = (UserAttributeChangeEventData) o;
    return Objects.equals(this.userAttributeName, userAttributeChangeEventData.userAttributeName) &&
        Objects.equals(this._new, userAttributeChangeEventData._new) &&
        Objects.equals(this.old, userAttributeChangeEventData.old) &&
        Objects.equals(this.deleted, userAttributeChangeEventData.deleted) &&
        Objects.equals(this.isNewAttribute, userAttributeChangeEventData.isNewAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAttributeName, _new, old, deleted, isNewAttribute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAttributeChangeEventData {\n");
    sb.append("    userAttributeName: ").append(toIndentedString(userAttributeName)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    isNewAttribute: ").append(toIndentedString(isNewAttribute)).append("\n");
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

