package com.owned.design.patterns.creational.named_constructor.weird.example_1;

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
     * Enable another way of instantiating objects to be more verbose
     */




}

