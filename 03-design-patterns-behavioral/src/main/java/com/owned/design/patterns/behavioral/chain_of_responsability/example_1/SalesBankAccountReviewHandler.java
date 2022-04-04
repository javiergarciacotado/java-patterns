package com.owned.design.patterns.behavioral.chain_of_responsability.example_1;

import lombok.extern.slf4j.Slf4j;

/**
 * Handler for Sales team.
 */
@Slf4j
public class SalesBankAccountReviewHandler extends AbstractCreateBankAccountChainOfResponsability {

    @Override
    protected String[] criteria() {

        return new String[] { "sales", "marketing", "something else" };
    }

    @Override
    protected String review(BankAccount bankAccount) {

        log.info("[" + bankAccount + "] This is a document for Sales to review.");
        return "sales";
    }
}
