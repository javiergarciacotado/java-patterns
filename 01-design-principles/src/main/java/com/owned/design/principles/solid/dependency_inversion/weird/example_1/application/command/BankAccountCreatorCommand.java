package com.owned.design.principles.solid.dependency_inversion.weird.example_1.application.command;

import com.owned.design.principles.solid.dependency_inversion.weird.example_1.domain.BankAccount;
import lombok.Value;

//out of scope
@Value
public class BankAccountCreatorCommand {

    String id;
}
