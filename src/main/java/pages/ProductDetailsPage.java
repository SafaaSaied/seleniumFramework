package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
			}

	
	@FindBy(css = "strong.current-item")
	public WebElement productNameInBreadCrumb;
	
	@FindBy(css="div.email-a-friend")
	WebElement emailFrinedBtn;
	
//	@FindBy()
	//public WebElement productPriceLabel;
	
	
	@FindBy(id="add-to-wishlist-button-4")
	public WebElement wishlistBtn;
	
	@FindBy(linkText = "wishlist")
	WebElement wishlistPageLink;
	
	
	@FindBy(css = "input.button-2.add-to-compare-list-button")
	WebElement CompareBtn;
	
	@FindBy(id = "add-to-cart-button-4")
	WebElement addToCartBtn;
	
	
	
	public void openSentEmailpage() {
		ClickBtn(emailFrinedBtn);
		
	}
	
	public void addToWishlist() {
		ClickBtn(wishlistBtn);
		//ClickBtn(wishlistPageLink);
	}
	
	public void addToComparePage() {
		ClickBtn(CompareBtn);
		
	}
	
	public void AddProductToShoppingCartPage() {
		ClickBtn(addToCartBtn);
			}
}
