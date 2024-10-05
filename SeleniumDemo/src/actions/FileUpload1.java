package actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.utils.neotech.CommonMethods;

public class FileUpload1 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Upload a file: http://webdriveruniversity.com/File-Upload/index.html
		 */
		setUp();
		String filePath=System.getProperty("user.dir")+"/screenshotFolder/Homework1/facebook-login.png";
		sendText(driver.findElement(By.id("myFile")),filePath);
		click(driver.findElement(By.id("submit-button")));
		acceptAlert();
		TakesScreenshot ts= (TakesScreenshot) driver;
		File fileSource=ts.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(fileSource, new File("screenshotFolder/Homework1/file2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
