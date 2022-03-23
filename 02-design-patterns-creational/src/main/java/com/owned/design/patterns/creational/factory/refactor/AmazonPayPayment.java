package com.owned.design.patterns.creational.factory.refactor;

final class AmazonPayPayment implements Payment {
    @Override
    public boolean pay(String srcAccountId, String targetAccountId) {
        return false;
    }
}
