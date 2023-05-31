package tek.capstone.dragons.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import tek.capstone.dragons.base.BaseSetup;

public class AccountPage extends BaseSetup {
	public AccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
		
	@FindBy (id = "accountLink")
	public WebElement accountLink;
	@FindBy(id = "nameInput")
	public WebElement nameInputAccount;
	@FindBy (id = "personalPhoneInput")
	public WebElement phoneInput;
	@FindBy (id = "personalUpdateBtn")
	public WebElement updateBtn;
	@FindBy (xpath = "//h1[@class='account__information-username']")
	public WebElement accountProfileName;
	@FindBy (xpath ="//p[text()='Add a payment method']")
	public WebElement addPaymentOption;
	@FindBy (id = "cardNumberInput")
	public WebElement cardNumberInput;
	@FindBy (id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	@FindBy (id = "expirationMonthInput")
	public WebElement expirationMonth;
	@FindBy (id = "expirationYearInput")
	public WebElement expirationYear;
	@FindBy (id = "securityCodeInput")
	public WebElement securityCode;
	@FindBy (id = "paymentSubmitBtn")
	public WebElement addYourCard;
	@FindBy (xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement successPaymentMethodMessage;
	@FindBy (xpath = "//div[@class='account__payment-sub']//p[text()='Master Card']")
	public WebElement mastercardIcon;
	@FindBy (xpath = "//button[text()='Edit']")
	public WebElement editIcon;
	@FindBy (id = "cardNumberInput")
	public WebElement editCardNumberInput;
	@FindBy (id = "nameOnCardInput")
	public WebElement editNameOnCardInput;
	@FindBy (id = "expirationMonthInput")
	public WebElement editExpirationMonthInput;
	@FindBy (id = "expirationYearInput")
	public WebElement editExpirationYearInput;
	@FindBy (id = "securityCodeInput")
	public WebElement editSecurityCodeInput;
	@FindBy (id = "paymentSubmitBtn")
	public WebElement editUpdateCardIcon;
	@FindBy (xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement editSuccessPaymentMethodMessage;
	@FindBy (xpath = "//button[text()='remove']")
	public WebElement removeIcon;
	@FindBy (xpath = "//p[text()='Add Address']")
	public WebElement addAddressIcon;
	@FindBy (id = "countryDropdown")
	public WebElement CountryDropdown;
	@FindBy (id = "fullNameInput")
	public WebElement addressFullName;
	@FindBy (id = "phoneNumberInput")
	public WebElement addressPhoneNumber;
	@FindBy (id = "streetInput")
	public WebElement StreetInput;
	@FindBy (id = "apartmentInput")
	public WebElement ApartmentInput;
	@FindBy (id = "cityInput")
	public WebElement CityInput;
	@FindBy (xpath = "//select[@name='state']")
	public WebElement stateDropdown;
	@FindBy (id = "zipCodeInput")
	public WebElement zipCode;
	@FindBy (id = "addressBtn")
	public WebElement addAddressBtn;
	@FindBy (xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedMessage;
	@FindBy (xpath = "//button[text()='Edit']")
	public WebElement addressEditIcon;
	@FindBy (id = "addressBtn")
	public WebElement addressUpdateBtn;
	@FindBy (xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedMessage;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
