package com.owned.design.patterns.behavioral.chain_of_responsability.example_1;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class BankAccountReviewApplication {

    public static void main(String[] args) {
        /**
         * Successful CoR
         */
        final BankAccount okChainedBankAccount = new BankAccount(UUID.randomUUID().toString(), "platinum", "new-customer");
        AbstractCreateBankAccountChainOfResponsability.reviewBankAccountRequest(okChainedBankAccount);
        /**
         * Unsuccessful CoR - no handler defined for external accounts
         */
        final BankAccount notOkChainedBankAccount = new BankAccount(UUID.randomUUID().toString(), "standard", "external-account");
        AbstractCreateBankAccountChainOfResponsability.reviewBankAccountRequest(notOkChainedBankAccount);

    }
}
