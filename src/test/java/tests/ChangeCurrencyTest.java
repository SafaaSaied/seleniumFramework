package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;

public class ChangeCurrencyTest extends TestBase{
	
	HomePage homeObj;
	String currencyValue="Euro";
	
	ProductDetailsPage productDetailsObj; //ll asssertion
	
	
	
	
	
	
	@Test
	public void userCanChangeCurrency() {
		homeObj=new HomePage(driver);
		homeObj.changeCurrency(currencyValue);
		
		
		
		
	}
	
	
	
	
	
	

}
