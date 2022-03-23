package com.owned.design.patterns.creational.builder.weird.example_1;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Slf4j
public class BankAccountMainApplication {

    public static void main(String[] args) {

        final BankAccount bankAccount = new BankAccount("123456", "a-name", Date.from(Instant.now()), null, "a-customer-id", BigDecimal.ONE, "savings-account");
        /**
         * Can we produce instances in a different way?
         */
        log.info("bankAccount details {}", bankAccount);
    }
}
