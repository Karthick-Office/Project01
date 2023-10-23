Feature: Automating Star Health Application
@starhealth
  Scenario Outline: Validate the Star Health Buy Now flow
    Given User launches the Star Health application with "<URL>"
    And User waits for the Welcome to Star Health pop-up and closes it
    And User validates the Star Health home page title using a JUnit assertion
    And User clicks on the Buy Now button
    And User types Name as "<FullName>"
    And User types Phone as "<PhNo>"
    And User types the PIN as "<PIN>"
    And User clicks on I need health insurance from the drop-down menu
    And User selects the option "<OptionPlan>"
    And User sees the Plan for My Family page
    And User validates that the mobile number is the same as the previously entered number using a JUnit assertion "<PhNo>"
    And User clicks on the Star Health logo
    And The Application should redirect to the home page
    And User closes the child tab
    And User navigates back to the parent tab

    Examples: 
      | URL                        | FullName | PhNo       | PIN    | OptionPlan |
      | https://www.starhealth.in/ | Karthick | 7397001623 | 636008 | Myself     |
