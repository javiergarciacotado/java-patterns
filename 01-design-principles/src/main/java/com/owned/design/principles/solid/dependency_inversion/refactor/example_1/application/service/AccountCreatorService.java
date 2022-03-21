package com.owned.design.principles.solid.dependency_inversion.refactor.example_1.application.service;

import com.owned.design.principles.solid.dependency_inversion.refactor.example_1.application.command.BankAccountCreatorCommand;
import com.owned.design.principles.solid.dependency_inversion.refactor.example_1.domain.BankAccount;
import com.owned.design.principles.solid.dependency_inversion.refactor.example_1.domain.BankAccountRepository;

import java.util.Optional;

public final class AccountCreatorService {

    private final BankAccountRepository bankAccountRepository;

    /**
     * Inversion happens here!
     * @param bankAccountRepository repository to perform outbound operations
     */
    public AccountCreatorService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void create(BankAccountCreatorCommand bankAccountCreatorCommand) {

        final Optional<BankAccount> bankAccountOptional = bankAccountRepository.search(new BankAccount(bankAccountCreatorCommand.getId(), bankAccountCreatorCommand.getName(), bankAccountCreatorCommand.getAmount()));
        bankAccountRepository.save(bankAccountOptional.orElseThrow());
    }
}
