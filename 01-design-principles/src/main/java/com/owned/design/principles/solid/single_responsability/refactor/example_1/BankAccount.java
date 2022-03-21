package com.owned.design.principles.solid.single_responsability.refactor.example_1;

import lombok.Value;

import java.math.BigDecimal;

@Value
class BankAccount {

    String id;
    String name;
    BigDecimal money;
}
