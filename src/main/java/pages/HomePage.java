package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);                         //3ml add ll constractor da zy elparent
		jse=(JavascriptExecutor) driver;
		
		action = new Actions(driver);
	}

	@FindBy(linkText = "Register")
	WebElement registerLink;	


	@FindBy(linkText = "Log in")
	WebElement loginLink;

	@FindBy(linkText= "Contact us")
	WebElement contactUsLink;

	@FindBy(id="customerCurrency")
	WebElement currencyDropDownList;
	
	//@FindBy(linkText ="Computers")
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement computerMenu;
	
	@FindBy(linkText ="Notebooks")
	WebElement notebookMenu;

	public void OpenRegistrationPage() {
		ClickBtn(registerLink);

	}

	public void OpenLoginPage() {
		ClickBtn(loginLink);
	}

	public void openContactUs() {
		scrollToButtom();
		ClickBtn(contactUsLink);
	}

public void changeCurrency(String value) {
	SelectFromList(value,currencyDropDownList);
	
}

public void selectNotebooksMenu() {
 action.moveToElement(computerMenu).build().perform();
 action.moveToElement(notebookMenu).click().build().perform();
 
    //action
	//.moveToElement(computerMenu)
	//.moveToElement(notebookMenu)
	//.click()
//	.build()
	//.perform();
	
}
}
