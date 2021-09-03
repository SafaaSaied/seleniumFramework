package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(css = "div.page-title")
	public WebElement PageTitle ;

	@FindBy(css = "input.qty-input")
	WebElement quantityTxtBox ;

	@FindBy(css = "span.product-subtotal")
	public WebElement totalPrice;

	@FindBy(name="removefromcart")
	WebElement removeCheckBox;

	@FindBy(css = "td.product")
	public WebElement productDisplayedName;

	@FindBy(css = "input.button-2.update-cart-button")
	WebElement updateCartBtn;

	@FindBy(css="div.no-data")
	public WebElement DeleteSuccessfulMsg;



	@FindBy(id="termsofservice")
	WebElement agreeCheckBox;

	@FindBy(id="checkout")
	WebElement checkOutBtn;
    
	@FindBy(css="input.button-1.register-button")
	WebElement registerBtn2;
	
	@FindBy(css="input.button-1.register-continue-button")
    WebElement continueBtn;
	public void updateShoppingCart(String QuantityValue) {
		//quantityTxtBox.clear();
		clearText(quantityTxtBox);
		SetTxtElemetTxt(quantityTxtBox, QuantityValue);
		ClickBtn(updateCartBtn);
	}



	public void removeProductFromShoppingCart() {

		ClickBtn(removeCheckBox);
		ClickBtn(updateCartBtn);

	}
	
	public void clickOnCheckOutBtn() {
		ClickBtn(agreeCheckBox);
		ClickBtn(checkOutBtn);
		
	}
	
	
	public void openRegisterPage2() {
		ClickBtn(registerBtn2);
	}
	
	public void clickOnContinueBtn(){
		
		ClickBtn(continueBtn);
	}
}
