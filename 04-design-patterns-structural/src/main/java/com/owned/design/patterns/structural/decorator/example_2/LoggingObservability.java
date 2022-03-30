package com.owned.design.patterns.structural.decorator.example_2;

public class LoggingObservability extends ObservabilityDecorator {

    protected LoggingObservability(Observability observability) {
        super(observability);
    }

    @Override
    public String meaning() {
        return super.meaning() + ", logging enabled";
    }
}
