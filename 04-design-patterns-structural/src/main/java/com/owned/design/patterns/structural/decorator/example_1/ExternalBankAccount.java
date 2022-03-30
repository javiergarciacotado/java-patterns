package com.owned.design.patterns.structural.decorator.example_1;

public class ExternalBankAccount extends BankAccountBaseDecorator {

    ExternalBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }
}
