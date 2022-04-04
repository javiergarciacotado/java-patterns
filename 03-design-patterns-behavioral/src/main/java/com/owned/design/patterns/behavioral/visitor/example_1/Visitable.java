

package com.owned.design.patterns.behavioral.visitor.example_1;

/**
 * This is the Visitable element that defines the interface for all classes that we wish to be visited.
 */
public interface Visitable {

    void accept(TradeVisitor visitor);
}
