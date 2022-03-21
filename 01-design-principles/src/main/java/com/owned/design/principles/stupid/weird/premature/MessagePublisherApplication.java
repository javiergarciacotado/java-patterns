package com.owned.design.principles.stupid.weird.premature;

import java.util.concurrent.Executors;

public class MessagePublisherApplication {

    public static void main(String[] args) {

        Executors.newFixedThreadPool(10);

        final EventPublisher eventPublisher = EventPublisher.getInstance("hello world!");
        final EventPublisher eventPublisher2 = EventPublisher.getInstance("another message");
    }
}
