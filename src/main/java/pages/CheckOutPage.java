package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends PageBase {

	public CheckOutPage(WebDriver driver) {
		super(driver);
			}
	
	//@FindBy(css="select.valid")
	@FindBy(name="BillingNewAddress.CountryId")
	WebElement countryDroplist;
	
	
	@FindBy(id="BillingNewAddress_City")
	WebElement cityTxtBox;
	
	
	@FindBy(id="BillingNewAddress_Address1")
	WebElement addressTxtBox;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement zipCodeTxtBox;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phonenumberTxtBox;
	
	@FindBy(css="input.button-1.new-address-next-step-button")
	WebElement continuebtn1;
	
	@FindBy(css="input.button-1.shipping-method-next-step-button")
	WebElement continueBtn2;
	
	
	@FindBy(css="input.button-1.payment-method-next-step-button")
	WebElement continueBtn3;
	
	@FindBy(css="input.button-1.payment-info-next-step-button")
	WebElement continuBtn4;
	
	@FindBy(css="input.button-1.confirm-order-next-step-button")
	WebElement confirmBtn;
	
	
	@FindBy(css="div.title")
	public WebElement successfulOrderMsg;
	
	@FindBy(css="input.button-1.order-completed-continue-button")
	WebElement continueBtn5;
	
	@FindBy(linkText = "Click here for order details.")
	WebElement orderDetailsLink;
	
	public void CheckOut(String country,String city,String address,String zipCode,String phoneNumber) throws InterruptedException {
		Thread.sleep(2000);
		SelectFromList(country, countryDroplist);
		SetTxtElemetTxt(cityTxtBox, city);
		SetTxtElemetTxt(addressTxtBox, address);
		SetTxtElemetTxt(zipCodeTxtBox, zipCode);
		SetTxtElemetTxt(phonenumberTxtBox, phoneNumber);
		ClickBtn(continuebtn1);
		Thread.sleep(2000);
	    ClickBtn(continueBtn2);
	    Thread.sleep(2000);
	    ClickBtn(continueBtn3);
	    Thread.sleep(2000);
	    ClickBtn(confirmBtn);
	    Thread.sleep(2000);
	    //ClickBtn(continueBtn5);
	    
	}
	
	public void OpenOrderDetailsPage(){
		
		ClickBtn(orderDetailsLink);
		
	}
	
	
	
}
