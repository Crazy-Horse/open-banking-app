package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Range or amounts or rates for which the fee/charge applies
 */
@Schema(description = "Range or amounts or rates for which the fee/charge applies")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class FeeApplicableRange   {
  @JsonProperty("MinimumAmount")
  private String minimumAmount = null;

  @JsonProperty("MaximumAmount")
  private String maximumAmount = null;

  @JsonProperty("MinimumRate")
  private String minimumRate = null;

  @JsonProperty("MaximumRate")
  private String maximumRate = null;

  public FeeApplicableRange minimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
    return this;
  }

  /**
   * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
   * @return minimumAmount
   **/
  @Schema(description = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")
  
  @Pattern(regexp="^(-?{1,14}){1}(\\.{1,4}){0,1}$")   public String getMinimumAmount() {
    return minimumAmount;
  }

  public void setMinimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
  }

  public FeeApplicableRange maximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
    return this;
  }

  /**
   * Maximum Amount on which fee is applicable (where it is expressed as an amount)
   * @return maximumAmount
   **/
  @Schema(description = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")
  
  @Pattern(regexp="^(-?{1,14}){1}(\\.{1,4}){0,1}$")   public String getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public FeeApplicableRange minimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
    return this;
  }

  /**
   * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return minimumRate
   **/
  @Schema(description = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")
  
  @Pattern(regexp="^(-?{1,3}){1}(\\.{1,4}){0,1}$")   public String getMinimumRate() {
    return minimumRate;
  }

  public void setMinimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
  }

  public FeeApplicableRange maximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
    return this;
  }

  /**
   * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return maximumRate
   **/
  @Schema(description = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")
  
  @Pattern(regexp="^(-?{1,3}){1}(\\.{1,4}){0,1}$")   public String getMaximumRate() {
    return maximumRate;
  }

  public void setMaximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeApplicableRange feeApplicableRange = (FeeApplicableRange) o;
    return Objects.equals(this.minimumAmount, feeApplicableRange.minimumAmount) &&
        Objects.equals(this.maximumAmount, feeApplicableRange.maximumAmount) &&
        Objects.equals(this.minimumRate, feeApplicableRange.minimumRate) &&
        Objects.equals(this.maximumRate, feeApplicableRange.maximumRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumAmount, maximumAmount, minimumRate, maximumRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeApplicableRange {\n");
    
    sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
    sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
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
