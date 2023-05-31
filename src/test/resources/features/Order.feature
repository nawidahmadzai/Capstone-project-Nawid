@REGRESSION
Feature: Retail Order Page

@Order 
Scenario: Verify User can add an item to cart
		Given User is on retail website
		When User click on Sign in option
		And User enter email 'student@tekschool.us' and password 'Tek@School1'
		And User click on login button
		And User should be logged in into Account
		And User change the category to 'Smart Home'
		And User search for an item 'kasa outdoor smart plug'
		And User click on Search icon
		And User click on item
		And User select quantity '2'
		And User click add to Cart button
		Then the cart icon quantity should change to '2'

@Order2
Scenario: Verify User can place an order with Shipping address and payment Method on file​​​​​​​
		Given User is on retail website
		When User click on Sign in option
		And User enter email 'student@tekschool.us' and password 'Tek@School1'
		And User click on login button
		And User should be logged in into Account
		And User change the category to 'Electronics' And User search for an item 'Apex Legends'
		And User click on Search icon
		And User click on the item
		And User select the quantity '5'
		And User click add to Cart button
		Then in the cart icon quantity should change to '7'
		And User click on Cart option
		And User click on Proceed to Checkout button
		And User click on Place Your Order
		Then an order message should be displayed 'Order Placed, Thanks'
		
@CancelOrder
Scenario: Verify User can cancel the order
		Given User is on retail website
		When User click on Sign in option
		And User enter email 'student@tekschool.us' and password 'Tek@School1'
		And User click on login button
		And User should be logged in into Account
		And User click on Orders section
		And User click on first order in list
		And User click on Cancel The Order button
		And User select the cancelation Reason 'Bought wrong item'
		And User click on Cancel Order button
		Then a cancelation message should be displayed 'Your Order Has Been Cancelled'
@ReviewOrder
Scenario: Verify User can write a review on order placed
		Given User is on retail website
		When User click on Sign in option
		And User enter email 'student@tekschool.us' and password 'Tek@School1'
		And User click on login button
		And User should be logged in into Account
		And User click on Orders section
		And User click on first order in list
		And User click on Review button
		And User write Review headline  'Very Bad' and 'The prodct is not as same as defined'
		And User click Add your Review button
		Then a review message should be displayed 'Your review was added successfully'



