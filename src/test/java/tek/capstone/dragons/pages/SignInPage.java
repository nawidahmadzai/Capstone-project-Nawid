package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class SignInPage extends BaseSetup{
	
	public SignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy (linkText = "TEKSCHOOL")
	public WebElement tekSchoolLogo;
	@FindBy (id = "signinLink")
	public WebElement signINBttn;
	@FindBy (id = "email")
	public WebElement emailInput;
	@FindBy (id = "password")
	public WebElement passwordInput;
	@FindBy (id = "loginBtn")
	public WebElement loginBtn;
	@FindBy (id = "accountLink")
	public WebElement accountLink;
	@FindBy (id = "newAccountBtn")
	public WebElement createNewAccountBtn;
	@FindBy (id = "nameInput")
	public WebElement nameInput;
	@FindBy (id = "emailInput")
	public WebElement emailInputForNewAccount;
	@FindBy (id = "passwordInput")
	public WebElement passwordInputForNewAccount;
	@FindBy (id = "confirmPasswordInput")
	public WebElement confirmPassword;
	@FindBy (id ="signupBtn")
	public WebElement signUpBtn;
	@FindBy (xpath = "//div[@class='account__personal']//h1")
	public WebElement yourProfile;
	
}
