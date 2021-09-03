package tests;


import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import pages.loginPage;

public class RegistrationTest extends TestBase {

	HomePage homeObject;
	RegistrationPage registerObject;
	loginPage loginObj;
	MyAccountPage myAccObj;

	String fn="Safaa";
	String ln="Saied";
	String email="safaa5@gmail1.com";
	String company="xxx";
	String pass="123456";
	String day="15";
	String month="March";
	String year="1993";

	


	@Test
	public void userCanRegisterSuccessufully() {
		homeObject=new HomePage(driver);
		homeObject.OpenRegistrationPage();


		registerObject=new RegistrationPage(driver);


		registerObject.userRegistration(fn, ln, email,company, pass,day,month,year);


		Assert.assertTrue(registerObject.registerSucessMsg.getText().contains("Your registration completed"));
		System.out.println("your register fn is done : " + registerObject.registerSucessMsg.getText());




		/*
			else if (registerObject.UniqueMailErrorMsg.getText().contains("The specified email already exists"))
			{

				System.out.println("please change the email : This Email Address has been taken before.");
			}


			else {System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");}


		 */

	}

	@Test(priority=2)
	public void userCanLogout() {
		registerObject.Logout();

		System.out.println("You Are Logged Out Successfully.");

	}



	@Test(priority=3)
	public void RegisteredUserCanLogin() {

		
		homeObject.OpenLoginPage();

			
		loginObj=new loginPage(driver);
		loginObj.login(email,pass);
		System.out.println("Done...Registered User Can Login Successfully.");
		
		//registerObject.Logout();
		//System.out.println("Done...Registered User Can Login Successfully. And Now Your are logged out once again.");



	}


	@Test(dependsOnMethods = "RegisteredUserCanLogin")
	public void editPersonalDataSuccessfully() {
		loginObj.openMyAccPage();
		
		myAccObj=new MyAccountPage(driver);
		myAccObj.editPersonalInfo("Safaa1","Saied1", email, "Company1", pass, day, month, year);
		
		
	}
	
	

}
