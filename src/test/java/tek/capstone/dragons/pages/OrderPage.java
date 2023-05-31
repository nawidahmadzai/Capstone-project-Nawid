package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class OrderPage extends BaseSetup {
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy (linkText = "TEKSCHOOL")
	public WebElement tekSchoolLogo;
	
	@FindBy (id = "search")
	public WebElement category;
	
	@FindBy (id = "searchInput")
	public WebElement searchInput;
	
	@FindBy (id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy (xpath = "//div//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasaProduct;
	
	@FindBy (xpath = "//select[@class='product__select']")
	public WebElement quantity;
	
	@FindBy (id = "addToCartBtn")
	public WebElement addToCartBtn;
	
	@FindBy (xpath = "//div[@id='cartBtn']//span[@id='cartQuantity']")
	public WebElement CartQuantity;
	@FindBy (xpath = "//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegends;
	@FindBy (id = "cartBtn")
	public WebElement cartBttn;
	@FindBy (id = "proceedBtn")
	public WebElement proceedToCheckoutBtn;
	@FindBy (id = "placeOrderBtn")
	public WebElement placeYourOrderBtn;
	@FindBy (id = "orderLink")
	public WebElement OrdersLink;
	@FindBy (xpath = "//div[@data-id='5062']//div//div[@class='order__header-number']//div//p[text()='Show Details']")
	public WebElement order5062details;
	@FindBy (id = "cancelBtn")
	public WebElement cancelOrderBtn;
	@FindBy (id = "reasonInput")
	public WebElement cancellationReasonDropdown;
	@FindBy (id = "orderSubmitBtn")
	public WebElement cancellationSubmitBtn;
	@FindBy (xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancellationConfirmText;
	@FindBy (id = "reviewBtn")
	public WebElement reviewButton;
	@FindBy (id = "headlineInput")
	public WebElement reviewHeadline;
	@FindBy (id = "descriptionInput")
	public WebElement reviewTextInput;
	@FindBy (id = "reviewSubmitBtn")
	public WebElement addReviewButton;
	@FindBy (xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedText;
	@FindBy (xpath ="//div[text()='Order Placed Successfully']")
	public WebElement orderPlacedMessage;
	@FindBy (xpath = "//div[@data-id='5278']//div//div[@class='order__header-number']//div//p[text()='Show Details']")
	public WebElement order5278Details;
	@FindBy (id = "returnBtn")
	public WebElement returnBttn;
	@FindBy (id = "reasonInput")
	public WebElement returnReasonDropdown;
	@FindBy (id = "dropOffInput")
	public WebElement dropOffServiceDropdown;
	@FindBy (id = "orderSubmitBtn")
	public WebElement returnSubmitBttn;
	@FindBy (xpath = "//div[@class='return__confirm-message']//p[text()='Return was successfull']")
	public WebElement returnConfirmText;
	
	
	
	
	
	
	
	
	
}
