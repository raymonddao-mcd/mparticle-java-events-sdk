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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Product
 */

public class Product {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_COUPON_CODE = "coupon_code";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_ADDED_TO_CART_TIME_MS = "added_to_cart_time_ms";
  @SerializedName(SERIALIZED_NAME_ADDED_TO_CART_TIME_MS)
  private Integer addedToCartTimeMs;

  public static final String SERIALIZED_NAME_TOTAL_PRODUCT_AMOUNT = "total_product_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRODUCT_AMOUNT)
  private BigDecimal totalProductAmount;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "custom_attributes";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private Map<String, String> customAttributes = new HashMap<String, String>();

  public Product id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Product category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Product variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public Product position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Product price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Product quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public Product couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Get couponCode
   * @return couponCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public Product addedToCartTimeMs(Integer addedToCartTimeMs) {
    this.addedToCartTimeMs = addedToCartTimeMs;
    return this;
  }

   /**
   * Get addedToCartTimeMs
   * @return addedToCartTimeMs
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAddedToCartTimeMs() {
    return addedToCartTimeMs;
  }

  public void setAddedToCartTimeMs(Integer addedToCartTimeMs) {
    this.addedToCartTimeMs = addedToCartTimeMs;
  }

  public Product totalProductAmount(BigDecimal totalProductAmount) {
    this.totalProductAmount = totalProductAmount;
    return this;
  }

   /**
   * Get totalProductAmount
   * @return totalProductAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalProductAmount() {
    return totalProductAmount;
  }

  public void setTotalProductAmount(BigDecimal totalProductAmount) {
    this.totalProductAmount = totalProductAmount;
  }

  public Product customAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public Product putCustomAttributesItem(String key, String customAttributesItem) {
    this.customAttributes.put(key, customAttributesItem);
    return this;
  }

   /**
   * Get customAttributes
   * @return customAttributes
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.brand, product.brand) &&
        Objects.equals(this.category, product.category) &&
        Objects.equals(this.variant, product.variant) &&
        Objects.equals(this.position, product.position) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.quantity, product.quantity) &&
        Objects.equals(this.couponCode, product.couponCode) &&
        Objects.equals(this.addedToCartTimeMs, product.addedToCartTimeMs) &&
        Objects.equals(this.totalProductAmount, product.totalProductAmount) &&
        Objects.equals(this.customAttributes, product.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, brand, category, variant, position, price, quantity, couponCode, addedToCartTimeMs, totalProductAmount, customAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    addedToCartTimeMs: ").append(toIndentedString(addedToCartTimeMs)).append("\n");
    sb.append("    totalProductAmount: ").append(toIndentedString(totalProductAmount)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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

