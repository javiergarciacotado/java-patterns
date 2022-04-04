package com.owned.design.patterns.behavioral.template.example_1;

public class FundInfoMainApplication {

    public static void main(String[] args) {
        final CryptoFund cryptoFund = new CryptoFund();
        /**
         * Template method's invocation
         */
        cryptoFund.collectFundInfo();
    }
}
