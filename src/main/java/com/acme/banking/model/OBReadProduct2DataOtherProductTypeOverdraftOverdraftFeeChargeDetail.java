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
 * Details about the fees/charges
 */
@Schema(description = "Details about the fees/charges")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail   {
  @JsonProperty("FeeType")
  private OBOverdraftFeeType1Code feeType = null;

  @JsonProperty("NegotiableIndicator")
  private Boolean negotiableIndicator = null;

  @JsonProperty("OverdraftControlIndicator")
  private Boolean overdraftControlIndicator = null;

  @JsonProperty("IncrementalBorrowingAmount")
  private String incrementalBorrowingAmount = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("FeeRate")
  private String feeRate = null;

  @JsonProperty("FeeRateType")
  private OBInterestRateType1Code0 feeRateType = null;

  @JsonProperty("ApplicationFrequency")
  private OBFeeFrequency1Code0 applicationFrequency = null;

  @JsonProperty("CalculationFrequency")
  private OBFeeFrequency1Code1 calculationFrequency = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftFeeChargeCap")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @JsonProperty("OtherFeeType")
  private OBOtherCodeType13 otherFeeType = null;

  @JsonProperty("OtherFeeRateType")
  private OBOtherCodeType14 otherFeeRateType = null;

  @JsonProperty("OtherApplicationFrequency")
  private OBOtherCodeType11 otherApplicationFrequency = null;

  @JsonProperty("OtherCalculationFrequency")
  private OBOtherCodeType12 otherCalculationFrequency = null;

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeType(OBOverdraftFeeType1Code feeType) {
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
    public OBOverdraftFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBOverdraftFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Indicates whether fee and charges are negotiable
   * @return negotiableIndicator
   **/
  @Schema(description = "Indicates whether fee and charges are negotiable")
  
    public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

  /**
   * Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
   * @return overdraftControlIndicator
   **/
  @Schema(description = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")
  
    public Boolean isOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

  /**
   * Get incrementalBorrowingAmount
   * @return incrementalBorrowingAmount
   **/
  @Schema(description = "")
  
  @Pattern(regexp="^(-?{1,14}){1}(\\.{1,4}){0,1}$")   public String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }

  public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeAmount(String feeAmount) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeRate(String feeRate) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeRateType(OBInterestRateType1Code0 feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Get feeRateType
   * @return feeRateType
   **/
  @Schema(description = "")
  
    @Valid
    public OBInterestRateType1Code0 getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(OBInterestRateType1Code0 feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail applicationFrequency(OBFeeFrequency1Code0 applicationFrequency) {
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
    public OBFeeFrequency1Code0 getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code0 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail calculationFrequency(OBFeeFrequency1Code1 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * Get calculationFrequency
   * @return calculationFrequency
   **/
  @Schema(description = "")
  
    @Valid
    public OBFeeFrequency1Code1 getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code1 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail addNotesItem(String notesItem) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail addOverdraftFeeChargeCapItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
   **/
  @Schema(description = "")
      @Valid
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherFeeType(OBOtherCodeType13 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
   **/
  @Schema(description = "")
  
    @Valid
    public OBOtherCodeType13 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherCodeType13 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherFeeRateType(OBOtherCodeType14 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
   **/
  @Schema(description = "")
  
    @Valid
    public OBOtherCodeType14 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OBOtherCodeType14 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
   **/
  @Schema(description = "")
  
    @Valid
    public OBOtherCodeType11 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
   **/
  @Schema(description = "")
  
    @Valid
    public OBOtherCodeType12 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
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
    OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail) o;
    return Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.feeType) &&
        Objects.equals(this.negotiableIndicator, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.negotiableIndicator) &&
        Objects.equals(this.overdraftControlIndicator, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.overdraftControlIndicator) &&
        Objects.equals(this.incrementalBorrowingAmount, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.incrementalBorrowingAmount) &&
        Objects.equals(this.feeAmount, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeRate, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.feeRateType) &&
        Objects.equals(this.applicationFrequency, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.notes) &&
        Objects.equals(this.overdraftFeeChargeCap, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.overdraftFeeChargeCap) &&
        Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, negotiableIndicator, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, overdraftFeeChargeCap, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail {\n");
    
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
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
