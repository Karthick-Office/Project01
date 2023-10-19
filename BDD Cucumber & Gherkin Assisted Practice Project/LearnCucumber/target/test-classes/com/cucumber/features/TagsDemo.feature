# use the syntax @tagname to add tags on the scenarios

# this tag means, all the scenarios to run

@all  
Feature: NinjaDemo Login page

Background:
Given User opens the homepage
Given user clicks on my Account


# The below lines demonstrates the use of Example to password data for data driver testing
@regression @smoke
Scenario: Check user is able to open login page
When User clicks on Login link
Then capture title of the page
And Close the browser
  
 @login  @regression
 Scenario: Loginto the webpage
 When User clicks on Login link
 When user enters username and password
 And user clicks on Login button
 Then capture the title of new page
 And Close the browser
  
 
 
   @logout @smoke
  Scenario: logout of the Page
  When User clicks on logout link
  Then capture title of the page
  And Close the browser
  
  
  
  
