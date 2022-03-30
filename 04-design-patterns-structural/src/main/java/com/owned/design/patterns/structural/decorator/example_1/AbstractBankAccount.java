package com.owned.design.patterns.structural.decorator.example_1;

import java.math.BigDecimal;

abstract class AbstractBankAccount implements BankAccount {

    private BigDecimal balance;
    private boolean isOverdraftAvailable;

    AbstractBankAccount() {
        this.balance = BigDecimal.ZERO;
    }

    @Override
    public boolean overdraftAvailable() {

        return isOverdraftAvailable;
    }

    @Override
    public void debit(BigDecimal debit) {
        //#really?
        balance = balance.subtract(debit);
    }

    @Override
    public void credit(BigDecimal credit) {
        //#really-v2? 💡💡
        balance = balance.add(credit);

    }

    @Override
    public BigDecimal balance() {
        return balance;
    }

}
