package com.owned.design.patterns.behavioral.observer.example_1.domain.market;

/**
 * A Subject. Also called a Concrete Observable.
 */
public final class DollarPoundMarket extends Market {

    /**
     * 1 single instance of this on the exchange for obvious reasons!
     * Do you spot the issue?
     */
    private static final DollarPoundMarket SINGLE_INSTANCE = new DollarPoundMarket();

    // lockdown
    private DollarPoundMarket() {}

    /**
     * Returns market.
     *
     * @return the market.
     */
    public static Market getInstance() {
        return SINGLE_INSTANCE;
    }
}
