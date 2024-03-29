package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Other fees/charges details
 */
@Schema(description = "Other fees/charges details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail   {
  @JsonProperty("FeeType")
  private OBFeeType1Code feeType = null;

  @JsonProperty("NegotiableIndicator")
  private Boolean negotiableIndicator = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("FeeRate")
  private String feeRate = null;

  @JsonProperty("FeeRateType")
  private OBInterestRateType1Code1 feeRateType = null;

  @JsonProperty("ApplicationFrequency")
  private OBFeeFrequency1Code2 applicationFrequency = null;

  @JsonProperty("CalculationFrequency")
  private OBFeeFrequency1Code3 calculationFrequency = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherFeeType")
  private OBOtherFeeChargeDetailType otherFeeType = null;

  @JsonProperty("OtherFeeRateType")
  private OBOtherCodeType15 otherFeeRateType = null;

  @JsonProperty("OtherApplicationFrequency")
  private OBOtherCodeType16 otherApplicationFrequency = null;

  @JsonProperty("OtherCalculationFrequency")
  private OBOtherCodeType17 otherCalculationFrequency = null;

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail feeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Get feeType
   * @return feeType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
   **/
  @Schema(description = "Fee/charge which is usually negotiable rather than a fixed amount")
  
    public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Get feeAmount
   * @return feeAmount
   **/
  @Schema(description = "")
  
  @Pattern(regexp="^(-?{1,14}){1}(\\.{1,4}){0,1}$")   public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Get feeRate
   * @return feeRate
   **/
  @Schema(description = "")
  
  @Pattern(regexp="^(-?{1,3}){1}(\\.{1,4}){0,1}$")   public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail feeRateType(OBInterestRateType1Code1 feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Get feeRateType
   * @return feeRateType
   **/
  @Schema(description = "")
  
    @Valid
    public OBInterestRateType1Code1 getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(OBInterestRateType1Code1 feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail applicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * Get applicationFrequency
   * @return applicationFrequency
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBFeeFrequency1Code2 getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail calculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * Get calculationFrequency
   * @return calculationFrequency
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBFeeFrequency1Code3 getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
   **/
  @Schema(description = "")
  
    @Valid
    public OBOtherFeeChargeDetailType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail otherFeeRateType(OBOtherCodeType15 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
   **/
  @Schema(description = "")
  
    @Valid
    public OBOtherCodeType15 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OBOtherCodeType15 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail otherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
   **/
  @Schema(description = "")
  
    @Valid
    public OBOtherCodeType16 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail otherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
   **/
  @Schema(description = "")
  
    @Valid
    public OBOtherCodeType17 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail = (OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail) o;
    return Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.feeType) &&
        Objects.equals(this.negotiableIndicator, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.negotiableIndicator) &&
        Objects.equals(this.feeAmount, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeRate, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.feeRateType) &&
        Objects.equals(this.applicationFrequency, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.notes) &&
        Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail {\n");
    
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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
