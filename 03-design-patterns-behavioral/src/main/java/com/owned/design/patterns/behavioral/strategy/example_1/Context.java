package com.owned.design.patterns.behavioral.strategy.example_1;

/**
 * Maintains a reference to the Strategy object
 *
 */
public final class Context {

    private PaymentMethodStrategy paymentMethodStrategy;

    public Context(PaymentMethodStrategy paymentMethodStrategy) {
        this.paymentMethodStrategy = paymentMethodStrategy;
    }

    public String contextInterface() {
        return this.paymentMethodStrategy.paymentMethod();
    }
}
