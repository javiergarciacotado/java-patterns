
package com.owned.design.patterns.behavioral.chain_of_responsability.example_1;

import lombok.extern.slf4j.Slf4j;

/**
 * Handler for support team.
 *
 */
@Slf4j
public class SupportBankAccountReviewHandler extends AbstractCreateBankAccountChainOfResponsability {

    @Override
    protected String[] criteria() {

        return new String[] { "support", "customer", "creation" };
    }

    @Override
    protected String review(BankAccount bankAccount) {

        log.info("[" + bankAccount + "] This is a bank account for Support to review.");
        return "support";
    }
}
