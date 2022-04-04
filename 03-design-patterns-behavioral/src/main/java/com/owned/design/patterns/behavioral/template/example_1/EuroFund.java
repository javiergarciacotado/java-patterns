package com.owned.design.patterns.behavioral.template.example_1;

import java.math.BigDecimal;

/**
 * The Europe Special Sits Fund and its implementation of the template method hooks.
 *
 */
public class EuroFund extends FundInfoTemplate {

    @Override
    protected String getStockName() {
        return "Europe Fund";
    }

    @Override
    protected String getFundType() {
        return "relaxed";
    }

    @Override
    protected String getFundGoal() {
        return "Help Europe to reach whatever goal";
    }

    @Override
    protected BigDecimal calculateManagementFee() {
        return new BigDecimal("0.02");
    }

    protected String getFundCurrency() {
        return "EUR";
    }

}
