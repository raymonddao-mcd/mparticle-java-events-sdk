package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProductAction
 */

public class ProductAction {
  /**
   * Gets or Sets action
   */
  public enum Action {
    ADD_TO_CART("add_to_cart"),
    
    REMOVE_FROM_CART("remove_from_cart"),
    
    CHECKOUT("checkout"),
    
    CHECKOUT_OPTION("checkout_option"),
    
    CLICK("click"),
    
    VIEW_DETAIL("view_detail"),
    
    PURCHASE("purchase"),
    
    REFUND("refund"),
    
    ADD_TO_WISHLIST("add_to_wishlist"),
    
    REMOVE_FROM_WISH_LIST("remove_from_wish_list");

    private String value;

    Action(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Action fromValue(String value) {
      for (Action b : Action.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Action action;

  public static final String SERIALIZED_NAME_CHECKOUT_STEP = "checkout_step";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_STEP)
  private Integer checkoutStep;

  public static final String SERIALIZED_NAME_CHECKOUT_OPTIONS = "checkout_options";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_OPTIONS)
  private String checkoutOptions;

  public static final String SERIALIZED_NAME_PRODUCT_ACTION_LIST = "product_action_list";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ACTION_LIST)
  private String productActionList;

  public static final String SERIALIZED_NAME_PRODUCT_LIST_SOURCE = "product_list_source";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LIST_SOURCE)
  private String productListSource;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_AFFILIATION = "affiliation";
  @SerializedName(SERIALIZED_NAME_AFFILIATION)
  private String affiliation;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private BigDecimal totalAmount;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private BigDecimal taxAmount;

  public static final String SERIALIZED_NAME_SHIPPING_AMOUNT = "shipping_amount";
  @SerializedName(SERIALIZED_NAME_SHIPPING_AMOUNT)
  private BigDecimal shippingAmount;

  public static final String SERIALIZED_NAME_COUPON_CODE = "coupon_code";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Product> products = new ArrayList<Product>();

  public ProductAction action(Action action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }

  public ProductAction checkoutStep(Integer checkoutStep) {
    this.checkoutStep = checkoutStep;
    return this;
  }

   /**
   * Get checkoutStep
   * @return checkoutStep
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCheckoutStep() {
    return checkoutStep;
  }

  public void setCheckoutStep(Integer checkoutStep) {
    this.checkoutStep = checkoutStep;
  }

  public ProductAction checkoutOptions(String checkoutOptions) {
    this.checkoutOptions = checkoutOptions;
    return this;
  }

   /**
   * Get checkoutOptions
   * @return checkoutOptions
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCheckoutOptions() {
    return checkoutOptions;
  }

  public void setCheckoutOptions(String checkoutOptions) {
    this.checkoutOptions = checkoutOptions;
  }

  public ProductAction productActionList(String productActionList) {
    this.productActionList = productActionList;
    return this;
  }

   /**
   * Get productActionList
   * @return productActionList
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductActionList() {
    return productActionList;
  }

  public void setProductActionList(String productActionList) {
    this.productActionList = productActionList;
  }

  public ProductAction productListSource(String productListSource) {
    this.productListSource = productListSource;
    return this;
  }

   /**
   * Get productListSource
   * @return productListSource
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductListSource() {
    return productListSource;
  }

  public void setProductListSource(String productListSource) {
    this.productListSource = productListSource;
  }

  public ProductAction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public ProductAction affiliation(String affiliation) {
    this.affiliation = affiliation;
    return this;
  }

   /**
   * Get affiliation
   * @return affiliation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAffiliation() {
    return affiliation;
  }

  public void setAffiliation(String affiliation) {
    this.affiliation = affiliation;
  }

  public ProductAction totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public ProductAction taxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public ProductAction shippingAmount(BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
    return this;
  }

   /**
   * Get shippingAmount
   * @return shippingAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getShippingAmount() {
    return shippingAmount;
  }

  public void setShippingAmount(BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
  }

  public ProductAction couponCode(String couponCode) {
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

  public ProductAction products(List<Product> products) {
    this.products = products;
    return this;
  }

  public ProductAction addProductsItem(Product productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAction productAction = (ProductAction) o;
    return Objects.equals(this.action, productAction.action) &&
        Objects.equals(this.checkoutStep, productAction.checkoutStep) &&
        Objects.equals(this.checkoutOptions, productAction.checkoutOptions) &&
        Objects.equals(this.productActionList, productAction.productActionList) &&
        Objects.equals(this.productListSource, productAction.productListSource) &&
        Objects.equals(this.transactionId, productAction.transactionId) &&
        Objects.equals(this.affiliation, productAction.affiliation) &&
        Objects.equals(this.totalAmount, productAction.totalAmount) &&
        Objects.equals(this.taxAmount, productAction.taxAmount) &&
        Objects.equals(this.shippingAmount, productAction.shippingAmount) &&
        Objects.equals(this.couponCode, productAction.couponCode) &&
        Objects.equals(this.products, productAction.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, checkoutStep, checkoutOptions, productActionList, productListSource, transactionId, affiliation, totalAmount, taxAmount, shippingAmount, couponCode, products);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAction {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    checkoutStep: ").append(toIndentedString(checkoutStep)).append("\n");
    sb.append("    checkoutOptions: ").append(toIndentedString(checkoutOptions)).append("\n");
    sb.append("    productActionList: ").append(toIndentedString(productActionList)).append("\n");
    sb.append("    productListSource: ").append(toIndentedString(productListSource)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    affiliation: ").append(toIndentedString(affiliation)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    shippingAmount: ").append(toIndentedString(shippingAmount)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

