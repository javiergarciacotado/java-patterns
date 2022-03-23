package com.owned.design.patterns.creational.named_constructor.refactor.example_2;


import java.math.BigDecimal;

/**
 * Very useful for testing
 * 💡 Choose your best implementation: https://ecararus.github.io/BuilderVsObjectMother/
 *
 */
final class BankAccountMother {

    private BankAccountMother() {}

    public static BankAccount createEmptyBankAccount() {
        return new BankAccount("an-id", "a-name", BigDecimal.ZERO);
    }

}
