Feature: fill the checkout details

Background:
Given user is on checkout page 
 Scenario: add product to cart functionality
 When user add product to cart
 And user click cart button
 And user click checkout button
 And user should fill all the personal details below
 
 |first_name|last_name|postal code|
 |Reshma|Chavan|123456|
 |Sonali|Chavan|256325|
 |Atish|chavan|589623|
 
 Then click continue button
 