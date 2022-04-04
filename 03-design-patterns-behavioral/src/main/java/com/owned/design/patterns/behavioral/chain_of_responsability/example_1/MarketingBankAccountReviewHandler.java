package com.owned.design.patterns.behavioral.chain_of_responsability.example_1;

import lombok.extern.slf4j.Slf4j;

/**
 * Handler for Marketing team
 */
@Slf4j
public class MarketingBankAccountReviewHandler extends AbstractCreateBankAccountChainOfResponsability {

    @Override
    protected String[] criteria() {

        return new String[] { "new-customer", "existing-customer" };
    }

    @Override
    protected String review(BankAccount bankAccount) {

        log.info("[" + bankAccount + "] This is a bank account for Marketing team to review.");
        return "marketing";
    }
}
