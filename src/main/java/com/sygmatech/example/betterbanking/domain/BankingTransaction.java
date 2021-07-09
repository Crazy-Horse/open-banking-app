package com.sygmatech.example.betterbanking.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PUBLIC, force=true)
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class BankingTransaction {

    @Id @GeneratedValue
    private Long id;
    private final String type;
    private LocalDate date;
    private final Integer accountNumber;
    private final String currency;
    private final Double amount;
    private final String merchantName;
    private String merchantLogo;
}
