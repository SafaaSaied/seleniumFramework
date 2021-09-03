package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductTest extends TestBase {


	SearchPage searchObj;
	ProductDetailsPage productDetailsObj;
	String productName="Apple MacBook Pro 13-inch";


	@Test
	public void userCanSearchForProduct() {

		searchObj=new SearchPage(driver);
		searchObj.productSearch(productName);
	    

		productDetailsObj=new ProductDetailsPage(driver);
		
		searchObj.openProductDetailsPage();
		Assert.assertTrue(productDetailsObj.productNameInBreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(productDetailsObj.productNameInBreadCrumb.getText(), productName);

	}




}
