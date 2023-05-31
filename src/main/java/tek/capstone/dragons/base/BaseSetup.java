package tek.capstone.dragons.base;

import java.time.Duration;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.j2objc.annotations.Property;

import tek.capstone.dragons.config.Browser;
import tek.capstone.dragons.config.ChromeBrowser;
import tek.capstone.dragons.config.ChromeHeadless;
import tek.capstone.dragons.config.EdgeBrowser;
import tek.capstone.dragons.config.FireFoxBrowser;
import tek.capstone.dragons.utilities.ReadYamlFiles;

public class BaseSetup {
	private static WebDriver webDriver;
	private final ReadYamlFiles environmentVariables;
	public static Logger logger;
	
	public BaseSetup() {
		String filePath = System.getProperty("user.dir") +"/src/main/resources/env_config.yml";
		String log4jPath = System.getProperty("user.dir")+"/src/main/resources/log4j.properties";
	try {
		environmentVariables = ReadYamlFiles.getInstance(filePath);
	} catch (Exception e) {
		System.out.println("Failed to load env_config Property. Check your filePath");
		throw new RuntimeException("Failed to load env_config file: " + e.getMessage());
	}
	logger = logger.getLogger("logger_file");
	PropertyConfigurator.configure(log4jPath);
	}
	
	public WebDriver getDriver() {
		return webDriver;
	}
	
	public void setupBrowser() {
		HashMap uiProperty = environmentVariables.getYamlProperty("ui");
		String url = uiProperty.get("url").toString().toLowerCase();
		Browser browser;
		switch(uiProperty.get("browser").toString().toLowerCase()) {
		case "chrome":
		if((boolean) uiProperty.get("headless")) {
			browser = new ChromeHeadless();
		}else {
			browser = new ChromeBrowser();
		}
		webDriver = browser.openBrowser(url);
		break;
		case "firefox":
			browser = new FireFoxBrowser();
			webDriver = browser.openBrowser(url);
			break;
		case "edge":
			browser = new EdgeBrowser();
			webDriver = browser.openBrowser(url);
			default:
				throw new RuntimeException("Browser name in config file doesnot match any of the cases");
		
		}
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
	}
	public void quitBrowser() {
		if(webDriver != null)
		webDriver.quit();
	}
	
}



