package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to provide details of a benefit or reward amount for the statement resource.
 */
@Schema(description = "Set of elements used to provide details of a benefit or reward amount for the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBStatement2StatementBenefit   {
  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount5 amount = null;

  public OBStatement2StatementBenefit type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementBenefit amount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBActiveOrHistoricCurrencyAndAmount5 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementBenefit obStatement2StatementBenefit = (OBStatement2StatementBenefit) o;
    return Objects.equals(this.type, obStatement2StatementBenefit.type) &&
        Objects.equals(this.amount, obStatement2StatementBenefit.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementBenefit {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
