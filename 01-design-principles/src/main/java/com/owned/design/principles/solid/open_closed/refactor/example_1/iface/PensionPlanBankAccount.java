package com.owned.design.principles.solid.open_closed.refactor.example_1.iface;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class PensionPlanBankAccount implements BankAccountPercentageCalculable {

    BigDecimal amount;
    int years;

    public PensionPlanBankAccount(BigDecimal amount, int years) {
        this.amount = amount;
        this.years = years;
    }

    @Override
    public int getPercentage() {
        //same body method than MortgageBankAccount
        return amount.intValue() * 100 / years;
    }
}
