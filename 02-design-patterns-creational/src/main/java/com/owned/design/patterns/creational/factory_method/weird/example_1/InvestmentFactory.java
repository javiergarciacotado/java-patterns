package com.owned.design.patterns.creational.factory_method.weird.example_1;

import com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product.BankProduct;

/**
 * This is the abstract factory the Client code uses to build different Product types.
 */
public abstract class InvestmentFactory {

    public enum ProductType {
        OEIC,
        GILT,
        INVESTMENT_TRUST,
        CASH_SAVINGS_ACCOUNT,
        GUARANTEED_INCOME_BOND
    }

    /**
     * Client code to call to create specific Product.
     */
    public BankProduct build(ProductType productType) {
        return createBankAccountProduct(productType);
    }

    /**
     * This is the 'Factory Method' that allows concrete factory subclasses must implement to return the Product
     * that they build.
     */
    protected abstract BankProduct createBankAccountProduct(ProductType productType);
}
