package com.owned.design.patterns.behavioral.strategy.example_2;

import com.owned.design.patterns.behavioral.strategy.example_1.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentMainApplication {

    public static void main(String[] args) {
        /**
         * by using lambdas
         */
        final Context context = new Context(() -> "pay with another concrete strategy, MasterCard method");
        log.info(context.contextInterface());
    }
}
