package com.owned.design.patterns.structural.decorator.example_1;


public abstract class BankAccountBaseDecorator extends AbstractBankAccount {

    private BankAccount bankAccount;

    BankAccountBaseDecorator(final BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
