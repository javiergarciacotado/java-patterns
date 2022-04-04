package com.owned.design.patterns.behavioral.chain_of_responsability.example_1;

import lombok.extern.slf4j.Slf4j;

/**
 * Handler for Regulatory team.
 */
@Slf4j
public class RegulatoryBankAccountReviewHandler extends AbstractCreateBankAccountChainOfResponsability {

    @Override
    protected String[] criteria() {

        return new String[] { "address", "ss" };
    }

    @Override
    protected String review(BankAccount bankAccount) {

        log.info("[" + bankAccount + "] This is a document for Testing to review.");
        return "regulatory";
    }
}
