package com.owned.design.patterns.creational.abstract_factory.weird.example_1;


import com.owned.design.patterns.creational.abstract_factory.weird.example_1.address.Address;
import com.owned.design.patterns.creational.abstract_factory.weird.example_1.address.OfficeAddress;
import com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_account.BankAccount;
import com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_account.StandardBankAccount;
import com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_product.BankProduct;
import com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_product.PersonalLoan;

public final class SavingsAbstractBankOperation extends AbstractBankOperation {

    @Override
    public Address createAddress() {
        return new OfficeAddress();
    }

    @Override
    public BankAccount createBankAccount() {

        return new StandardBankAccount();
    }

    @Override
    public BankProduct createProduct() {
        return new PersonalLoan();
    }
}
