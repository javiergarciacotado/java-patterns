package com.owned.design.patterns.behavioral.template.example_1;

import java.math.BigDecimal;

/**
 * The Bitcoin fund and its implementation of the template method hooks.
 */
public class CryptoFund extends FundInfoTemplate {

    @Override
    protected String getStockName() {
        return "the next crypto generation fund";
    }

    @Override
    protected String getFundType() {
        return "'Crypto' trust";
    }

    @Override
    protected String getFundGoal() {
        return "Long term growth investing in large crypto coins";
    }

    @Override
    protected BigDecimal calculateManagementFee() {
        return new BigDecimal("0.000000019");
    }

    protected String getFundCurrency() {
        return "some encrypted data";
    }
}
