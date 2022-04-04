package com.owned.design.patterns.behavioral.chain_of_responsability.example_1;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Provides functionality and 2 operations for subclasses to provide implementations for:
 * <br>
 * (1) deciding if they want to review the document.
 * <br>
 * (2) method to call to review the document.
 * <p>
 * Consumers of the pattern call the reviewDocument() method.
 */
@Slf4j
public abstract class AbstractCreateBankAccountChainOfResponsability implements CreateBankAccountHandler {

    /**
     * Testing purposes
     */
    private String reviewedBy;

    private CreateBankAccountHandler createBankAccountHandler;

    /**
     * Consumers of the pattern call this method to do stuff.
     * <p>
     * This is the business method.
     * </p>
     *
     * @param bankAccount the bank account to review
     */
    public static void reviewBankAccountRequest(BankAccount bankAccount) {
        // Create the handlers/receivers
        final CreateBankAccountHandler supportReviewHandler = new SupportBankAccountReviewHandler();
        final CreateBankAccountHandler salesReviewHandler = new SalesBankAccountReviewHandler();
        final CreateBankAccountHandler marketingReviewHandler = new MarketingBankAccountReviewHandler();

        // Chain em together
        supportReviewHandler.setNextHandler(salesReviewHandler);
        salesReviewHandler.setNextHandler(marketingReviewHandler);
        marketingReviewHandler.setNextHandler(null);

        // New review request comes in and gets routed to support team first... 
        supportReviewHandler.processHandler(bankAccount);
    }

    @Override
    public void setNextHandler(CreateBankAccountHandler handler) {
        this.createBankAccountHandler = handler;
    }


    /*
     * It has been pushed up the process review into this base class; we don't want each subclass
     * duplicating the same thing.
     */
    @Override
    public void processHandler(BankAccount bankAccount) {

        // check for matching words for this Handler
        boolean criteriaFound = Arrays.stream(criteria()).anyMatch(criteria -> bankAccount.getDetails().equals(criteria));

        // Do the handling if we need to...
        // Please, do not write code in such below way!
        if (criteriaFound) {
            reviewedBy = review(bankAccount);
            log.info("reviewed by {}", reviewedBy);
        } else {
            if (createBankAccountHandler != null) {
                createBankAccountHandler.processHandler(bankAccount);
            } else {
                log.info("not found reviewer");
            }
        }
    }

    /**
     * This is where we ask each Handler for its document review selection criteria.
     *
     * @return selection criteria
     */
    protected abstract String[] criteria();

    /**
     * Send the bank account to interested Handlers.
     *
     * @param bankAccount the bank account
     * @return department that reviewed the bank Account
     */
    protected abstract String review(BankAccount bankAccount);
}
