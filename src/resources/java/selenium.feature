Feature: Functional Testiong on TestMe
Scenario: valid login

Given User has launched tesetme app in the browser
When User enters "Lalitha" & "password123"
And click on the  login button
Then User must be logged in successfully