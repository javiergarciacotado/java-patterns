package com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_account;

public class StandardBankAccount implements BankAccount {

    @Override
    public String accountDetails() {
        return "Standard Account";
    }
}
