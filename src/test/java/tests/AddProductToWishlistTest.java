package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.RegistrationPage;
import pages.SearchPage;
import pages.wishlistPage;

public class AddProductToWishlistTest extends TestBase {
	
	HomePage homeObject;
	wishlistPage wishlistObj;
	ProductDetailsPage productDetailsObj;
	RegistrationPage registerObject;
	SearchPage searchObj;
	String productName="Apple MacBook Pro 13-inch";
	
	
	
	@Test(priority=1)
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
	
	
	
	
	@Test(priority=2)
	public void userCanAddProductToWishlist() {
		homeObject=new HomePage(driver);
		
		wishlistObj=new wishlistPage(driver);
		productDetailsObj=new ProductDetailsPage(driver);
		registerObject=new RegistrationPage(driver);
		
		
		
		productDetailsObj.addToWishlist();
		driver.navigate().to("https://demo.nopcommerce.com"+"/wishlist");
		
		
		Assert.assertEquals(wishlistObj.AddedProductInWishlist.getText(), "Apple MacBook Pro 13-inch");
		wishlistObj.deleteFromWishList();
		Assert.assertTrue(wishlistObj.deletSuccessMsg.getText().contains("The wishlist is empty!"));
		
		System.out.println("You updated the wishlist correctly");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
