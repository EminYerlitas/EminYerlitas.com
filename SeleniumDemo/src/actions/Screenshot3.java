package actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.utils.neotech.CommonMethods;

public class Screenshot3 extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		WebElement login=driver.findElement(By.name("email"));
		 TakesScreenshot a=(TakesScreenshot) login;
	        File screenshot= a.getScreenshotAs(OutputType.FILE);
	        File screenshotFolder=new File("screenshotFolder/Homework1");
	        try {
	        	if(!screenshotFolder.exists()) {
	        		screenshotFolder.mkdirs();
	        	}
	        	File screenshotPath=new File("screenshotFolder/Homework1/facebook-login.png");
	        	Files.copy(screenshot, screenshotPath);
	        }
	        catch(IOException e) {
	        	e.printStackTrace();
	        	System.out.println("Unable to save the screenshot!");
	        }
		
	}

}
