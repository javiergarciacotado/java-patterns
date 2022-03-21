package com.owned.design.principles.solid.open_closed.refactor.example_2;

public final class PaymentGateway {

    public Payment paymentFrom(String paymentMethod) {
        /**
         * Body refactor is under creational design patterns module ...
         */
        return new Payment();
    }

}
