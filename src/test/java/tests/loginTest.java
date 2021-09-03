package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegistrationPage;
import pages.loginPage;

public class loginTest extends TestBase {

	HomePage homeObject;
	RegistrationPage registerObj;
	loginPage loginObj;


	String email="safaa@gmail.com";
	String pass="123456";


    @Test
	public void userCanLoginSuccessfully() {
		homeObject=new HomePage(driver);
		registerObj=new RegistrationPage(driver);
		loginObj=new loginPage(driver);

		homeObject.OpenLoginPage();
		loginObj.login(email, pass);
		
		Assert.assertTrue(registerObj.logoutBtn.isDisplayed());
		
		System.out.println("Your login fn is working Successfully.");
		
		
	

	}








}
