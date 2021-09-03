package tests;


import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import pages.loginPage;

public class RegistrationTestWithJavaFaker extends TestBase {

	HomePage homeObject;
	RegistrationPage registerObject;
	loginPage loginObj;
	MyAccountPage myAccObj;

	Faker fakedata=new Faker();

	String firstName=fakedata.name().firstName();
	String lastName=fakedata.name().lastName();
	String email=fakedata.internet().emailAddress();
	String company=fakedata.company().name();
	String pass=fakedata.number().digits(8).toString();
	//String phone=fakedata.phoneNumber().cellPhone();
    //3mlna fi elpageBase function ll random choice of checkbox



	@Test
	public void userCanRegisterSuccessufully() throws InterruptedException {
		homeObject=new HomePage(driver);
		homeObject.OpenRegistrationPage();

		registerObject=new RegistrationPage(driver);
		Thread.sleep(2000);
		registerObject.registrationWithRandomSelectFromList(firstName, lastName, email, company, pass);

		System.out.println("the data you registered with:" + firstName +" , "+lastName+" , "+email+" , " +company+" , "+ pass);
		Thread.sleep(2000);
		registerObject.Logout();

	}




}
