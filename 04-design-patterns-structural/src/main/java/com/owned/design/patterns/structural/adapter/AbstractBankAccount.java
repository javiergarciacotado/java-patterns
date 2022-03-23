package com.owned.design.patterns.structural.adapter;

import java.math.BigDecimal;

class AbstractBankAccount implements BankAccount {

    private final BigDecimal balance;
    private final boolean isOverdraftAvailable;

    public AbstractBankAccount(BigDecimal balance, boolean isOverdraftAvailable) {
        this.balance = balance;
        this.isOverdraftAvailable = isOverdraftAvailable;
    }

    @Override
    public boolean overdraftAvailable() {
        return isOverdraftAvailable;
    }

    @Override
    public BigDecimal balance() {
        return balance;
    }

}
