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
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@Schema(description = "Unambiguous identification of the account to which credit and debit entries are made.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBAccount6   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("Status")
  private OBAccountStatus1Code status = null;

  @JsonProperty("StatusUpdateDateTime")
  private OffsetDateTime statusUpdateDateTime = null;

  @JsonProperty("Currency")
  private String currency = null;

  @JsonProperty("AccountType")
  private OBExternalAccountType1Code accountType = null;

  @JsonProperty("AccountSubType")
  private OBExternalAccountSubType1Code accountSubType = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Nickname")
  private String nickname = null;

  @JsonProperty("OpeningDate")
  private OffsetDateTime openingDate = null;

  @JsonProperty("MaturityDate")
  private OffsetDateTime maturityDate = null;

  @JsonProperty("SwitchStatus")
  private String switchStatus = null;

  @JsonProperty("Account")
  @Valid
  private List<OBAccount4Account> account = null;

  @JsonProperty("Servicer")
  private OBBranchAndFinancialInstitutionIdentification50 servicer = null;

  public OBAccount6 accountId(String accountId) {
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

  public OBAccount6 status(OBAccountStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public OBAccountStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBAccountStatus1Code status) {
    this.status = status;
  }

  public OBAccount6 statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Get statusUpdateDateTime
   * @return statusUpdateDateTime
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBAccount6 currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Pattern(regexp="^[A-Z]{3,3}$")   public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount6 accountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }

  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }

  public OBAccount6 accountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

  /**
   * Get accountSubType
   * @return accountSubType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount6 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
  @Size(min=1,max=35)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount6 nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Get nickname
   * @return nickname
   **/
  @Schema(description = "")
  
  @Size(min=1,max=70)   public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OBAccount6 openingDate(OffsetDateTime openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Get openingDate
   * @return openingDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(OffsetDateTime openingDate) {
    this.openingDate = openingDate;
  }

  public OBAccount6 maturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Get maturityDate
   * @return maturityDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }

  public OBAccount6 switchStatus(String switchStatus) {
    this.switchStatus = switchStatus;
    return this;
  }

  /**
   * Get switchStatus
   * @return switchStatus
   **/
  @Schema(description = "")
  
    public String getSwitchStatus() {
    return switchStatus;
  }

  public void setSwitchStatus(String switchStatus) {
    this.switchStatus = switchStatus;
  }

  public OBAccount6 account(List<OBAccount4Account> account) {
    this.account = account;
    return this;
  }

  public OBAccount6 addAccountItem(OBAccount4Account accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<OBAccount4Account>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
   **/
  @Schema(description = "")
      @Valid
    public List<OBAccount4Account> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount4Account> account) {
    this.account = account;
  }

  public OBAccount6 servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
    return this;
  }

  /**
   * Get servicer
   * @return servicer
   **/
  @Schema(description = "")
  
    @Valid
    public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }

  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount6 obAccount6 = (OBAccount6) o;
    return Objects.equals(this.accountId, obAccount6.accountId) &&
        Objects.equals(this.status, obAccount6.status) &&
        Objects.equals(this.statusUpdateDateTime, obAccount6.statusUpdateDateTime) &&
        Objects.equals(this.currency, obAccount6.currency) &&
        Objects.equals(this.accountType, obAccount6.accountType) &&
        Objects.equals(this.accountSubType, obAccount6.accountSubType) &&
        Objects.equals(this.description, obAccount6.description) &&
        Objects.equals(this.nickname, obAccount6.nickname) &&
        Objects.equals(this.openingDate, obAccount6.openingDate) &&
        Objects.equals(this.maturityDate, obAccount6.maturityDate) &&
        Objects.equals(this.switchStatus, obAccount6.switchStatus) &&
        Objects.equals(this.account, obAccount6.account) &&
        Objects.equals(this.servicer, obAccount6.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, openingDate, maturityDate, switchStatus, account, servicer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount6 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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
