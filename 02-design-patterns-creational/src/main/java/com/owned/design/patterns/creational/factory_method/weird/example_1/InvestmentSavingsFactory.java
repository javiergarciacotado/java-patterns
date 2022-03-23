package com.owned.design.patterns.creational.factory_method.weird.example_1;

import com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product.BankProduct;
import com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product.GuaranteedIncome;
import com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product.SavingsDepositAccountAccount;

/**
 * Concrete factory implementation for building investment savings Products,
 */
public class InvestmentSavingsFactory extends InvestmentFactory {

    @Override
    protected BankProduct createBankAccountProduct(InvestmentFactory.ProductType productType) {

        //TODO? It's not a question
        if (productType == InvestmentFactory.ProductType.GUARANTEED_INCOME_BOND) {
            return new GuaranteedIncome();
        } else if (productType == InvestmentFactory.ProductType.CASH_SAVINGS_ACCOUNT) {
            return new SavingsDepositAccountAccount();
        } else {
            throw new IllegalArgumentException("Can't build unknown productType: " + productType);
        }
    }
}
