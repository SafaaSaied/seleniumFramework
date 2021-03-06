package helper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class helper {

	
	
		//method to take screenshot when testCase fail.


		public static void captureScreenShot(WebDriver driver,String screenShotName) {

			Path dest = Paths.get("./screenshots",screenShotName+".png");

			try {
				Files.createDirectories(dest.getParent());
				FileOutputStream out = new FileOutputStream(dest.toString());
				out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
				out.close();




			} catch (IOException e) {

				System.out.println("Exeption While taking screenshot"+e.getMessage());
			}



		}

	}
