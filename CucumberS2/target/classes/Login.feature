Feature: Login functionality

  Scenario: User logs in with valid credentials
    Given user is on the login page
    When user enters valid credentials
    And clicks the login button
    Then user should be logged in successfully
