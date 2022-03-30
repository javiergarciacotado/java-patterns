package com.owned.design.patterns.structural.decorator.example_2;

public class MetricsObservability extends ObservabilityDecorator {

    protected MetricsObservability(Observability observability) {
        super(observability);
    }

    @Override
    public String meaning() {
        return super.meaning() + " metrics enabled";
    }
}
