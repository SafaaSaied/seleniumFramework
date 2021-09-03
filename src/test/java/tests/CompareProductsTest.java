package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ComparePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class CompareProductsTest extends TestBase {

	String firstProductName="Apple MacBook Pro 13-inch";
	String secondProductName="Asus N551JK-XO076H Laptop";

	SearchPage searchObj;
	ProductDetailsPage productDetailsObj;
	ComparePage compareObj;



     @Test(priority=1)
	public void userCanCompareProducts() throws InterruptedException {
		searchObj=new SearchPage(driver);
		productDetailsObj=new ProductDetailsPage(driver);
		compareObj=new ComparePage(driver);
        
		searchObj.productSearchUsingAutoSuggest(firstProductName);
		productDetailsObj.addToComparePage();
		
		
		searchObj.productSearchUsingAutoSuggest(secondProductName);
		productDetailsObj.addToComparePage();
		//sleep b3d ma 3ml compare w 2bl ma y3ml redirect ll page eltanya 3lshan yl72 y7oto fi eltable
		Thread.sleep(2000);
		driver.navigate().to("http://demo.nopcommerce.com"+"/compareproducts");
		Assert.assertTrue(compareObj.pageTitle.isDisplayed());
		System.out.println("You Already in this page :" + " " + compareObj.pageTitle.getText());
		
		Assert.assertTrue(compareObj.displayedProductName1.getText().contains("Apple MacBook Pro 13-inch"));
		System.out.println("Here is Your First Product: " + "" + compareObj.displayedProductName1.getText());
		
		Assert.assertTrue(compareObj.displayedProductName2.getText().contains("Asus N551JK-XO076H Laptop"));
		System.out.println("Here is Your Second Product: " + "" + compareObj.displayedProductName2.getText());
		
		
		
	    compareObj.addToComparePage();
		
        

	}

    @Test(priority=2)
	public void userCanClearComparedProducts() {
     compareObj.clearComaprisonProducts();
     Assert.assertTrue(compareObj.ClearMsg.getText().contains("You have no items to compare."));
     System.out.println("Now Your Compare List is Empty !!! ");

	}




}
