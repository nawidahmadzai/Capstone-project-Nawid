@REGRESSION
Feature: Sign in Feature
Background:
		Given User is on retail website
		When User click on Sign in option
@test
Scenario: Verify user can sign in into Retail Application
	And User enter email 'student@tekschool.us' and password 'Tek@School1'
	And User click on login button
	Then User should be logged in into Account
@SignUp
Scenario: Verify user can create an account into Retail Website
		And User click on Create New Account button
		And User fill the signUp information with below data
		| name | email | password | confirmPassword |
		| JhonBobbb| JonBob865@tekschool.us | JhonBob@12345 | JhonBob@12345 |
		And User click on SignUp button
		Then User should be logged into account page
