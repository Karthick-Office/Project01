Feature: API Tests

  Background:
    Given the base URL is "http://localhost:8100"

  Scenario: Test Get All Products Endpoint
    When user performs GET request to "/get-shoes"
    Then the response status code should be 200
    And the response body size should be greater than 0

  Scenario: Test Get All Users Endpoint
    When user performs GET request to "/get-users"
    Then the response status code should be 200
    And the response body size should be greater than 0

  Scenario: Test Add Product Endpoint
    When user performs POST request to "/add-shoe" with parameters:
      | id     | 101        |
      | image  | image_url  |
      | name   | SampleShoe |
      | category | Running   |
      | sizes  | 9          |
      | price  | 1000       |
    Then the response status code should be 200

  Scenario: Test Delete Product Endpoint
    When user performs DELETE request to "/delete-shoe" with parameter "id" equal to 101
    Then the response status code should be 200

  Scenario: Test Update Product Endpoint
    When user performs PUT request to "/update-shoe" with parameters:
      | id     | 101        |
      | image  | image_url  |
      | name   | SampleShoe |
      | category | sports   |
      | sizes  | 9          |
      | price  | 1000       |
    Then the response status code should be 200
