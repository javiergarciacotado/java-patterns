
package com.owned.design.patterns.behavioral.state.example_1;

/**
 * The State interface.
 * <p>
 * The behaviour of these operations varies depending on which concrete State implementation class is
 * currently executing.
 * </p>
 */
public interface BugState {

  /**
   * Update number of hours worked on a bug in this state.
   *
   * @param hours the hours worked.
   */
  void updateHoursWorked(int hours);

  /**
   * Returns cost of the bug fix for this state.
   *
   * @return the cost.
   */
  int getCost();

  /**
   * Sets the next State.
   */
  void setNextState();
}
