package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class SignINSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	    Assert.assertTrue(factory.signInPage().tekSchoolLogo.isDisplayed());
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().signINBttn);
	    
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String string , String string1) {
		sendText(factory.signInPage().emailInput , string);
		sendText(factory.signInPage().passwordInput , string1);
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginBtn);
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		slowDown();
		Assert.assertTrue(factory.signInPage().accountLink.isDisplayed());
	    
	}
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	    click(factory.signInPage().createNewAccountBtn);
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String , String>> data = dataTable.asMaps(String.class , String.class);
	    for(Map<String , String> row : data) {
	    	sendText(factory.signInPage().nameInput , row.get("name"));
	    	sendText(factory.signInPage().emailInputForNewAccount , row.get("email"));
	    	sendText(factory.signInPage().passwordInputForNewAccount , row.get("password"));
	    	sendText(factory.signInPage().confirmPassword , row.get("confirmPassword"));
	    }
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	    click(factory.signInPage().signUpBtn);
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		slowDown();
		Assert.assertTrue(factory.signInPage().yourProfile.isDisplayed());
	   
	}
	
	

}
