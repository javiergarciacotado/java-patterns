package com.owned.design.patterns.structural.decorator.example_2;

public class TracingObservability extends ObservabilityDecorator {

    protected TracingObservability(Observability observability) {
        super(observability);
    }

    @Override
    public String meaning() {
        return super.meaning() + "and tracing enabled";
    }
}
