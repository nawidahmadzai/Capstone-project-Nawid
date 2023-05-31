@REGRESSION
Feature: Retail Account Page

Background:
		Given User is on retail website
		When User click on Sign in option
		And User enter email 'student@tekschool.us' and password 'Tek@School1'
		And User click on login button
		Then User should be logged in into Account
		@Update
		Scenario: Verify User can update Profile Information
		When User click on Account option
		And User update Name 'Jhony Mee' 
		And User update Phone '1245487869'
		And User click on Update button
		Then user profile information should be updated
		@Payment
		Scenario: Verify User can add a payment method
		When User click on Account option
		And User click on Add a payment method link
		And User fill Debit or credit card information
	|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
	|1245452145657896| Jhony Mee     |6       |2024    |101   |
		And User click on Add your card button
		Then a message should be displayed 'Payment Method added successfully'
		
		@EditPaymentMethod
		Scenario: Verify User can edit Debit or Credit card
		When User click on Account option
		And User click on Edit option of card section
		And user edit information with below data
		|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
		|1212323265654545       | Jhony Mee Ahmad    |  8        |  2026      |103            |
		And user click on Update Your Card button
		Then a message should be displayed there 'Payment Method updated Successfully'
		
		@RemovePaymentMethod
		Scenario: Verify User can remove Debit or Credit card
		When User click on Account option
		And User click on remove option of card section
		Then payment details should be removed
		
		@Address
		Scenario: Verify User can add an Address
		When User click on Account option
		And User click on Add address option
		And user fill new address form with below information
		|country|fullName|phoneNumber|streetAddress|apt    |city     | state |zipCode|
		|United States  | Jhony Mee  | 7584012565     | 8001 lincolnia rd        |  417 | Alexandria | Mississippi | 31524 |
		And User click Add Your Address button
		Then a message should be displayed  for Address'Address Added Successfully'
		@AddressUpdate
		Scenario: Verify User can edit an Address added on account
		When User click on Account option
		And User click on edit address option
		And user fill update address form with below information
		|country|fullName|phoneNumber|streetAddress|apt       |city     | state |zipCode|
		|United States | Jhony Mee Ahmad | 4152623656  | 323 quantral avenue  |  102 | Arlington | New York | 11232    |
		And User click update Your Address button
		Then a message should be displayed as 'Address Updated Successfully'
		
		
		
		
		
		
