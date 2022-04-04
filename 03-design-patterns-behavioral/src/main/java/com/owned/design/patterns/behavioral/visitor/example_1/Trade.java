package com.owned.design.patterns.behavioral.visitor.example_1;

import java.math.BigDecimal;

/**
 * A domain class that makes up part of a Trade in our class hierarchy/object graph.
 *
 * It has been modified to implement the Visitable (Element).
 *
 */
// public interface Trade { // here previously
public interface Trade extends Visitable { // we impl Visitor pattern - we now extend Visitable

    // existing methods
    BigDecimal getPrice();
    String getCurrency();

    // new method to accept our Visitor
    void accept(TradeVisitor visitor);
}
