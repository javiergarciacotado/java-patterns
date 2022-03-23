package com.owned.design.patterns.structural.adapter;

import java.math.BigDecimal;

public class LocalStandardBankAccount extends AbstractBankAccount {

    public LocalStandardBankAccount(BigDecimal balance) {
        super(balance, false);
    }
}
