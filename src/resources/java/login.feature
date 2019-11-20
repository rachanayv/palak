Feature:  for  login 
Scenario Outline: login for TestMe App

Given User must be in login page
When User enters "<username>" and "<password>" 
And performs login
Then User must be in home page 


Examples:
|username||password|
|abc||abc|
|xyz||xyz|