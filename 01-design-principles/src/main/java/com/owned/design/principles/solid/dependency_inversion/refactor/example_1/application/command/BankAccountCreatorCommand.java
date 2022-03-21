package com.owned.design.principles.solid.dependency_inversion.refactor.example_1.application.command;

import lombok.Value;

import java.math.BigDecimal;

//out of scope
@Value
public class BankAccountCreatorCommand {

    String id;
    String name;
    BigDecimal amount;
}
