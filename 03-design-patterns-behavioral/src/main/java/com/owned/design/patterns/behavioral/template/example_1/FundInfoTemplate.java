package com.owned.design.patterns.behavioral.template.example_1;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * The main abstract template class.
 * <p>
 * It uses a template to collect information from different stock providers in order to display
 * them
 * <p>
 */
@Slf4j
public abstract class FundInfoTemplate {

    /**
     * Methods that subclasses need to implement
     * @return useful info
     */
    protected abstract String getStockName();

    protected abstract String getFundType();

    protected abstract String getFundGoal();

    protected abstract BigDecimal calculateManagementFee();

    /**
     * We are allowed to provide default implementations
     * @return default currency
     */
    protected String getFundCurrency() {
        // default to euro
        return "EUR";
    }

    /**
     * This is the main template method that Clients will call.
     * <p>
     *  <b>Notice it's final and cannot be overridden.</b>
     * </p>>
     */
    public final void collectFundInfo() {
        log.info("Fund Name: " + getStockName());
        log.info("Fund Type: " + getFundType());
        log.info("Fund Goal: " + getFundGoal());
        log.info("Fund Currency: " + getFundCurrency());
        log.info("Fund Management Fee: " + new DecimalFormat("#.###").format(calculateManagementFee()) + "%");
    }
}
