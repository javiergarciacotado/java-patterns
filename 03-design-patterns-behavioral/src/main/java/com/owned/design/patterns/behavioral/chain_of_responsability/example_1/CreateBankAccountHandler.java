package com.owned.design.patterns.behavioral.chain_of_responsability.example_1;

/**
 * Provides operations that each concrete Handler impl must provide.
 *
 */
public interface CreateBankAccountHandler {

    /**
     * Sets the next handler. The abstract impl usually calls this instead of each concrete impl.
     *
     * @param bankAccountHandler the create bank account handler.
     */
    void setNextHandler(CreateBankAccountHandler bankAccountHandler);
           
    /**
     * Each handler provides its own impl to do something with the bank account
     * @param bankAccount the bankAccount.
     */
    void processHandler(BankAccount bankAccount);
}
