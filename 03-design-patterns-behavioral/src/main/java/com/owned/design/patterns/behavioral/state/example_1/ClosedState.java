package com.owned.design.patterns.behavioral.state.example_1;

/**
 * Bug is in Closed state. This is the terminal state for purposes of demo.
 * <p>
 * In reality, we could re-open a bug and send it back to Engineering - we'd do this
 * in the setNextState() like before.
 *
 */
public class ClosedState implements BugState {

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
    public ClosedState(BugTrackerContext bugTrackerContext) {
        this.bugTrackerContext = bugTrackerContext;

        // init this object's internal state
        bugCost = 0;
    }

    public void updateHoursWorked(int hoursWorked) {
        // does nothing, as bug closed and nobody working on it
    }

    public int getCost() {
        return bugCost;
    }

    @Override
    public void setNextState() {
        throw new IllegalStateException("We've hit the end of road for this demo...");
    }
}
