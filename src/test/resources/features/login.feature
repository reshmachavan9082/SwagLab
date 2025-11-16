Feature: test login functionality


Scenario: verify user is able to login into application
Given verify user launches the browser
And user open application url
When user login with valid credentials
Then user should be navigated to product page
And the user quit the browser 