

package com.owned.design.patterns.behavioral.visitor.example_1;

/**
 * A concrete element class that makes up part of a Trade in our class hierarchy/object graph.
 *
 * It has been modified to implement the Visitable (Element).
 */
// public class TransactionFee extends AbstractTradePart { // here previously
public class TransactionFee extends AbstractTradePart implements Visitable {

    @Override
    public void accept(TradeVisitor visitor) {
        visitor.visit(this); // makes callback to the Visitor
    }
}
