package com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product;

/**
 * A deposit account for savings
 */
public class SavingsDepositAccountAccount extends BaseBankAccountProduct {

    @Override
    public String productDetails() {
        return "Savings Account";
    }
}
