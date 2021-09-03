package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends PageBase {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "gender-male")
	WebElement mGenderBtn;

	@FindBy(id="gender-female")
	WebElement fGenderBtn;
	
	//da elxpath bt3 <div> nfso msh bt3 ay option ,,<div> tag
	@FindBy(xpath="//*[@id=\"gender\"]")
    List<WebElement> GendarOptions;
	
	
	@FindBy(id="FirstName")
	WebElement fnTxtBox;

	@FindBy(id="LastName")
	WebElement lnTxtBox;

	@FindBy(id="Email")
	WebElement emailTxtBox;

	@FindBy(id="Company")
	WebElement CompanyTxtBox;

	@FindBy(id="Newsletter")
	WebElement NewsletterCheckBox;

	@FindBy(id="Password")
	WebElement PassTxtBox;

	@FindBy(id="ConfirmPassword")
	WebElement confirmPassTxtBox;

	@FindBy(id="register-button")
	WebElement registerBtn;

	@FindBy(css = "div.result")
	public  WebElement registerSucessMsg;	


	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public	WebElement logoutBtn;

	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")
	public WebElement UniqueMailErrorMsg;

	@FindBy (css="input.button-1 register-continue-button")
	WebElement continueBtn;



	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
	WebElement dayList;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
	WebElement monthList;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
	WebElement yearList;

	// method to use the elements that i found and do operations on them w h3mlha public 3lshan ast5dmha fi eltest cases



	public void userRegistration(String fn,String ln,String email,String company,String pass,String day,String month,String year) {
		ClickBtn(fGenderBtn);
		SetTxtElemetTxt(fnTxtBox, fn);
		SetTxtElemetTxt(lnTxtBox, ln);
		SetTxtElemetTxt(emailTxtBox, email);
		SetTxtElemetTxt(CompanyTxtBox, company);
		SetTxtElemetTxt(PassTxtBox, pass);
		SetTxtElemetTxt(confirmPassTxtBox, pass);
		SelectFromList(day,dayList);

		SelectFromList(month,monthList);
		SelectFromList(year,yearList);
		//randomMail(emailTxtBox);
		ClickBtn(registerBtn);




	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
	public WebElement dayList2;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
	public WebElement monthList2;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
	public WebElement yearList2;



   //3lshan ageb elxpath bt3 eloptions ely gwa ellist , a5dt ay wa7ed w shelt mn a5ro []  ...sbt a5ro option bs 
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option")
	public List<WebElement> dayOptions2;

	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option")
	public List<WebElement> monthOptions2;

	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option")
	public List<WebElement> yearOptions2;



	public void registrationWithRandomSelectFromList(String fn,String ln,String email,String company,String pass) throws InterruptedException {

		radioBtnRandomChoice(GendarOptions);
		
		SetTxtElemetTxt(fnTxtBox, fn);
		SetTxtElemetTxt(lnTxtBox, ln);
		SetTxtElemetTxt(emailTxtBox, email);
		SetTxtElemetTxt(CompanyTxtBox, company);
		SetTxtElemetTxt(PassTxtBox, pass);
		SetTxtElemetTxt(confirmPassTxtBox, pass);
		Thread.sleep(1000);
		
		randomSelectFromList(dayList2,dayOptions2);
		Thread.sleep(1000);
		randomSelectFromList(monthList2,monthOptions2);
		Thread.sleep(1000);
		randomSelectFromList(yearList2,yearOptions2);
		Thread.sleep(1000);
		ClickBtn(registerBtn);

	}


	public void Logout() {
		ClickBtn(logoutBtn);

	}


	public void clickOnContinueBtn() {
		ClickBtn(continueBtn);

	}



}


