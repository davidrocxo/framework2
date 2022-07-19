Feature: to test tags

  @Smoke
  Scenario: scenario1
    Given "User Given"
    When "User When"
    And "User And"
    Then "User Then"

  @Regression
  Scenario: scenario2
    Given "User Given"
    When "User When"
    And "User And"
    Then "User Then"

  @Smoke @Regression
  Scenario: scenario2
    Given "User Given"
    When "User When"
    And "User And"
    Then "User Then"
