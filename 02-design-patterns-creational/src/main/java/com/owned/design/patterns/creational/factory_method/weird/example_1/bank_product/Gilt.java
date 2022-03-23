package com.owned.design.patterns.creational.factory_method.weird.example_1.bank_product;

/**
 * A gilt (UK government bonds)
 */
public class Gilt extends BaseBankAccountProduct {

    public String productDetails() {
        return "Gilt";
    }
}
