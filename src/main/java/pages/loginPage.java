package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageBase{

	public loginPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id = "Email")
	WebElement emailTxtBox;

	@FindBy(id = "Password")
	WebElement passTxtBox;
	
	@FindBy(css ="input.button-1.login-button")
	WebElement loginBtn;


    @FindBy(id = "RememberMe")
    WebElement rememberMeBtn;
    
    @FindBy(linkText = "Forgot password?")
    WebElement forgotPassLink;
    
    @FindBy(css = "a.ico-account")
    WebElement myAccLink;
    

    
    public void login(String email,String pass) {
    	SetTxtElemetTxt(emailTxtBox, email);
    	SetTxtElemetTxt(passTxtBox, pass);
    	ClickBtn(rememberMeBtn);
    	ClickBtn(loginBtn);
    	
    }
    
    public void openMyAccPage() {
    	
    ClickBtn(myAccLink);	
    }
    
    
}
