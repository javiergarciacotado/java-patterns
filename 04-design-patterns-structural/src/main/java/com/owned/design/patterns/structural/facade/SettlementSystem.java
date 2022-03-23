package com.owned.design.patterns.structural.facade;

/**
 * Clears the filled orders in the back office.
 */

public class SettlementSystem {

    public void settle(TradeDetails tradeDetails) {
        System.out.println("Queueing up trade in Settlements system for backoffice to clear...");
    }
}
