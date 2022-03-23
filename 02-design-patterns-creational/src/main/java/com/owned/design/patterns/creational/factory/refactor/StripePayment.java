package com.owned.design.patterns.creational.factory.refactor;

public class StripePayment implements Payment {

    @Override
    public boolean pay(String srcAccountId, String targetAccountId) {
        return false;
    }
}
