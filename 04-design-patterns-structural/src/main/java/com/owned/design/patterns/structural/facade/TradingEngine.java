package com.owned.design.patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * The main trading engine that fills the orders.
 */
@Slf4j
public class TradingEngine {

    public TradingEngine() {}

    public void buyOrder(TradeDetails tradeDetails) {
        log.info("buying order...");
    }

    public void sellOrder(TradeDetails tradeDetails) {
        log.info("selling order...");
    }
}
