Feature: Login functionality for Leaftaps Application

#Background:
#Given Launch the browser and Load the URL
@Smoke@Regression
Scenario: Login with Positive credentials

When Enter the username as 'democsr2'
When Enter the password as 'crmsfa'
When Click on Login button
Then HomePage is displayed

@Regression
Scenario: Login with Negative credentials

When Enter the username as 'demo'
When Enter the password as 'crmsfa'
When Click on Login button
But ErrorMsg is displayed