package tek.capstone.dragons.steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class OrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		selectByVisibleText(factory.orderPage().category, string);
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.orderPage().searchInput , string);
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchBtn);
		
	}
	@When("User click on item")
	public void userClickOnItem() {

	waitTillPresence(factory.orderPage().kasaProduct);
	   click(factory.orderPage().kasaProduct);
	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		
	    selectByVisibleText(factory.orderPage().quantity , string);
	    
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
	    click(factory.orderPage().addToCartBtn);
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
//		fluientWaitforElement(factory.orderPage().CartQuantity , 20,20);
		slowDown();
	    String ActualResult = factory.orderPage().CartQuantity.getText();
	    String ExpectedResult = string;
	    Assert.assertEquals(ExpectedResult, ActualResult);;
	}
	@When("User change the category to {string} And User search for an item {string}")
	public void userChangeTheCategoryToAndUserSearchForAnItem(String string, String string2) {
		selectByVisibleText(factory.orderPage().category , string);
		sendText(factory.orderPage().searchInput , string2);
	}
	@When("User click on the item")
	public void userClickOnTheItem() {
	    click(factory.orderPage().apexLegends);
	}
	@When("User select the quantity {string}")
	public void userSelectTheQuantity(String string) {
		slowDown();
		selectByValue(factory.orderPage().quantity , string);
	}
	@Then("in the cart icon quantity should change to {string}")
	public void inTheCartIconQuantityShouldChangeTo(String string) {
	    String ExpectedResult = string;
	    String ActualResult = getText(factory.orderPage().CartQuantity);
	    Assert.assertEquals(ExpectedResult, ActualResult);
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.orderPage().cartBttn);
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.orderPage().proceedToCheckoutBtn);
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.orderPage().placeYourOrderBtn);
	}
	@Then("an order message should be displayed {string}")
	public void anOrderMessageShouldBeDisplayed(String string) {
	   String expectedTxt = string;
	   String actualTxt = factory.orderPage().orderPlacedMessage.getText();
	   Assert.assertEquals(expectedTxt, actualTxt);
	}
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.orderPage().OrdersLink);
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	    click(factory.orderPage().order5062details);
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		waitTillClickable(factory.orderPage().cancelOrderBtn);
	   click(factory.orderPage().cancelOrderBtn);
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
	    selectByVisibleText(factory.orderPage().cancellationReasonDropdown , string);
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.orderPage().cancellationSubmitBtn);
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
	    Assert.assertTrue(factory.orderPage().cancellationConfirmText.isDisplayed());
	}
	@When("User click on second order in list")
	public void userClickOnSecondOrderInList() {
	    click(factory.orderPage().order5278Details);
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnBttn);
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
	    selectByVisibleText(factory.orderPage().returnReasonDropdown , string);
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
	    selectByVisibleText(factory.orderPage().dropOffServiceDropdown , string);
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.orderPage().returnSubmitBttn);
	}
	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String string) {
	    String actualText = factory.orderPage().returnConfirmText.getText();
	    String expectedText = string;
	    Assert.assertEquals(expectedText, actualText);
	}
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().reviewButton);
	}
	@When("User write Review headline  {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
	    sendText(factory.orderPage().reviewHeadline , string);
	    sendText(factory.orderPage().reviewTextInput , string2);
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	   click(factory.orderPage().addReviewButton);
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
	   String ActualText = factory.orderPage().reviewAddedText.getText();
	   String ExpectedText = string;
	   Assert.assertEquals(ExpectedText, ActualText);
	   logger.info(ActualText + "is the text");
	}

	
}
