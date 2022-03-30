package com.owned.design.patterns.structural.decorator.example_1;

public class LocalBankAccount extends BankAccountBaseDecorator {

    LocalBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }
}
