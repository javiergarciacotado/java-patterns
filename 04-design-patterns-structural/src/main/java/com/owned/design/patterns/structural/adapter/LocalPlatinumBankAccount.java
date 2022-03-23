package com.owned.design.patterns.structural.adapter;

import java.math.BigDecimal;

public class LocalPlatinumBankAccount extends AbstractBankAccount {

    public LocalPlatinumBankAccount(BigDecimal balance) {
        super(balance, true);
    }
}
