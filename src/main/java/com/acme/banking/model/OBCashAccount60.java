package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Unambiguous identification of the account of the creditor, in the case of a debit transaction.
 */
@Schema(description = "Unambiguous identification of the account of the creditor, in the case of a debit transaction.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBCashAccount60   {
  @JsonProperty("SchemeName")
  private String schemeName = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification = null;

  public OBCashAccount60 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Get schemeName
   * @return schemeName
   **/
  @Schema(description = "")
  
    public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBCashAccount60 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
   **/
  @Schema(description = "")
  
  @Size(min=1,max=256)   public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBCashAccount60 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
  @Size(min=1,max=350)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBCashAccount60 secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * Get secondaryIdentification
   * @return secondaryIdentification
   **/
  @Schema(description = "")
  
  @Size(min=1,max=34)   public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashAccount60 obCashAccount60 = (OBCashAccount60) o;
    return Objects.equals(this.schemeName, obCashAccount60.schemeName) &&
        Objects.equals(this.identification, obCashAccount60.identification) &&
        Objects.equals(this.name, obCashAccount60.name) &&
        Objects.equals(this.secondaryIdentification, obCashAccount60.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCashAccount60 {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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
