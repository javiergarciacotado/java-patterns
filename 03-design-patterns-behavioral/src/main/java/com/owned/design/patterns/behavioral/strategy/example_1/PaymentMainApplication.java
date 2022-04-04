package com.owned.design.patterns.behavioral.strategy.example_1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentMainApplication {

    public static void main(String[] args) {
        /**
         * Context is an intermediate class
         * Always remember dependency inversion principle ...
         */
        final Context context = new Context(new MasterCardPaymentMethod());
        log.info(context.contextInterface());
    }
}