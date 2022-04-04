

package com.owned.design.patterns.behavioral.visitor.example_1;

import lombok.extern.slf4j.Slf4j;

/**
 * Some new behaviour we want to add to validate a trade and it's constituent parts.
 *
 */
@Slf4j
public class TradeValidator implements TradeVisitor {

    public void visit(Trade trade) {
        log.info("Validating the trade...");
    }

    @Override
    public void visit(SellOrder sellOrder) {
        log.info("Validating the sell order...");
    }

    @Override
    public void visit(BuyOrder buyOrder) {
        log.info("Validating the buy order...");
    }

    @Override
    public void visit(TransactionFee transactionFee) {
        log.info("Validating the transaction fee...");
    }
}