package com.owned.design.patterns.behavioral.observer.example_1;

import com.owned.design.patterns.behavioral.observer.example_1.domain.market.Market;

/**
 * The Observer interface all Clients (Observers) must implement to receive price updates.
 */
public interface MarketObserver {
    /**
     * Called by the Subject to inform Clients (Observers) of price change.
     *
     * @param market the Observable/Subject is passed to the Observer to it can get at the changed state.
     */
    void update(Market market);
}