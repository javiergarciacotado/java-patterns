package com.owned.design.patterns.behavioral.visitor.example_1;

/**
 * A concrete class that makes up part of a Trade in our class hierarchy/object graph.
 *
 * It's been modified to implement the Visitable (Element).
 *
 */
// public class BuyOrder extends AbstractTradePart { // here previously
public class BuyOrder extends AbstractTradePart implements Visitable {

    @Override
    public void accept(TradeVisitor visitor) {
        visitor.visit(this); // makes callback to the Visitor
    }
}
