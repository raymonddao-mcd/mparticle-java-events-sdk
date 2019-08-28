package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProductImpression
 */

public class ProductImpression {
  public static final String SERIALIZED_NAME_PRODUCT_IMPRESSION_LIST = "product_impression_list";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMPRESSION_LIST)
  private String productImpressionList;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Product> products = new ArrayList<Product>();

  public ProductImpression productImpressionList(String productImpressionList) {
    this.productImpressionList = productImpressionList;
    return this;
  }

   /**
   * Get productImpressionList
   * @return productImpressionList
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductImpressionList() {
    return productImpressionList;
  }

  public void setProductImpressionList(String productImpressionList) {
    this.productImpressionList = productImpressionList;
  }

  public ProductImpression products(List<Product> products) {
    this.products = products;
    return this;
  }

  public ProductImpression addProductsItem(Product productsItem) {
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
    ProductImpression productImpression = (ProductImpression) o;
    return Objects.equals(this.productImpressionList, productImpression.productImpressionList) &&
        Objects.equals(this.products, productImpression.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productImpressionList, products);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductImpression {\n");
    sb.append("    productImpressionList: ").append(toIndentedString(productImpressionList)).append("\n");
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

