package com.owned.design.principles.solid.dependency_inversion.weird.example_1.domain;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class BankAccount {

    String id;
    String name;
    BigDecimal money;

    public BigDecimal calculateBalance() {
        return BigDecimal.ZERO;
    }

    public boolean withdraw(BigDecimal money, String targetAccountId) {
        return false;
    }

    public boolean deposit(BigDecimal money, String sourceAccountId) {
        return false;
    }
}
