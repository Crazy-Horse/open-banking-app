package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Type of interest rate, Fixed or Variable
 */
public enum OBInterestFixedVariableType1Code {
  INFI("INFI"),
    INVA("INVA");

  private String value;

  OBInterestFixedVariableType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBInterestFixedVariableType1Code fromValue(String text) {
    for (OBInterestFixedVariableType1Code b : OBInterestFixedVariableType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
