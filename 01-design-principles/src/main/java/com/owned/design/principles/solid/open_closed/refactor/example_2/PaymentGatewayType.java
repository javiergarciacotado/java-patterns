package com.owned.design.principles.solid.open_closed.refactor.example_2;

public interface PaymentGatewayType {

    Payment from(String paymentMethod);
}
