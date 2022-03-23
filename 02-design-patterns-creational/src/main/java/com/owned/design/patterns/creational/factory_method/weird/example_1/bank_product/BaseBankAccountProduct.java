package com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product;

/**
 * Base class for all Bank Products.
 * <p>
 * Not part of the Factory Method pattern per se
 */
public abstract class BaseBankAccountProduct implements BankProduct {

    private boolean isTaxable;

    @Override
    public void setIsTaxable(boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    @Override
    public boolean isTaxable() {
        return isTaxable;
    }
}
