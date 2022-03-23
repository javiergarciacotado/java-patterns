package com.owned.design.patterns.creational.builder.refactor.example_1;

import lombok.extern.slf4j.Slf4j;

import static com.owned.design.patterns.creational.builder.refactor.example_1.BankAccountV1.BankAccountV1Builder;

@Slf4j
public class BankAccountMainApplication {

    public static void main(String[] args) {

        final BankAccountV1 bankAccountV1 = BankAccountV1Builder.builder().withId("123456").withName("a-name").build();
        log.info("bankAccount details {}", bankAccountV1);
        /**
         * via lombok
         */
        final BankAccountV2 bankAccountV2 = BankAccountV2.builder().withId("123456").withName("a-name").build();
        log.info("bankAccount details {}", bankAccountV2);
    }
}
