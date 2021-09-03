package tests;


import java.io.IOException;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;

import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import pages.loginPage;

public class registrationTestUsingDDTandExcelsheet extends TestBase {

	HomePage homeObject;
	RegistrationPage registerObject;
	loginPage loginObj;
	MyAccountPage myAccObj;



	//read /get data from excel reader class
	@DataProvider(name="excelData")
	public Object[][] userRegisterData() throws IOException
	{
		

		ExcelReader er=new ExcelReader();   //hena a5d object mn elclass aw elibrary ely 3mlnaha fi step2
		return er.getExcelData();          //hena 3ml return ll array ely 3mlto fi step2 da brdo 
	}

	@Test(dataProvider ="excelData")
	public void userCanRegisterSuccessufully(String firstName,String lastName,String email, String CompanyName,String pass ,String day, String month,String year) throws InterruptedException {
		homeObject=new HomePage(driver);
		homeObject.OpenRegistrationPage();


		registerObject=new RegistrationPage(driver);

        Thread.sleep(2000);
 		registerObject.userRegistration(firstName,lastName,email,CompanyName,pass,day,month,year);
 		 Thread.sleep(2000);
		registerObject.Logout();
		

	}



}
