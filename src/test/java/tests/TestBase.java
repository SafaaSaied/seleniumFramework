package tests;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import helper.helper;
import io.cucumber.testng.AbstractTestNGCucumberTests;


public class TestBase extends AbstractTestNGCucumberTests{


	public static WebDriver driver;
	public static String downloadPath= System.getProperty("user.dir")+"/downloads";
	
	public static ChromeOptions chromeOption() {
		ChromeOptions options=new ChromeOptions();
		HashMap<String,Object> chromePrefs= new HashMap<String, Object>();
		
		chromePrefs.put("profile.default.content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		options.setExperimentalOption("prefs", chromePrefs);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		
		return options;
	}
	




	@BeforeSuite
	public void StartDriver() {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver=new ChromeDriver(chromeOption());


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);

		driver.navigate().to("http://demo.nopcommerce.com/");

	}




	@AfterSuite
	public void StopDriver() {
		driver.quit();

	}



	@AfterMethod                     //ITestResult da interface byrg3le b kol elresult eza kant fail,pass wla skip
	public void screenshotOnFailure(ITestResult result) {

		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failed");
			System.out.println("Taking ScreenShot ....");
			helper.captureScreenShot(driver,result.getName());

		}


	}





}
