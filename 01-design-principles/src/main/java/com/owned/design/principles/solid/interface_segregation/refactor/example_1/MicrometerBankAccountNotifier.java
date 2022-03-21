package com.owned.design.principles.solid.interface_segregation.refactor.example_1;

public interface MicrometerBankAccountNotifier {

    void notify(String url, String metricName, String description, String message);
}
