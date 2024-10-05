package actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
import com.utils.neotech.CommonMethods;

public class Screenshot4 extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		String filepath=System.getProperty("user.dir")+"/screenshotFolder/Homework1/facebook-login.png";
		sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")),filepath);
		click(driver.findElement(By.xpath("//button[@type='button']")));
		acceptAlert();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcecode=ts.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(sourcecode, new File("screenshotFolder/Homework1/file1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		

	}

}
