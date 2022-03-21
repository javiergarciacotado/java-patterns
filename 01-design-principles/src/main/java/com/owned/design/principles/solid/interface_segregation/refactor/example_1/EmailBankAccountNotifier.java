package com.owned.design.principles.solid.interface_segregation.refactor.example_1;

public interface EmailBankAccountNotifier {

    void notify(String recipient, String subject, String message);
}
