
Feature: Enter login credentials on rediffPage
# The below lines demonstrates the use of Example to password data for data driver testing

Scenario Outline: Enter email and password on ninjaDemo
   
   Given I am on RediffPage
    When I enter '<EmailID>' on the page
    And I enter '<Password>' on the Page 
    And click on Login
  Examples:
  |EmailID|Password|
  |admin@gmail.com|admin@123|