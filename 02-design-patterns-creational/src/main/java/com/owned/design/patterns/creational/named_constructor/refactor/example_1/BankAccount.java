package com.owned.design.patterns.creational.named_constructor.refactor.example_1;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

final class BankAccount {

    private final String id;
    private final String name;
    private final BigDecimal amount;

    /**
     * Change (or not) the visibility of the Java constructor
     * @param id bank account identifier
     * @param name bank account name
     * @param amount bank account current amount
     */
    private BankAccount(String id, String name, BigDecimal amount) {
        this.id = id;
        this.name = String.valueOf(name);
        this.amount = amount;
    }

    public static BankAccount emptyBankAccount(String id, String name) {
        return new BankAccount(id, name, ZERO);
    }




}

