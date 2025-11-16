
@smoke @regression
Feature: End to end flow for purchase product on SauceDemo site


Background:

Given user launches the browser
And user open application url
And user logs in with valid credentials "standard_user" and "secret_sauce"

Scenario: verify user can complete purchase successfully
When user add product to "Sauce Labs Backpack" to the cart
And user navigate to the cart page
And user click to checkout button
And user enter checkoit details "RESHMA" "CHAVAN" "45613"
And user click on continue button 
And user click on finish button
Then user should show confirmation message "Thank you for your order!"
And user logout from the application
And user quit the browser
