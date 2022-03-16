package com.owned.design.principles.stupid.weird.premature;

import java.util.concurrent.Executors;

/**
 * A part of the singleton itself ... do we REALLY need this kind of event publisher?
 */
public class EventPublisher {

    private static EventPublisher INSTANCE;

    private final String message;

    private EventPublisher(String message) {
        this.message = message;
    }

    //ok monothreading - how about multithreading?
    public static synchronized EventPublisher getInstance(String message) {
        if (INSTANCE == null) {
            INSTANCE = new EventPublisher(message);
        }

        return INSTANCE;
    }
}

class MessagePublisherApplication {

    public static void main(String[] args) {

        Executors.newFixedThreadPool(10);

        final EventPublisher eventPublisher = EventPublisher.getInstance("hello world!");
        final EventPublisher eventPublisher2 = EventPublisher.getInstance("another message");
    }
}
