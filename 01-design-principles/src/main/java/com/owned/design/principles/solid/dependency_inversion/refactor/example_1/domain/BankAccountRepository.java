package com.owned.design.principles.solid.dependency_inversion.refactor.example_1.domain;

import java.util.Optional;

public interface BankAccountRepository {

    Optional<BankAccount> search(BankAccount bankAccount);

    void save(BankAccount bankAccount);
}
