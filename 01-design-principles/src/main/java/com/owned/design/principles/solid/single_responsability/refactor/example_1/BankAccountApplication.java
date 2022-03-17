package com.owned.design.principles.solid.single_responsability.refactor.example_1;

import java.math.BigDecimal;

final class BankAccountApplication {

    public static void main(String[] args) {
        final BankAccount bankAccount = new BankAccount("", "", BigDecimal.ZERO);

        //client needs to print status
        final BankAccountPrinter bankAccountPrinter = new HtmlBankAccountPrinter();
        bankAccountPrinter.print(bankAccount);

    }
}
