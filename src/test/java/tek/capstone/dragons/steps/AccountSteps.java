package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class AccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
	    click(factory.accountPage().accountLink);
	}
	@When("User update Name {string}")
	public void userUpdateName(String string) {
		clearTextUsingSendKeys(factory.accountPage().nameInputAccount);
	    sendText(factory.accountPage().nameInputAccount , string);
	}
	    
	
	@When("User update Phone {string}")
	public void userUpdatePhone(String string) {
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
	    sendText(factory.accountPage().phoneInput , string);
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() throws InterruptedException {
		click(factory.accountPage().updateBtn);
		Thread.sleep(10000);
	    
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillClickable(factory.accountPage().accountProfileName);getWait();
		String actualText = getElementText(factory.accountPage().accountProfileName);
	    String ExpectedText = "Jhony Mee";
	    Assert.assertEquals(actualText, ExpectedText);
	   
	}
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	    click(factory.accountPage().addPaymentOption);
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String , String>> data = dataTable.asMaps(String.class , String.class);
	    for(Map<String , String> row: data) {
	    	sendText(factory.accountPage().cardNumberInput , row.get("cardNumber"));
	    	sendText(factory.accountPage().nameOnCardInput , row.get("nameOnCard"));
	    	selectByVisibleText(factory.accountPage().expirationMonth , row.get("expirationMonth"));
	    	selectByVisibleText(factory.accountPage().expirationYear , row.get("expirationYear"));
	    	sendText(factory.accountPage().securityCode , row.get("securityCode"));
	    }
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCard);
	    
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		slowDown();
		Assert.assertTrue(factory.accountPage().successPaymentMethodMessage.isDisplayed());
	   
	}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    click(factory.accountPage().mastercardIcon);
	    click(factory.accountPage().editIcon);
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
	    List<Map<String , String>> data = dataTable.asMaps(String.class, String.class);
	    for(Map<String , String > row : data) {
	    	clearTextUsingSendKeys(factory.accountPage().editCardNumberInput);
	    	sendText(factory.accountPage().editCardNumberInput , row.get("cardNumber"));
	    	clearTextUsingSendKeys(factory.accountPage().editNameOnCardInput);
	    	sendText(factory.accountPage().editNameOnCardInput , row.get("nameOnCard"));
	    	selectByVisibleText(factory.accountPage().editExpirationMonthInput , row.get("expirationMonth"));
	    	selectByVisibleText(factory.accountPage().editExpirationYearInput , row.get("expirationYear"));
	    	clearTextUsingSendKeys(factory.accountPage().editSecurityCodeInput);
	    	sendText(factory.accountPage().editSecurityCodeInput , row.get("securityCode"));
	    	
	    }
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	    click(factory.accountPage().editUpdateCardIcon);
	}
	@Then("a message should be displayed there {string}")
	public void aMessageShouldBeDisplayedThere(String string) {
		slowDown();
		Assert.assertTrue(factory.accountPage().editSuccessPaymentMethodMessage.isDisplayed());
	    
	}
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().mastercardIcon);
		click(factory.accountPage().removeIcon);
	    
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.accountPage().addPaymentOption.isDisplayed());
	    
	}
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressIcon);
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	    List<Map<String , String>> data = dataTable.asMaps(String.class, String.class);
	    for(Map<String , String> row : data) {
	    	selectByVisibleText(factory.accountPage().CountryDropdown , row.get("country"));
	    	sendText(factory.accountPage().addressFullName , row.get("fullName"));
	    	sendText(factory.accountPage().addressPhoneNumber , row.get("phoneNumber"));
	    	sendText(factory.accountPage().StreetInput , row.get("streetAddress"));
	    	sendText(factory.accountPage().ApartmentInput , row.get("apt"));
	    	sendText(factory.accountPage().CityInput , row.get("city"));
	    	selectByVisibleText(factory.accountPage().stateDropdown , row.get("state"));
	    	sendText(factory.accountPage().zipCode , row.get("zipCode"));
	    }
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.accountPage().addAddressBtn);
	}
	@Then("a message should be displayed  for Address'Address Added Successfully'")
	public void aMessageShouldBeDisplayedForAddressAddressAddedSuccessfully() {
		slowDown();
	    Assert.assertTrue(factory.accountPage().addressAddedMessage.isDisplayed());
	}
	
	
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    click(factory.accountPage().addressEditIcon);
	}
	@When("user fill update address form with below information")
	public void userFillUpdateAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String , String>> data = dataTable.asMaps(String.class, String.class);
	    for(Map<String , String> row : data) {
	    	selectByVisibleText(factory.accountPage().CountryDropdown , row.get("country"));
	    	clearTextUsingSendKeys(factory.accountPage().addressFullName);
	    	sendText(factory.accountPage().addressFullName , row.get("fullName"));
	    	clearTextUsingSendKeys(factory.accountPage().addressPhoneNumber);
	    	sendText(factory.accountPage().addressPhoneNumber , row.get("phoneNumber"));
	    	clearTextUsingSendKeys(factory.accountPage().StreetInput);
	    	sendText(factory.accountPage().StreetInput , row.get("streetAddress"));
	    	clearTextUsingSendKeys(factory.accountPage().ApartmentInput);
	    	sendText(factory.accountPage().ApartmentInput , row.get("apt"));
	    	clearTextUsingSendKeys(factory.accountPage().CityInput);
	    	sendText(factory.accountPage().CityInput , row.get("city"));
	    	selectByVisibleText(factory.accountPage().stateDropdown , row.get("state"));
	    	clearTextUsingSendKeys(factory.accountPage().zipCode);
	    	sendText(factory.accountPage().zipCode , row.get("zipCode"));
	    }
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	    click(factory.accountPage().addressUpdateBtn);
	}
	@Then("a message should be displayed as {string}")
	public void aMessageShouldBeDisplayedAs(String string) {
		slowDown();
		Assert.assertTrue(factory.accountPage().addressUpdatedMessage.isDisplayed());
	    
	}
}
