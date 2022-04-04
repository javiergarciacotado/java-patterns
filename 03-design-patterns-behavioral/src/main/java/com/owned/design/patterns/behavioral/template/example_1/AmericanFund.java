package com.owned.design.patterns.behavioral.template.example_1;

import java.math.BigDecimal;

/**
 * A generic American Fund and its implementation of the template method hooks.
 *
 */
public class AmericanFund extends FundInfoTemplate {

    @Override
    protected String getStockName() {
        return "American Fund";
    }

    @Override
    protected String getFundType() {
        return "OEIC";
    }

    @Override
    protected String getFundGoal() {
        return "Long term growth from tracking Nasdaq indexes";
    }

    @Override
    protected BigDecimal calculateManagementFee() {
        return BigDecimal.valueOf(0.04);
    }

    @Override
    protected String getFundCurrency() {
        return "USD";
    }
}
