package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class AddToShoppingCartTest extends TestBase {

	SearchPage searchObj;
	ProductDetailsPage productDetailsObj;
	ShoppingCartPage shoppingCartObj;
	String QuantityValue= "4";

	@Test(priority=1)
	public void UserCanAddProductToShoppingCart() throws InterruptedException {

		searchObj=new SearchPage(driver);
		productDetailsObj=new ProductDetailsPage(driver);
		shoppingCartObj=new ShoppingCartPage(driver);

		searchObj.productSearchUsingAutoSuggest("macb");
		productDetailsObj.AddProductToShoppingCartPage();
		driver.navigate().to("https://demo.nopcommerce.com"+"/cart");
		Assert.assertTrue(shoppingCartObj.PageTitle.getText().contains("Shopping cart"));


		Assert.assertTrue(shoppingCartObj.productDisplayedName.getText().contains("Apple MacBook Pro 13-inch"));
		Thread.sleep(1000);
		shoppingCartObj.updateShoppingCart(QuantityValue);
		Assert.assertTrue(shoppingCartObj.totalPrice.getText().contains("$7,200.00"));
		System.out.println("The Quantity updated successfully.");

	}


	@Test(priority=2)
	public void userCanRemoveProductFromCart() throws InterruptedException {

		shoppingCartObj.removeProductFromShoppingCart();
		Assert.assertTrue(shoppingCartObj.DeleteSuccessfulMsg.getText().contains("Your Shopping Cart is empty!"));
		System.out.println("Products Deleted Successfully.");

	}
















}
