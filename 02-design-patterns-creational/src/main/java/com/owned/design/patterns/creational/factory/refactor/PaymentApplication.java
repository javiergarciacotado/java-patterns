package com.owned.design.patterns.creational.factory.refactor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentApplication {

    public static void main(String[] args) {

        final Payment payment = PaymentGatewayFactory.from("paypal").orElseThrow(() -> new RuntimeException("Invalid payment type"));
        log.info("payment {}", payment);
    }
}
