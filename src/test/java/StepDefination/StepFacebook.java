package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;

public class StepFacebook extends BaseClass{
	
	@Before
	public void openBrowser() {
		BaseClass.initialize();
		
	}
	
	@Given("user enter firstname")
	public void user_enter_firstname() {
	   WebElement firstname = driver.findElement(By.name("firstname"));
	   firstname.sendKeys("prachi");
	}

	@Given("user enter lastname")
	public void user_enter_lastname() {
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("jain");
	   
	    
	}

}
