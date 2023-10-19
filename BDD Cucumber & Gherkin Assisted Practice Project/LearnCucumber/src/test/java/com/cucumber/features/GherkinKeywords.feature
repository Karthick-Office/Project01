
Feature: Testing Rediff Login page

  Scenario: User has to test if login on rediff page is successful or not with valid Credentials
    Given User opens rediff Page
    When User validated PageTitle
    Then User enters Username and Password
    And User click on Login.
    Then User closes the browser

