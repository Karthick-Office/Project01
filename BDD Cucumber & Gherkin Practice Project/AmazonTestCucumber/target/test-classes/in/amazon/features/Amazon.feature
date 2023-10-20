@Amazon
Feature: Amazon Shopping
  As a registered Amazon user
  I want to log in, search for and purchase a product, and receive a confirmation
  So that I can complete my shopping on Amazon

  Background: 
    Given I am a registered Amazon user
    And I am on the Amazon homepage

  @Login
  Scenario: User Login
    When I log in with my Amazon credentials
    Then I should be successfully logged in

  @Search
  Scenario Outline: Search for a Product and Purchase
    When I search for "<product_name>" in the Amazon search bar
    And I add the product to my Amazon shopping cart
    And I proceed to checkout
    And I confirm my order

  @Logout
  Scenario: User Logout
    When I log out of my Amazon account
    Then I should be logged out successfully

  @InvalidLogin
  Scenario: Invalid User Login
    When I attempt to log in with invalid Amazon credentials
    Then I should see an error message
