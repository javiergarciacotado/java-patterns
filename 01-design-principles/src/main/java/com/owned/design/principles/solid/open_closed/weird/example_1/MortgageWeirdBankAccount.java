package com.owned.design.principles.solid.open_closed.weird.example_1;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class MortgageWeirdBankAccount {

    BigDecimal amount;
    int years;

    public int calculatePendingPercentage() {
        return amount.intValue() * 100 / years;
    }
}
