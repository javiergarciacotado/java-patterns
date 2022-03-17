package com.owned.design.principles.solid.dependency_inversion.weird.example_1.adapter.out;

import com.owned.design.principles.solid.dependency_inversion.weird.example_1.domain.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class InMemoryBankAccountRepository {

    private final Map<String, BankAccount> repository = new HashMap<>();

    public Optional<BankAccount> search(BankAccount bankAccount) {
        return Optional.ofNullable(repository.get(bankAccount.getId()));
    }

    public void save(BankAccount bankAccount) {
        repository.put(UUID.randomUUID().toString(), bankAccount);
    }
}
