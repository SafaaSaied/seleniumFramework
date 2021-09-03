package tests;


import org.testng.annotations.Test;

import data.loadProperties;

import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import pages.loginPage;

public class RegistrationTestUsingDDTandProperitiesFile extends TestBase {

	HomePage homeObject;
	RegistrationPage registerObject;
	loginPage loginObj;
	MyAccountPage myAccObj;


	//variables bt2ra mn eluser data file
	String fn=loadProperties.userData.getProperty("fn");
	String ln=loadProperties.userData.getProperty("ln");
	String email=loadProperties.userData.getProperty("email");
	String company=loadProperties.userData.getProperty("company");
	String pass=loadProperties.userData.getProperty("pass");
	String day=loadProperties.userData.getProperty("day");
	String month=loadProperties.userData.getProperty("month");
	String year=loadProperties.userData.getProperty("year");



	@Test
	public void userCanRegisterSuccessufully() {
		homeObject=new HomePage(driver);
		homeObject.OpenRegistrationPage();


		registerObject=new RegistrationPage(driver);


		registerObject.userRegistration(fn, ln, email,company, pass,day,month,year);


		//Assert.assertTrue(registerObject.registerSucessMsg.getText().contains("Your registration completed"));
		//System.out.println("your register fn is done : " + registerObject.registerSucessMsg.getText());




		/*
			else if (registerObject.UniqueMailErrorMsg.getText().contains("The specified email already exists"))
			{

				System.out.println("please change the email : This Email Address has been taken before.");
			}


			else {System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");}


		 */

	}




}
