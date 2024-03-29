package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides overdraft details for a specific tier or band
 */
@Schema(description = "Provides overdraft details for a specific tier or band")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand   {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("TierValueMin")
  private String tierValueMin = null;

  @JsonProperty("TierValueMax")
  private String tierValueMax = null;

  @JsonProperty("EAR")
  private String EAR = null;

  @JsonProperty("AgreementLengthMin")
  private Integer agreementLengthMin = null;

  @JsonProperty("AgreementLengthMax")
  private Integer agreementLengthMax = null;

  /**
   * Specifies the period of a fixed length overdraft agreement
   */
  public enum AgreementPeriodEnum {
    PACT("PACT"),
    
    PDAY("PDAY"),
    
    PHYR("PHYR"),
    
    PMTH("PMTH"),
    
    PQTR("PQTR"),
    
    PWEK("PWEK"),
    
    PYER("PYER");

    private String value;

    AgreementPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AgreementPeriodEnum fromValue(String text) {
      for (AgreementPeriodEnum b : AgreementPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("AgreementPeriod")
  private AgreementPeriodEnum agreementPeriod = null;

  /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is �2k and the interest tiers are:- 0-�500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the �Whole� of the account balance,  and in the 2nd that it is �Tiered�.
   */
  public enum OverdraftInterestChargingCoverageEnum {
    INBA("INBA"),
    
    INTI("INTI"),
    
    INWH("INWH");

    private String value;

    OverdraftInterestChargingCoverageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OverdraftInterestChargingCoverageEnum fromValue(String text) {
      for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("OverdraftInterestChargingCoverage")
  private OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage = null;

  @JsonProperty("BankGuaranteedIndicator")
  private Boolean bankGuaranteedIndicator = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftFeesCharges")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges = null;

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
   * @return identification
   **/
  @Schema(description = "Unique and unambiguous identification of a  Tier Band for a overdraft.")
  
  @Size(min=1,max=35)   public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand tierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
    return this;
  }

  /**
   * Minimum value of Overdraft Tier/Band
   * @return tierValueMin
   **/
  @Schema(required = true, description = "Minimum value of Overdraft Tier/Band")
      @NotNull

  @Pattern(regexp="^(-?\\{1,14}){1}(\\\\.\\{1,4}){0,1}$")   public String getTierValueMin() {
    return tierValueMin;
  }

  public void setTierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand tierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
    return this;
  }

  /**
   * Maximum value of Overdraft Tier/Band
   * @return tierValueMax
   **/
  @Schema(description = "Maximum value of Overdraft Tier/Band")
  
  @Pattern(regexp="^(-?\\{1,14}){1}(\\\\.\\{1,4}){0,1}$")   public String getTierValueMax() {
    return tierValueMax;
  }

  public void setTierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand EAR(String EAR) {
    this.EAR = EAR;
    return this;
  }

  /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
   * @return EAR
   **/
  @Schema(description = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")
  
  @Pattern(regexp="^(-?\\{1,3}){1}(\\\\.\\{1,4}){0,1}$")   public String getEAR() {
    return EAR;
  }

  public void setEAR(String EAR) {
    this.EAR = EAR;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementLengthMin(Integer agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
    return this;
  }

  /**
   * Specifies the minimum length of a band for a fixed overdraft agreement
   * @return agreementLengthMin
   **/
  @Schema(description = "Specifies the minimum length of a band for a fixed overdraft agreement")
  
    public Integer getAgreementLengthMin() {
    return agreementLengthMin;
  }

  public void setAgreementLengthMin(Integer agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementLengthMax(Integer agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
    return this;
  }

  /**
   * Specifies the maximum length of a band for a fixed overdraft agreement
   * @return agreementLengthMax
   **/
  @Schema(description = "Specifies the maximum length of a band for a fixed overdraft agreement")
  
    public Integer getAgreementLengthMax() {
    return agreementLengthMax;
  }

  public void setAgreementLengthMax(Integer agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementPeriod(AgreementPeriodEnum agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
    return this;
  }

  /**
   * Specifies the period of a fixed length overdraft agreement
   * @return agreementPeriod
   **/
  @Schema(description = "Specifies the period of a fixed length overdraft agreement")
  
    public AgreementPeriodEnum getAgreementPeriod() {
    return agreementPeriod;
  }

  public void setAgreementPeriod(AgreementPeriodEnum agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

  /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is �2k and the interest tiers are:- 0-�500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the �Whole� of the account balance,  and in the 2nd that it is �Tiered�.
   * @return overdraftInterestChargingCoverage
   **/
  @Schema(description = "Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is �2k and the interest tiers are:- 0-�500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the �Whole� of the account balance,  and in the 2nd that it is �Tiered�.")
  
    public OverdraftInterestChargingCoverageEnum getOverdraftInterestChargingCoverage() {
    return overdraftInterestChargingCoverage;
  }

  public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

  /**
   * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it�s part of a government scheme, or whether the rate may vary dependent on the applicant�s circumstances.
   * @return bankGuaranteedIndicator
   **/
  @Schema(description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it�s part of a government scheme, or whether the rate may vary dependent on the applicant�s circumstances.")
  
    public Boolean isBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }

  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand addNotesItem(String notesItem) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand overdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand addOverdraftFeesChargesItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Get overdraftFeesCharges
   * @return overdraftFeesCharges
   **/
  @Schema(description = "")
      @Valid
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand) o;
    return Objects.equals(this.identification, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.identification) &&
        Objects.equals(this.tierValueMin, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.tierValueMin) &&
        Objects.equals(this.tierValueMax, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.tierValueMax) &&
        Objects.equals(this.EAR, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.EAR) &&
        Objects.equals(this.agreementLengthMin, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.agreementLengthMin) &&
        Objects.equals(this.agreementLengthMax, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.agreementLengthMax) &&
        Objects.equals(this.agreementPeriod, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.agreementPeriod) &&
        Objects.equals(this.overdraftInterestChargingCoverage, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.overdraftInterestChargingCoverage) &&
        Objects.equals(this.bankGuaranteedIndicator, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.bankGuaranteedIndicator) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.notes) &&
        Objects.equals(this.overdraftFeesCharges, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.overdraftFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, tierValueMin, tierValueMax, EAR, agreementLengthMin, agreementLengthMax, agreementPeriod, overdraftInterestChargingCoverage, bankGuaranteedIndicator, notes, overdraftFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
    sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
    sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
    sb.append("    agreementLengthMin: ").append(toIndentedString(agreementLengthMin)).append("\n");
    sb.append("    agreementLengthMax: ").append(toIndentedString(agreementLengthMax)).append("\n");
    sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
    sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
    sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
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
