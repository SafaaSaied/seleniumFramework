package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.CheckOutPage;
import pages.ProductDetailsPage;
import pages.RegistrationPage;
import pages.SearchPage;
import pages.ShoppingCartPage;
import pages.orderDetailsPage;

public class UserCanCheckOutTest extends TestBase{

	RegistrationPage registerObj;
	SearchPage searchObj;
	ProductDetailsPage productDetailsObj;
	ShoppingCartPage shoppingCartObj;
	CheckOutPage checkoutObj;
	orderDetailsPage orderDetailsObj;

    @Test
	public void userCanCheckOutSuccessfully() throws InterruptedException {
    registerObj= new RegistrationPage(driver);
    searchObj=new SearchPage(driver);
    productDetailsObj=new ProductDetailsPage(driver);
    shoppingCartObj=new ShoppingCartPage(driver);
    checkoutObj=new CheckOutPage(driver);
    orderDetailsObj=new orderDetailsPage(driver);
    searchObj.productSearchUsingAutoSuggest("macb");
    productDetailsObj.AddProductToShoppingCartPage();
    
    driver.navigate().to("https://demo.nopcommerce.com"+"/cart");
    shoppingCartObj.clickOnCheckOutBtn();
    shoppingCartObj.openRegisterPage2();
    
    registerObj.userRegistration("Safaa","saied","safaa19@gmail.com", "x", "123456", "15", "March", "1993");
    shoppingCartObj.clickOnContinueBtn();
    shoppingCartObj.clickOnCheckOutBtn();
    
    checkoutObj.CheckOut("Egypt", "Cairo", "xxx xxxx xxxx", "12345", "01004544454");
    Assert.assertTrue(checkoutObj.successfulOrderMsg.getText().contains("Your order has been successfully processed!"));
    System.out.println("your order is done successfully.");
    Thread.sleep(1000);
    checkoutObj.OpenOrderDetailsPage(); 
  
    orderDetailsObj.downloadInvoice();
    orderDetailsObj.printInvoice();
    
     



	}



}
