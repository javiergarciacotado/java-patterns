package com.owned.design.patterns.behavioral.strategy.example_1;

/**
 * Implements the algorithm defined in the Strategy interface.
 *
 */
public class MasterCardPaymentMethod implements PaymentMethodStrategy {

    @Override
    public String paymentMethod() {
        return "pay with another concrete strategy, MasterCard method";
    }
}
