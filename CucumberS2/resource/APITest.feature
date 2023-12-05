@APITest
Feature: Testing Ergast Developer API for 2018 racers data

  Scenario: Verify the API response for 2018 racers data
    Given the Ergast Developer API endpoint for 2018 racers data is "http://ergast.com/api/f1/2018/circuits.json"
    When a GET request is made
    Then the response status code should be 200
    And the response body should not be empty
