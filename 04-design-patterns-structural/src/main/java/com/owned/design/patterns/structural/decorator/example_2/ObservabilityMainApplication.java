package com.owned.design.patterns.structural.decorator.example_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * Use case:
 */
public class ObservabilityMainApplication {

    public static void main(String[] args) {
        log.info("{}", new TracingObservability(new LoggingObservability(new MetricsObservability(() -> "An observable system must include:"))).meaning());
    }
}
