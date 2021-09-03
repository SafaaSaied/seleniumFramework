package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id = "gender-male")
	WebElement mGenderBtn;

	@FindBy(id="gender-female")
	WebElement fGenderBtn;


	@FindBy(id="FirstName")
	//@FindBy(xpath = "//*[@id=\"FirstName\"]")
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

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
	WebElement dayList;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
	WebElement monthList;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
	WebElement yearList;

	@FindBy(id = "save-info-button")
	WebElement saveBtn;


	public void editPersonalInfo(String fn,String ln,String email,String company,String pass,String day,String month,String year) {
		ClickBtn(mGenderBtn);
		SetTxtElemetTxt(fnTxtBox, fn);
		SetTxtElemetTxt(lnTxtBox, ln);

		SelectFromList(day, dayList);
		SelectFromList(month, monthList);
		SelectFromList(year, yearList);

		SetTxtElemetTxt(emailTxtBox, email);
		SetTxtElemetTxt(CompanyTxtBox, company);
		SetTxtElemetTxt(PassTxtBox, pass);
		SetTxtElemetTxt(confirmPassTxtBox, pass);
		ClickBtn(saveBtn);


	}





}
