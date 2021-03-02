package com.sygmatech.example.betterbanking.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED, force=true)
@RequiredArgsConstructor
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotNull
    private final String type;
    @NotNull
    private final String accountNumber;
    @NotNull
    private final String currency;
    @NotNull
    private final Double amount;
    @NotNull
    private final String merchantName;
    private String merchantLogo;

}


