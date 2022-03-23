package com.owned.design.patterns.structural.adapter.third_party;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class ExternalBankAccount {

    BigDecimal balance;
    boolean negativeBalance;
    BigDecimal taxRate;

    public ExternalBankAccount(BigDecimal balance, boolean negativeBalance, BigDecimal taxRate) {
        this.balance = balance;
        this.negativeBalance = negativeBalance;
        this.taxRate = taxRate;
    }
}
