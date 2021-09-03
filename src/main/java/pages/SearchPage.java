package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage  extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
			}
	
	
	@FindBy(id = "small-searchterms")
	WebElement searchTxtBox;
	
	
	@FindBy(css = "input.button-1.search-box-button")
	WebElement searchBtn;
	
	//import java.utility
	// ul element from inspect
	@FindBy(id = "ui-id-1")
	List<WebElement> productList;
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	WebElement productTitle;
	
	//void tt3amel m3 elelements ely tl3tha de
	
	public void productSearch(String productName) {
		SetTxtElemetTxt(searchTxtBox, productName);
		ClickBtn(searchBtn);
		
	}
	
	public void openProductDetailsPage() {
		
    ClickBtn(productTitle);
		
	}
	
	public void productSearchUsingAutoSuggest(String searchTxt) {
		SetTxtElemetTxt(searchTxtBox, searchTxt);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		productList.get(0).click();
		
		
	}
	

}
