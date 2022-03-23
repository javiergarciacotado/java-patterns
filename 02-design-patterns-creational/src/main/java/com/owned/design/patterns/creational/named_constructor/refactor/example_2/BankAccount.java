package com.owned.design.patterns.creational.named_constructor.refactor.example_2;

import java.math.BigDecimal;

final class BankAccount {

    private final String id;
    private final String name;
    private final BigDecimal amount;

    public BankAccount(String id, String name, BigDecimal amount) {
        this.id = id;
        this.name = String.valueOf(name);
        this.amount = amount;
    }

    /**
     * Enable another way of instantiating BankAccounts to become more verbose
     */




}

