package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides further details on a statement resource.
 */
@Schema(description = "Provides further details on a statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBStatement2Detail   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("StatementId")
  private String statementId = null;

  @JsonProperty("StatementReference")
  private String statementReference = null;

  @JsonProperty("Type")
  private OBExternalStatementType1Code type = null;

  @JsonProperty("StartDateTime")
  private OffsetDateTime startDateTime = null;

  @JsonProperty("EndDateTime")
  private OffsetDateTime endDateTime = null;

  @JsonProperty("CreationDateTime")
  private OffsetDateTime creationDateTime = null;

  @JsonProperty("StatementDescription")
  @Valid
  private List<String> statementDescription = null;

  @JsonProperty("StatementBenefit")
  @Valid
  private List<OBStatement2StatementBenefit> statementBenefit = null;

  @JsonProperty("StatementFee")
  @Valid
  private List<OBStatement2StatementFee> statementFee = null;

  @JsonProperty("StatementInterest")
  @Valid
  private List<OBStatement2StatementInterest> statementInterest = null;

  @JsonProperty("StatementAmount")
  @Valid
  private List<OBStatement2StatementAmount> statementAmount = null;

  @JsonProperty("StatementDateTime")
  @Valid
  private List<OBStatement2StatementDateTime> statementDateTime = null;

  @JsonProperty("StatementRate")
  @Valid
  private List<OBStatement2StatementRate> statementRate = null;

  @JsonProperty("StatementValue")
  @Valid
  private List<OBStatement2StatementValue> statementValue = null;

  public OBStatement2Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=1,max=40)   public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBStatement2Detail statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * Get statementId
   * @return statementId
   **/
  @Schema(description = "")
  
  @Size(min=1,max=40)   public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public OBStatement2Detail statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  /**
   * Get statementReference
   * @return statementReference
   **/
  @Schema(description = "")
  
  @Size(min=1,max=35)   public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }

  public OBStatement2Detail type(OBExternalStatementType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBExternalStatementType1Code getType() {
    return type;
  }

  public void setType(OBExternalStatementType1Code type) {
    this.type = type;
  }

  public OBStatement2Detail startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Get startDateTime
   * @return startDateTime
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBStatement2Detail endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Get endDateTime
   * @return endDateTime
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBStatement2Detail creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBStatement2Detail statementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement2Detail addStatementDescriptionItem(String statementDescriptionItem) {
    if (this.statementDescription == null) {
      this.statementDescription = new ArrayList<String>();
    }
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

  /**
   * Get statementDescription
   * @return statementDescription
   **/
  @Schema(description = "")
  
    public List<String> getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
  }

  public OBStatement2Detail statementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement2Detail addStatementBenefitItem(OBStatement2StatementBenefit statementBenefitItem) {
    if (this.statementBenefit == null) {
      this.statementBenefit = new ArrayList<OBStatement2StatementBenefit>();
    }
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

  /**
   * Get statementBenefit
   * @return statementBenefit
   **/
  @Schema(description = "")
      @Valid
    public List<OBStatement2StatementBenefit> getStatementBenefit() {
    return statementBenefit;
  }

  public void setStatementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
  }

  public OBStatement2Detail statementFee(List<OBStatement2StatementFee> statementFee) {
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement2Detail addStatementFeeItem(OBStatement2StatementFee statementFeeItem) {
    if (this.statementFee == null) {
      this.statementFee = new ArrayList<OBStatement2StatementFee>();
    }
    this.statementFee.add(statementFeeItem);
    return this;
  }

  /**
   * Get statementFee
   * @return statementFee
   **/
  @Schema(description = "")
      @Valid
    public List<OBStatement2StatementFee> getStatementFee() {
    return statementFee;
  }

  public void setStatementFee(List<OBStatement2StatementFee> statementFee) {
    this.statementFee = statementFee;
  }

  public OBStatement2Detail statementInterest(List<OBStatement2StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement2Detail addStatementInterestItem(OBStatement2StatementInterest statementInterestItem) {
    if (this.statementInterest == null) {
      this.statementInterest = new ArrayList<OBStatement2StatementInterest>();
    }
    this.statementInterest.add(statementInterestItem);
    return this;
  }

  /**
   * Get statementInterest
   * @return statementInterest
   **/
  @Schema(description = "")
      @Valid
    public List<OBStatement2StatementInterest> getStatementInterest() {
    return statementInterest;
  }

  public void setStatementInterest(List<OBStatement2StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
  }

  public OBStatement2Detail statementAmount(List<OBStatement2StatementAmount> statementAmount) {
    this.statementAmount = statementAmount;
    return this;
  }

  public OBStatement2Detail addStatementAmountItem(OBStatement2StatementAmount statementAmountItem) {
    if (this.statementAmount == null) {
      this.statementAmount = new ArrayList<OBStatement2StatementAmount>();
    }
    this.statementAmount.add(statementAmountItem);
    return this;
  }

  /**
   * Get statementAmount
   * @return statementAmount
   **/
  @Schema(description = "")
      @Valid
    public List<OBStatement2StatementAmount> getStatementAmount() {
    return statementAmount;
  }

  public void setStatementAmount(List<OBStatement2StatementAmount> statementAmount) {
    this.statementAmount = statementAmount;
  }

  public OBStatement2Detail statementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement2Detail addStatementDateTimeItem(OBStatement2StatementDateTime statementDateTimeItem) {
    if (this.statementDateTime == null) {
      this.statementDateTime = new ArrayList<OBStatement2StatementDateTime>();
    }
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

  /**
   * Get statementDateTime
   * @return statementDateTime
   **/
  @Schema(description = "")
      @Valid
    public List<OBStatement2StatementDateTime> getStatementDateTime() {
    return statementDateTime;
  }

  public void setStatementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
  }

  public OBStatement2Detail statementRate(List<OBStatement2StatementRate> statementRate) {
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement2Detail addStatementRateItem(OBStatement2StatementRate statementRateItem) {
    if (this.statementRate == null) {
      this.statementRate = new ArrayList<OBStatement2StatementRate>();
    }
    this.statementRate.add(statementRateItem);
    return this;
  }

  /**
   * Get statementRate
   * @return statementRate
   **/
  @Schema(description = "")
      @Valid
    public List<OBStatement2StatementRate> getStatementRate() {
    return statementRate;
  }

  public void setStatementRate(List<OBStatement2StatementRate> statementRate) {
    this.statementRate = statementRate;
  }

  public OBStatement2Detail statementValue(List<OBStatement2StatementValue> statementValue) {
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement2Detail addStatementValueItem(OBStatement2StatementValue statementValueItem) {
    if (this.statementValue == null) {
      this.statementValue = new ArrayList<OBStatement2StatementValue>();
    }
    this.statementValue.add(statementValueItem);
    return this;
  }

  /**
   * Get statementValue
   * @return statementValue
   **/
  @Schema(description = "")
      @Valid
    public List<OBStatement2StatementValue> getStatementValue() {
    return statementValue;
  }

  public void setStatementValue(List<OBStatement2StatementValue> statementValue) {
    this.statementValue = statementValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2Detail obStatement2Detail = (OBStatement2Detail) o;
    return Objects.equals(this.accountId, obStatement2Detail.accountId) &&
        Objects.equals(this.statementId, obStatement2Detail.statementId) &&
        Objects.equals(this.statementReference, obStatement2Detail.statementReference) &&
        Objects.equals(this.type, obStatement2Detail.type) &&
        Objects.equals(this.startDateTime, obStatement2Detail.startDateTime) &&
        Objects.equals(this.endDateTime, obStatement2Detail.endDateTime) &&
        Objects.equals(this.creationDateTime, obStatement2Detail.creationDateTime) &&
        Objects.equals(this.statementDescription, obStatement2Detail.statementDescription) &&
        Objects.equals(this.statementBenefit, obStatement2Detail.statementBenefit) &&
        Objects.equals(this.statementFee, obStatement2Detail.statementFee) &&
        Objects.equals(this.statementInterest, obStatement2Detail.statementInterest) &&
        Objects.equals(this.statementAmount, obStatement2Detail.statementAmount) &&
        Objects.equals(this.statementDateTime, obStatement2Detail.statementDateTime) &&
        Objects.equals(this.statementRate, obStatement2Detail.statementRate) &&
        Objects.equals(this.statementValue, obStatement2Detail.statementValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementAmount, statementDateTime, statementRate, statementValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2Detail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
    sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
    sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
    sb.append("    statementAmount: ").append(toIndentedString(statementAmount)).append("\n");
    sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
    sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
    sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
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
