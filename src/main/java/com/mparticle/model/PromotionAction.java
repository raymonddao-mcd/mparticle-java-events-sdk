package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PromotionAction
 */

public class PromotionAction {
  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    VIEW("view"),
    
    CLICK("click");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_PROMOTIONS = "promotions";
  @SerializedName(SERIALIZED_NAME_PROMOTIONS)
  private List<Promotion> promotions = new ArrayList<Promotion>();

  public PromotionAction action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public PromotionAction promotions(List<Promotion> promotions) {
    this.promotions = promotions;
    return this;
  }

  public PromotionAction addPromotionsItem(Promotion promotionsItem) {
    this.promotions.add(promotionsItem);
    return this;
  }

   /**
   * Get promotions
   * @return promotions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Promotion> getPromotions() {
    return promotions;
  }

  public void setPromotions(List<Promotion> promotions) {
    this.promotions = promotions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAction promotionAction = (PromotionAction) o;
    return Objects.equals(this.action, promotionAction.action) &&
        Objects.equals(this.promotions, promotionAction.promotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, promotions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionAction {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
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

