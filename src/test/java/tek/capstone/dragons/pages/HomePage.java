package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class HomePage extends BaseSetup {
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
   @FindBy (id = "hamburgerBtn")
   public WebElement allBtn;
   @FindBy (xpath = "//span[text()='Electronics']")
   public WebElement electronics;
   @FindBy (xpath = "//span[text()='Computers']")
   public WebElement computers;
   @FindBy (xpath = "//span[text()='Smart Home']")
   public WebElement smartHome;
   @FindBy (xpath = "//span[text()='Sports']")
   public WebElement sports;
   @FindBy (xpath = "//span[text()='Automative']")
   public WebElement automative;
   @FindBy (xpath = "//div[@class='sidebar_content-item']")
   public List<WebElement> departments;
}
