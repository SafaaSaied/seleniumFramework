package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wishlistPage extends PageBase {

	public wishlistPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[5]/a")
	public WebElement AddedProductInWishlist;

	@FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[1]/input")
	WebElement deleteCheckBox;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/input[1]")
	WebElement updateWishlistBtn;

    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/div")
    public WebElement deletSuccessMsg;
    
    
	public void deleteFromWishList() {
		ClickBtn(deleteCheckBox);
		ClickBtn(updateWishlistBtn);
		
		
	}
	
	
	


}
