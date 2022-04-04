package com.owned.design.patterns.behavioral.state.example_1;

/**
 * Bug is in Engineering...
 *

 */
public class EngineeringState implements BugState {

    /**
     * Cost per hour for Engineering work
     */
    private static final int HOURLY_RATE = 100;

    /**
     * Reference to the context
     */
    private BugTrackerContext bugTrackerContext;

    /**
     * Internal state of this object - Cost of the bug
     */
    private int bugCost;

    /**
     * Constructor takes the context as an arg.
     *
     * @param bugTrackerContext the bug tracker
     */
    public EngineeringState(BugTrackerContext bugTrackerContext) {
        this.bugTrackerContext = bugTrackerContext;

        // init this object's internal state
        bugCost = 0;
    }

    public void updateHoursWorked(int hoursWorked) {

        bugCost += (hoursWorked * HOURLY_RATE);
    }

    public int getCost() {

        return bugCost;
    }

    @Override
    public void setNextState() {
        bugTrackerContext.setState(bugTrackerContext.getTestingState()); // control which state we go to next
    }
}
