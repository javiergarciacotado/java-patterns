package com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_product;

public class SavingsAccount implements BankProduct {

    @Override
    public String productDetails() {
        return "Tax exemption...";
    }
}
