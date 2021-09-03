package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class searchProductUsingAutoSuggest extends TestBase {

	
	SearchPage searchObj;
	ProductDetailsPage productDetailsObj;
	
	String productName="Apple MacBook Pro 13-inch";
	
	
	@Test
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
	
	
	
	
	
	
	
	
	
	
	
	
	
}
