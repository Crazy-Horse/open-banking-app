package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to provide details on the credit line.
 */
@Schema(description = "Set of elements used to provide details on the credit line.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBReadBalance1DataCreditLine   {
  @JsonProperty("Included")
  private Boolean included = null;

  /**
   * Limit type, in a coded form.
   */
  public enum TypeEnum {
    AVAILABLE("Available"),
    
    CREDIT("Credit"),
    
    EMERGENCY("Emergency"),
    
    PRE_AGREED("Pre-Agreed"),
    
    TEMPORARY("Temporary");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Type")
  private TypeEnum type = null;

  @JsonProperty("Amount")
  private OBReadBalance1DataAmount1 amount = null;

  public OBReadBalance1DataCreditLine included(Boolean included) {
    this.included = included;
    return this;
  }

  /**
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
   * @return included
   **/
  @Schema(required = true, description = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.")
      @NotNull

    public Boolean isIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public OBReadBalance1DataCreditLine type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Limit type, in a coded form.
   * @return type
   **/
  @Schema(description = "Limit type, in a coded form.")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OBReadBalance1DataCreditLine amount(OBReadBalance1DataAmount1 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    @Valid
    public OBReadBalance1DataAmount1 getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataAmount1 amount) {
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
    OBReadBalance1DataCreditLine obReadBalance1DataCreditLine = (OBReadBalance1DataCreditLine) o;
    return Objects.equals(this.included, obReadBalance1DataCreditLine.included) &&
        Objects.equals(this.type, obReadBalance1DataCreditLine.type) &&
        Objects.equals(this.amount, obReadBalance1DataCreditLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataCreditLine {\n");
    
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
