package com.mparticle.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mparticle.model.ProductAction;
import com.mparticle.model.ProductImpression;
import com.mparticle.model.PromotionAction;
import com.mparticle.model.ShoppingCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CommerceEventData
 */

public class CommerceEventData extends CommonEventData {
  public static final String SERIALIZED_NAME_PRODUCT_ACTION = "product_action";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ACTION)
  private ProductAction productAction = null;

  public static final String SERIALIZED_NAME_PROMOTION_ACTION = "promotion_action";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ACTION)
  private PromotionAction promotionAction = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMPRESSIONS = "product_impressions";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMPRESSIONS)
  private List<ProductImpression> productImpressions = new ArrayList<ProductImpression>();

  public static final String SERIALIZED_NAME_SHOPPING_CART = "shopping_cart";
  @SerializedName(SERIALIZED_NAME_SHOPPING_CART)
  private ShoppingCart shoppingCart = null;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_SCREEN_NAME = "screen_name";
  @SerializedName(SERIALIZED_NAME_SCREEN_NAME)
  private String screenName;

  public static final String SERIALIZED_NAME_IS_NON_INTERACTIVE = "is_non_interactive";
  @SerializedName(SERIALIZED_NAME_IS_NON_INTERACTIVE)
  private Boolean isNonInteractive;

  public static final String SERIALIZED_NAME_EVENT_NAME = "event_name";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  /**
   * Gets or Sets customEventType
   */
  @JsonAdapter(CustomEventTypeEnum.Adapter.class)
  public enum CustomEventTypeEnum {
    ADD_TO_CART("add_to_cart"),
    
    REMOVE_FROM_CART("remove_from_cart"),
    
    CHECKOUT("checkout"),
    
    CHECKOUT_OPTION("checkout_option"),
    
    CLICK("click"),
    
    VIEW_DETAIL("view_detail"),
    
    PURCHASE("purchase"),
    
    REFUND("refund"),
    
    PROMOTION_VIEW("promotion_view"),
    
    PROMOTION_CLICK("promotion_click"),
    
    ADD_TO_WISHLIST("add_to_wishlist"),
    
    REMOVE_FROM_WISHLIST("remove_from_wishlist"),
    
    IMPRESSION("impression");

    private String value;

    CustomEventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomEventTypeEnum fromValue(String value) {
      for (CustomEventTypeEnum b : CustomEventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CustomEventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomEventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomEventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CustomEventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CUSTOM_EVENT_TYPE = "custom_event_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT_TYPE)
  private CustomEventTypeEnum customEventType;

  public static final String SERIALIZED_NAME_CUSTOM_FLAGS = "custom_flags";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FLAGS)
  private Map<String, String> customFlags = new HashMap<String, String>();

  public CommerceEventData productAction(ProductAction productAction) {
    this.productAction = productAction;
    return this;
  }

   /**
   * Get productAction
   * @return productAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ProductAction getProductAction() {
    return productAction;
  }

  public void setProductAction(ProductAction productAction) {
    this.productAction = productAction;
  }

  public CommerceEventData promotionAction(PromotionAction promotionAction) {
    this.promotionAction = promotionAction;
    return this;
  }

   /**
   * Get promotionAction
   * @return promotionAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public PromotionAction getPromotionAction() {
    return promotionAction;
  }

  public void setPromotionAction(PromotionAction promotionAction) {
    this.promotionAction = promotionAction;
  }

  public CommerceEventData productImpressions(List<ProductImpression> productImpressions) {
    this.productImpressions = productImpressions;
    return this;
  }

  public CommerceEventData addProductImpressionsItem(ProductImpression productImpressionsItem) {
    if (this.productImpressions == null) {
      this.productImpressions = new ArrayList<ProductImpression>();
    }
    this.productImpressions.add(productImpressionsItem);
    return this;
  }

   /**
   * Get productImpressions
   * @return productImpressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<ProductImpression> getProductImpressions() {
    return productImpressions;
  }

  public void setProductImpressions(List<ProductImpression> productImpressions) {
    this.productImpressions = productImpressions;
  }

  public CommerceEventData shoppingCart(ShoppingCart shoppingCart) {
    this.shoppingCart = shoppingCart;
    return this;
  }

   /**
   * Get shoppingCart
   * @return shoppingCart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ShoppingCart getShoppingCart() {
    return shoppingCart;
  }

  public void setShoppingCart(ShoppingCart shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public CommerceEventData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CommerceEventData screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }

   /**
   * Get screenName
   * @return screenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getScreenName() {
    return screenName;
  }

  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }

  public CommerceEventData isNonInteractive(Boolean isNonInteractive) {
    this.isNonInteractive = isNonInteractive;
    return this;
  }

   /**
   * Get isNonInteractive
   * @return isNonInteractive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getIsNonInteractive() {
    return isNonInteractive;
  }

  public void setIsNonInteractive(Boolean isNonInteractive) {
    this.isNonInteractive = isNonInteractive;
  }

  public CommerceEventData eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

   /**
   * Get customEventType
   * @return customEventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public CustomEventTypeEnum getCustomEventType() {
    return customEventType;
  }

  public CommerceEventData customFlags(Map<String, String> customFlags) {
    this.customFlags = customFlags;
    return this;
  }

  public CommerceEventData putCustomFlagsItem(String key, String customFlagsItem) {
    if (this.customFlags == null) {
      this.customFlags = new HashMap<String, String>();
    }
    this.customFlags.put(key, customFlagsItem);
    return this;
  }

   /**
   * Get customFlags
   * @return customFlags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, String> getCustomFlags() {
    return customFlags;
  }

  public void setCustomFlags(Map<String, String> customFlags) {
    this.customFlags = customFlags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceEventData commerceEventData = (CommerceEventData) o;
    return Objects.equals(this.productAction, commerceEventData.productAction) &&
        Objects.equals(this.promotionAction, commerceEventData.promotionAction) &&
        Objects.equals(this.productImpressions, commerceEventData.productImpressions) &&
        Objects.equals(this.shoppingCart, commerceEventData.shoppingCart) &&
        Objects.equals(this.currencyCode, commerceEventData.currencyCode) &&
        Objects.equals(this.screenName, commerceEventData.screenName) &&
        Objects.equals(this.isNonInteractive, commerceEventData.isNonInteractive) &&
        Objects.equals(this.eventName, commerceEventData.eventName) &&
        Objects.equals(this.customEventType, commerceEventData.customEventType) &&
        Objects.equals(this.customFlags, commerceEventData.customFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productAction, promotionAction, productImpressions, shoppingCart, currencyCode, screenName, isNonInteractive, eventName, customEventType, customFlags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceEventData {\n");
    sb.append("    productAction: ").append(toIndentedString(productAction)).append("\n");
    sb.append("    promotionAction: ").append(toIndentedString(promotionAction)).append("\n");
    sb.append("    productImpressions: ").append(toIndentedString(productImpressions)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    isNonInteractive: ").append(toIndentedString(isNonInteractive)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    customEventType: ").append(toIndentedString(customEventType)).append("\n");
    sb.append("    customFlags: ").append(toIndentedString(customFlags)).append("\n");
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

