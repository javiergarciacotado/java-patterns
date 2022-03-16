package com.owned.design.principles.solid.dependency_inversion.weird.example_1.application;

import com.owned.design.principles.solid.dependency_inversion.weird.example_1.adapter.out.InMemoryBankAccountRepository;
import com.owned.design.principles.solid.dependency_inversion.weird.example_1.application.command.BankAccountCreatorCommand;
import com.owned.design.principles.solid.dependency_inversion.weird.example_1.domain.BankAccount;

import java.math.BigDecimal;
import java.util.Optional;

public class AccountCreatorService {

    private InMemoryBankAccountRepository inMemoryBankAccountRepository = new InMemoryBankAccountRepository();

    public void create(BankAccountCreatorCommand bankAccountCreatorCommand) {

        final Optional<BankAccount> bankAccountOptional = inMemoryBankAccountRepository.search(new BankAccount(bankAccountCreatorCommand.getId(), "", BigDecimal.ZERO));
        inMemoryBankAccountRepository.save(bankAccountOptional.orElseThrow());
    }
}
