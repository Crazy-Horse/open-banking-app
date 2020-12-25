package com.sygmatech.example.betterbanking.domain;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Transaction {
    //@Id
    private Long id;
    private String type;
    private String accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;

    public Transaction() {}
    public Transaction(Long id, String type, String accountNumber, String currency, Double amount, String merchantName, String merchantLogo) {
        this.id = id;
        this.type = type;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
        this.merchantName = merchantName;
        this.merchantLogo = merchantLogo;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantLogo() {
        return merchantLogo;
    }

    public void setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
    }
}


