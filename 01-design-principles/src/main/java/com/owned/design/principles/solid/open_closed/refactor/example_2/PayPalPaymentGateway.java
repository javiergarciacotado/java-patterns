package com.owned.design.principles.solid.open_closed.refactor.example_2;

public final class PayPalPaymentGateway implements PaymentGatewayType {

    @Override
    public Payment from(String paymentMethod) {
        //not under scope
        return new Payment();
    }
}
