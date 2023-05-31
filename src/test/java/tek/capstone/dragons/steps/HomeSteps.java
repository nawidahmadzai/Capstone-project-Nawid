package tek.capstone.dragons.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	    click(factory.homePage().allBtn);
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
	    List<List<String>> data = dataTable.asLists(String.class);
	    for(List<String> row:data) {
	    	String ActualText = factory.homePage().electronics.getText();
	    	String ExpectedText = row.get(0);
	    	Assert.assertEquals(ExpectedText, ActualText);
	    	String ActualText1 = factory.homePage().computers.getText();
	    	String ExpectedText1 = row.get(1);
	    	Assert.assertEquals(ExpectedText1, ActualText1);
	    	String ActualText2 = factory.homePage().smartHome.getText();
	    	String ExpectedText2 = row.get(2);
	    	Assert.assertEquals(ExpectedText2, ActualText2);
	    	String ActualText3 = factory.homePage().sports.getText();
	    	String ExpectedText3 = row.get(3);
	    	Assert.assertEquals(ExpectedText3, ActualText3);
	    	String ActualText4 = factory.homePage().automative.getText();
	    	String ExpectedText4 = row.get(4);
	    	Assert.assertEquals(ExpectedText4, ActualText4);
	    }
	}@When("User on <department>")
	public void userOnDepartment() {
	    List<WebElement> dept = factory.homePage().departments;
	    for(WebElement elements : dept) {
	    	elements.click();
	    	break;
	    }
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	    List<List<String>> options = dataTable.asLists(String.class);
	    List<WebElement> depts = factory.homePage().departments;
	    for(int i=0 ; i< options.get(0).size(); i++) {
	    	for(WebElement elements : depts) {
	    		if(elements.getText().equals(options.get(0).get(i))){
	    			Assert.assertTrue(elements.isDisplayed());
	    			logger.info(elements.getText() + "is displayed");
	    		}
	    	}
	    }
	}

}

