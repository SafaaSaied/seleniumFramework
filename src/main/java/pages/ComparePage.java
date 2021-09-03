package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends PageBase{

	public ComparePage(WebDriver driver) {
		super(driver);
			}

	
	@FindBy(css = "div.page-title")
	public WebElement pageTitle;
	
	@FindBy(css = "table.compare-products-table")
	public WebElement comparisonTable;
	
	@FindBy(tagName = "tr")
	public List<WebElement>allRows;
	
	
	@FindBy(tagName = "td")
	public List<WebElement>allColmns;
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	public WebElement displayedProductName1;
	
	@FindBy(linkText = "Asus N551JK-XO076H Laptop")
	public WebElement displayedProductName2;
	
	
	@FindBy(css = "a.clear-list")
	WebElement ClearListBtn;
	
	@FindBy(css = "div.no-data")
	public WebElement ClearMsg;
	
	
	
	public void addToComparePage() {
		// 1- get all rows numbers
		//System.out.println(allRows.size());
		
		//2- get data from each row
		for (WebElement row:allRows) {
			System.out.println(row.getText()+"\t");
			
			for (WebElement col:allColmns) {
				System.out.println(col.getText()+"\t");
			}
		}
		
		
	}
	
	
	public void clearComaprisonProducts() {
		ClickBtn(ClearListBtn);
		
	}
	
}
