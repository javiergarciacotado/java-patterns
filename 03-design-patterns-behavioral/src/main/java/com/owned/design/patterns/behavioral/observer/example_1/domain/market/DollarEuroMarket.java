package com.owned.design.patterns.behavioral.observer.example_1.domain.market;

/**
 * A Subject. Also called a Concrete Observable.
 */
public class DollarEuroMarket extends Market {

    /**
     * 1 single instance of this on the exchange for obvious reasons!
     * Do you spot the issue? See Singleton tips (avoid)...
     */
    private static final DollarEuroMarket SINGLE_INSTANCE = new DollarEuroMarket();

    // lockdown
    private DollarEuroMarket() {
    }

    /**
     * Returns market.
     *
     * @return the market.
     */
    public static Market getInstance() {
        return SINGLE_INSTANCE;
    }
}