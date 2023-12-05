@Search
Feature: Product search functionality

  Scenario: User searches for a product
    Given user is on the search page
    When user enters a product to search
    Then relevant products should be displayed
