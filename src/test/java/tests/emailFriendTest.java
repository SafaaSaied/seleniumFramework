package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.RegistrationPage;
import pages.SearchPage;
import pages.emailFriendPage;

public class emailFriendTest  extends TestBase{

	
	HomePage homeObject;
	RegistrationPage registerObject;

	SearchPage searchObj;
	ProductDetailsPage productDetailsObj;
	
	String productName="Apple MacBook Pro 13-inch";
	
	
	emailFriendPage emailFriendObj;
	
	
	

	

	String fn="Safaa";
	String ln="Saied";
	String email="safaa7@gmail1.com";
	String company="xxx";
	String pass="123456";
	String day="15";
	String month="March";
	String year="1993";
	
	// 1- Registeration
	@Test(priority=1)
	public void userCanRegisterSuccessufully() {
		homeObject=new HomePage(driver);
		homeObject.OpenRegistrationPage();


		registerObject=new RegistrationPage(driver);


		registerObject.userRegistration(fn, ln, email, company, pass,day,month,year);


		Assert.assertTrue(registerObject.registerSucessMsg.getText().contains("Your registration completed"));
		System.out.println("your register fn is done : " + registerObject.registerSucessMsg.getText());

	}
	
	
	//2- Search PAge auto suggest
	
	@Test(priority=2)
	public void UserCanSearchUsingAutoComplete()
	{
		
		try {
			searchObj=new SearchPage(driver);
			searchObj.productSearchUsingAutoSuggest("MacB");
			productDetailsObj=new ProductDetailsPage(driver);
			Assert.assertTrue(productDetailsObj.productNameInBreadCrumb.getText().equalsIgnoreCase(productName));
		
		} catch (Exception e) {
			System.out.println("Error occured  " + e.getMessage());
		}
		
		
		
	}
	
	
	
	
	
	
	//3- Email friend page
	
	
	@Test(priority=3)
	public void userCanEmailFriend() {
		productDetailsObj=new ProductDetailsPage(driver);
		productDetailsObj.openSentEmailpage();
		
		emailFriendObj=new emailFriendPage(driver);
		emailFriendObj.sendEmailToFriend("test@gmail.com", "this product is good for you.");
		Assert.assertTrue(emailFriendObj.sucessMsg.getText().contains("Your message has been sent."));
		
	}
	
	
	
	
	//4- logout
	@Test(priority=4)
	public void userCanLogout() {
		registerObject.Logout();

		System.out.println("You Are Logged Out Successfully.");

		}
	
	
	
	
	
}