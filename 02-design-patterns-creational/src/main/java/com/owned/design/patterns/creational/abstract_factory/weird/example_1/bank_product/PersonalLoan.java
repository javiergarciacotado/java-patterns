package com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_product;

public class PersonalLoan implements BankProduct {

    @Override
    public String productDetails() {
        return "Taxable details ...";
    }
}
