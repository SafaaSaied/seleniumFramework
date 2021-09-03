package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class emailFriendPage extends PageBase {

	public emailFriendPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "FriendEmail")
	WebElement friendEmailTxt;
	
	@FindBy(id = "YourEmailAddress")
	WebElement myEmail;
	
	
	@FindBy(id="PersonalMessage")
	WebElement personalMsg;
	
	@FindBy(name="send-email")
	WebElement sendMailBtn;
	
	@FindBy (css="div.result")
	public WebElement sucessMsg;
	
	public void sendEmailToFriend(String Fmail, String msg) {
		SetTxtElemetTxt(friendEmailTxt, Fmail);
	//	SetTxtElemetTxt(myEmail, myMail);
		SetTxtElemetTxt(personalMsg, msg);
		ClickBtn(sendMailBtn);
		
		
	}
}
