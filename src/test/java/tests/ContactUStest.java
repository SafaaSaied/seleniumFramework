package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUStest extends TestBase{
	
	
	HomePage homeobj;
	ContactUsPage contactObj;
	
	String fullName="Safaa Saied";
	String email ="safaa@gmail.com";
	String enquiry ="This msg should be sent ... ";
	
	
	
	
	@Test
	public void userCanUseContactUS() {
		homeobj= new HomePage(driver);
		homeobj.openContactUs();
		
		contactObj=new ContactUsPage(driver);
		contactObj.contactUsFn(fullName, email, enquiry);
		Assert.assertTrue(contactObj.successMsg.getText().contains("Your enquiry has been successfully sent to the store owner."));
		System.out.println("ContactUs Form is Sent successfully ...");
		
		
		
	}
	
	
	
	
	

}
