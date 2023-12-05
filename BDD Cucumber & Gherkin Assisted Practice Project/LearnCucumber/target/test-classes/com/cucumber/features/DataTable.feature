
Feature: Rediff Login page
  
 
  # The below lines demonstrates the use of data table to pass multiple data
  
  Scenario: Enter details on the Registration Page
   Given I am on rediff page
   Then User Enters the folliwng registration details
   | FullName | EmailID | Password | retype | alternate | phone |
   | Marc | marc@rediffid.com | password | retypePassword | alternate@gmail.com | 2343534646 |
   | Mia | marc@rediffid.com | password1 | retypePassword | alternate@gmail.com | 2343534646 |
   | James | marc@rediffid.com | password2 | retypePassword | alternate@gmail.com | 2343534646 |
  
  
  