
Feature: Rediff Main page test

# The below statement demonstrates the use of Background Keyword
Background: # this defines the pre-condition
Given User opens the chromeBrowser
When User enters the webpage URL


Scenario: Validate the Page URL

Then Page opens check the URL of the Page
And Fetch the URL of the page
Then user closes the browser

Scenario: Valdiate Page title
Then Page opens check the title of the Page
And Fetch the title of the page
Then user closes the browser

Scenario: Valdiate Loginon the page
When user enters username and passowoed
And User clicks on Login button
Then user closes the browser

