package com.owned.design.patterns.behavioral.visitor.example_1;

import java.math.BigDecimal;

public class TradeMainApplication {

    public static void main(String[] args) {

        /**
         * Simple way
         * Tip: forget
         */
        final TradeVisitor tradeVisitor = new TradeValidator();
        final SellOrder sellOrder = new SellOrder();
        tradeVisitor.visit(sellOrder);

        /**
         * Other way: Trigger the visitor logic in all of the elements
         */
        final AbstractTrade abstractTrade = new FuturesTrade("EUR", BigDecimal.TEN);
        abstractTrade.accept(tradeVisitor);
    }
}
