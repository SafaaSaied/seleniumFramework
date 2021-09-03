package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;
import tests.TestBase;

public class userRegistration extends TestBase{
	

	HomePage homeObj;
	RegistrationPage registerObj;
	
	
	
	@Given("the user in the home page")
	public void the_user_in_the_home_page() {
		homeObj=new HomePage(driver);
		homeObj.OpenRegistrationPage();
	}

	
	@When("the user clicks on register link")
	public void the_user_clicks_on_register_link() {
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	    
	}
	
	
	
	/*
	 * @When("he entered his data") public void he_entered_his_data() throws
	 * InterruptedException {
	 * 
	 * registerObj=new RegistrationPage(driver); Thread.sleep(2000);
	 * registerObj.userRegistration("safaa","saied","safaaasa11wsad@gmailll.com","x"
	 * ,"12345678","15","March","1993");
	 * 
	 * }
	 */
	
	
	@When("he entered his {string},{string},{string} ,{string},{string},{string},{string},{string}")
	public void he_entered_his(String firstname, String lastname, String email, String companyname, String password, String day, String month, String year) throws InterruptedException {
		registerObj=new RegistrationPage(driver); 
		Thread.sleep(2000);
		  registerObj.userRegistration(firstname, lastname, email, companyname, password, day, month, year);
	}
	
	@Then("the registration page displayed successfully")
	public void the_registration_page_displayed_successfully() throws InterruptedException {
		registerObj.Logout();
		Thread.sleep(2000);
	    
	}
	
}
