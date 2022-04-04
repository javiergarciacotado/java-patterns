package com.owned.design.patterns.behavioral.observer.example_1.domain.market;

import com.owned.design.patterns.behavioral.observer.example_1.MarketObserver;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the Observable.
 * <p>
 * Massively simplified. Use case is that whenever a new order goes in, we update the latest bid price, and notify all
 * bots of the price.
 * <p>
 * For production quality, this lot needs making thread safe etc...
 * <p>

 */
@Data
public abstract class Market {

    /**
     * The market
     */
    private MarketType marketType;

    /**
     * The current/latest market bid price
     */
    private BigDecimal lastBidPrice;

    /**
     * The observers interested in the price changes
     */
    private List<MarketObserver> priceObservers;

    /**
     * Constructor initialises our list for storing Observers.
     */
    protected Market() {
        priceObservers = new ArrayList<>();
    }

    /**
     * Register an Observer.
     *
     * @param observer the interested observer
     */
    public void registerPriceObserver(MarketObserver observer) {
        priceObservers.add(observer);
    }

    /**
     * Unregister an Observer.
     *
     * @param observer the interested observer
     */
    public void unregisterPriceObserver(MarketObserver observer) {
        priceObservers.remove(observer);
    }

    /**
     * Notifies all Observers of a change
     */
    private void notifyTo() {
        // Notify interested parties...
        priceObservers.forEach(anObserver -> anObserver.update(this));
    }


    /**
     * In real life a proper order would come in here, not just the bid price (KISS)...
     *
     * @param lastBidPrice new price
     * @param marketType   the market we're trading on
     */
    public void createNewBuyOrder(BigDecimal lastBidPrice, MarketType marketType) {
        this.lastBidPrice = lastBidPrice;
        this.marketType = marketType;
        notifyTo();
    }
}