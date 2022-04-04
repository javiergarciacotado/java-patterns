package com.owned.design.patterns.behavioral.strategy.example_1;

/**
 * Implements the algorithm defined in the Strategy interface.
 *
 */
public class VisaPaymentMethod implements PaymentMethodStrategy {

    @Override
    public String paymentMethod() {
        return "pay with a concrete strategy, VISA method";
    }
}
