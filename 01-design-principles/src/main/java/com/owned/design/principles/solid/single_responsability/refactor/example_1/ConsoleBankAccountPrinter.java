package com.owned.design.principles.solid.single_responsability.refactor.example_1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
final class ConsoleBankAccountPrinter implements BankAccountPrinter {

    @Override
    public void print(BankAccount bankAccount) {
//        avoid using sout ALWAYS
//        System.out.println(bankAccount.toString());
        log.info(bankAccount.toString());
    }
}
