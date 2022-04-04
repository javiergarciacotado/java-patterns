package com.owned.design.patterns.behavioral.strategy.example_2;

/**
 * Declares an interface common to all supported algorithms. Context uses this
 * interface to call the algorithm defined by a ConcreteStrategy.
 *
 */
public interface PaymentMethodStrategy {

    String paymentMethod();
}
