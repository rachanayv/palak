Feature:  use of tags in cucumber 
@First
Scenario: Regression Testing 

Given User is testing for  login functionality
Then User able to login successfully

@second
Scenario: System Testing
Given user is testing the search functionality
Then search works successfully


@Demo
Scenario: display the name of tester
Then "Lekha " is tester on TestMe App