package com.owned.design.principles.solid.interface_segregation.weird.example_1;

//TODO 16/03/22 - Apply pattern correctly
public interface BankAccountNotifications {

    void notify(String channel, String message); //slack

    void notify(String recipient, String subject, String message); //email

    void notify(String url, String metricName, String description, String message); //Micrometer
}