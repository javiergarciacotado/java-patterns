

package com.owned.design.patterns.behavioral.visitor.example_1;

/**
 * <p>
 * This is the Visitor interface. It defines a new operation without introducing modifications to an object structure.
 *
 * It declares methods to visit each kind of Visitable (Element) i.e. our Trade object
 * graph/hierarchy.
 * </p>
 *
 * To be updated if we need to visit new elements ...
 */
public interface TradeVisitor {

    void visit(Trade trade);
    void visit(SellOrder sellOrder);
    void visit(BuyOrder buyOrder);
    void visit(TransactionFee transactionFee);
}
