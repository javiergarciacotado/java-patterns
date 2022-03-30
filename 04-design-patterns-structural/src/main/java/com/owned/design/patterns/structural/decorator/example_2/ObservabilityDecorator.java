package com.owned.design.patterns.structural.decorator.example_2;

public abstract class ObservabilityDecorator implements Observability {

    private final Observability observability;

    protected ObservabilityDecorator(Observability observability) {
        this.observability = observability;
    }

    @Override
    public String meaning() {
        return observability.meaning();
    }
}
