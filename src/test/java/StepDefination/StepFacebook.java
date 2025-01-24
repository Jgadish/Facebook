package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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
	@Given("user enter mobile number")
	public void user_enter_mobile_number() {
		 WebElement mobile = driver.findElement(By.name("reg_email__"));
		   mobile.sendKeys("45862");
	}
	@Then("user enter password")
	public void user_enter_password() {
		 WebElement password = driver.findElement(By.name("reg_passwd__"));
		   password.sendKeys("prachi@123");
	}

}
