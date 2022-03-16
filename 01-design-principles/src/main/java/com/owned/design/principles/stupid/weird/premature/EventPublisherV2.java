package com.owned.design.principles.stupid.weird.premature;

/**
 * Implementing Singleton: the right way
 */
public enum EventPublisherV2 {

    INSTANCE("Some incoming message");

    private String message;

    EventPublisherV2(String message) {
        this.message = message;
    }

    public EventPublisherV2 getInstance() {
        return INSTANCE;
    }
}
