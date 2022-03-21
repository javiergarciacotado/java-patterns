package com.owned.design.principles.solid.dependency_inversion.refactor.example_1.adapter.out;

import com.owned.design.principles.solid.dependency_inversion.refactor.example_1.domain.BankAccount;
import com.owned.design.principles.solid.dependency_inversion.refactor.example_1.domain.BankAccountRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class InMemoryBankAccountRepository implements BankAccountRepository {

    private final Map<String, BankAccount> repository = new HashMap<>();

    @Override
    public Optional<BankAccount> search(BankAccount bankAccount) {
        return Optional.ofNullable(repository.get(bankAccount.getId()));
    }

    @Override
    public void save(BankAccount bankAccount) {
        repository.put(UUID.randomUUID().toString(), bankAccount);
    }
}
