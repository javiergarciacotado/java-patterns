package com.owned.design.patterns.behavioral.visitor.example_1;

import lombok.Data;

import java.math.BigDecimal;

/**
 * A domain class that represents a Trade in our class hierarchy/object graph.
 *
 * It is a Concrete Element and holds the Object Structure: it holds references to ALL objects that can be visited -
 * this allows us to iterate through and 'visit' them in the accept method.
 *
 */
@Data
public abstract class AbstractTrade implements Trade { // Trade interface modified to extend Visitable

    private String currency;
    private BigDecimal price;

    private BuyOrder buyOrder;
    private SellOrder sellOrder;
    private TransactionFee fee;

    AbstractTrade(String currency, BigDecimal amount) {

        this.currency = currency;
        this.price = amount;

        // do all existing functionality...
        buyOrder = new BuyOrder();
        sellOrder = new SellOrder();
        fee = new TransactionFee();
    }

    /*
     * The new Visitor method. We iterate through the object graph/hierarchy to 'visit' them.
     */
    @Override
    public void accept(TradeVisitor visitor) {

        // visit each component first - this just sets the Visitor on each of Elements in our Trade object graph
        // - nothing happens yet...
        buyOrder.accept(visitor);
        sellOrder.accept(visitor);

        // then we visit the receiver - the double dispatch (callback on invoker) - this triggers the Visitor logic
        // on all of our Elements in the Trade object graph.
        visitor.visit(this);
    }

    public String toString() {
        return getClass().getName() + " : Price= " + this.getPrice();
    }
}
