package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		} 

	@FindBy(id="FullName")
   private WebElement fullNameTxt;	
	
	
	@FindBy(id = "Email")
	private WebElement emailTxt;
	
	@FindBy(id = "Enquiry")
	private WebElement enquiryTxt;
	
	@FindBy (name="send-email")
	private WebElement submitBtn;
	
	@FindBy (css = "div.result")
	public  WebElement successMsg;
	
	
	public void contactUsFn(String name, String email , String enquiry) {
		
		SetTxtElemetTxt(fullNameTxt, name);
		SetTxtElemetTxt(emailTxt, email);
		SetTxtElemetTxt(enquiryTxt, enquiry);
		ClickBtn(submitBtn);
		
		
	}
	
	
	
}
