package com.owned.design.patterns.creational.factory_method.weird.example_1;

import com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product.BaseBankAccountProduct;
import com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product.Gilt;
import com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product.InvestmentTrust;
import com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product.OpenEndedInvestmentCompany;

/**
 * Concrete factory implementation for building investment fund Products
 */
public class InvestmentFundFactory extends InvestmentFactory {

    @Override
    protected BaseBankAccountProduct createBankAccountProduct(InvestmentFactory.ProductType productType) {

        if (productType == InvestmentFactory.ProductType.GILT) {
            return new Gilt();
        } else if (productType == InvestmentFactory.ProductType.OEIC) {
            return new OpenEndedInvestmentCompany();
        } else if (productType == InvestmentFactory.ProductType.INVESTMENT_TRUST) {
            return new InvestmentTrust();
        } else {
            throw new IllegalArgumentException("Can't build unknown productType: " + productType);
        }
    }
}
