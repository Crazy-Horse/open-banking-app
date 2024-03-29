package com.sygmatech.example.betterbanking.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PUBLIC, force=true)
@AllArgsConstructor
@Data
public class Transaction implements Serializable {

    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;

}


