package com.owned.design.patterns.behavioral.visitor.example_1;

/**
 * A domain class that makes up part of a Trade in our class hierarchy/object graph.
 *
 * It is a Concrete Element.
 *
 * It has been modified to implement the Visitable (Element).
 */
// public class SellOrder extends AbstractTradePart { // here previously
public class SellOrder extends AbstractTradePart implements Visitable {

    @Override
    public void accept(TradeVisitor visitor) {
        visitor.visit(this); // makes callback to the Visitor
    }
}
