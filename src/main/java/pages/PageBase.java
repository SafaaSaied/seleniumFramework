package pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class PageBase {

	protected WebDriver driver ;
	public JavascriptExecutor jse;
	public Select select;
	public Actions action;
	//create constractor ,, dymn byb2a b esm el class bs msh void
	// w by5od parameter websdriver interface

	public PageBase(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}


	protected static void ClickBtn(WebElement btn) {
		btn.click();

	}


	protected static void SetTxtElemetTxt(WebElement txtElment,String value) {
		txtElment.sendKeys(value);
	}

	//fn to choose from dropdown list ,, Select is a class has methods to interact with droplists and lists... w lw radio button b5tar el id bt3 el male or female msln bs 

	protected static void SelectFromList(String option,WebElement listName) {
		Select selectOption=new Select(listName);
		selectOption.selectByVisibleText(option);
		Assert.assertFalse(selectOption.isMultiple());
	}

	public void scrollToButtom() {
		jse.executeScript("scrollBy(0,2500)");


	}

	public void clearText(WebElement element) {
		element.clear();
	}


	public void randomMail(WebElement element) {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		element.sendKeys("Safaa" + randomInt +"@gmail.com");

	}


	public void randomSelectFromList(WebElement dropdown,List<WebElement> listoptions) throws InterruptedException {
	
		int maxListSize= listoptions.size();
		dropdown.click();

		Thread.sleep(1000);

		int randnMumber = ThreadLocalRandom.current().nextInt(0, maxListSize);

		// Selecting random value
		listoptions.get(randnMumber).click();
		Thread.sleep(2000);
	}

	
	
	
	public void radioBtnRandomChoice(List<WebElement> RadioBtnOptions) {
		Random rnd = new Random();
	    int index = rnd.nextInt(RadioBtnOptions.size());
	    RadioBtnOptions.get(index).click(); 
		
	}
}
