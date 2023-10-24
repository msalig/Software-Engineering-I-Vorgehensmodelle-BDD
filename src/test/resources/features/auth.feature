Feature: User Authentication

  Scenario: Successful authentication with a SmartCard
    Given the user inserts a SmartCard
    When the system verifies the SmartCard
    Then the user is authenticated

  Scenario: Failed authentication with a SmartCard
    Given the user inserts a SmartCard
    When the system verifies the SmartCard
    Then the user is not authenticated