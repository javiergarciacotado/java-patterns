package com.owned.design.patterns.creational.factory.refactor;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * A factory of related objects instantiation: Payments
 */
public class PaymentGatewayFactory {

    private static final Map<String, Payment> payments = new HashMap<>();

    static {
        payments.put("paypal", new PaypalPayment());
        payments.put("stripe", new StripePayment());
        payments.put("amazon-pay", new AmazonPayment());
    }

    private PaymentGatewayFactory() {}

    public static Optional<Payment> from(String payment) {
        return Optional.ofNullable(payments.get(payment));
    }

}

