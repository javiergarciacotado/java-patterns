package com.owned.design.patterns.behavioral.state.example_1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BugTrackerMainApplication {

    public static void main(String[] args) {
        final BugTrackerContext bugTrackerContext = new BugTrackerContext();
        /**
         * Not really .... Check bugtracker context
         * Tip: Order matters!
         */
        bugTrackerContext.getTestingState().updateHoursWorked(10);
        bugTrackerContext.finishWork();
        log.info("Cost is {}", bugTrackerContext.getCostOfFixingBugForCurrentState());
        log.info("NOT CURRENT STATE (is Customer Support State)");

        bugTrackerContext.getTestingState().updateHoursWorked(20);

        log.info("Cost is {}", bugTrackerContext.getTotalCostOfFixingBug());

    }
}
