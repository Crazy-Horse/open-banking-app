package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Details of the merchant involved in the transaction.
 */
@Schema(description = "Details of the merchant involved in the transaction.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBMerchantDetails1   {
  @JsonProperty("MerchantName")
  private String merchantName = null;

  @JsonProperty("MerchantCategoryCode")
  private String merchantCategoryCode = null;

  public OBMerchantDetails1 merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * Name by which the merchant is known.
   * @return merchantName
   **/
  @Schema(description = "Name by which the merchant is known.")
  
  @Size(min=1,max=350)   public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public OBMerchantDetails1 merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
   * @return merchantCategoryCode
   **/
  @Schema(description = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")
  
  @Size(min=3,max=4)   public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBMerchantDetails1 obMerchantDetails1 = (OBMerchantDetails1) o;
    return Objects.equals(this.merchantName, obMerchantDetails1.merchantName) &&
        Objects.equals(this.merchantCategoryCode, obMerchantDetails1.merchantCategoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, merchantCategoryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBMerchantDetails1 {\n");
    
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
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
