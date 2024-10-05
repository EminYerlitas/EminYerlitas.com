package actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.utils.neotech.CommonMethods;
import com.utils.neotech.ConfigsReader;

public class Screenshot2 extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		waitForVisibility(driver.findElement(By.xpath("//span[contains(text(),'PIM')]")));
		driver.findElement(By.xpath("//span[contains(text(),'PIM')]")).click();
		waitForVisibility(driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']//span[contains(text(),'Add Employee')]")));
	    driver.findElement(By.xpath("//span[contains(text(),'Employee List')]")).click();
	        wait(5);
	        waitForVisibility(driver.findElement(By.xpath("//*[@id='employeeListTable']/thead/tr/th[2]")));
	        List<WebElement>rows=driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/td/tr"));
	        for(WebElement row:rows) {
	        	WebElement name=row.findElement(By.xpath("//table[@id='employeeListTable']/tbody/td[3]"));
	        	if(name.getText().equals("John Jimmy Marston ")) {
	        		name.click();
	        		break;
	        		
	        	}
	        	
	        }
	        TakesScreenshot a=(TakesScreenshot) driver;
	        File screenshot= a.getScreenshotAs(OutputType.FILE);
	        File screenshotFolder=new File("screenshots/Homework");
	        try {
	        	if(!screenshotFolder.exists()) {
	        		screenshotFolder.mkdirs();
	        	}
	        	File screenshotPath=new File("screenshots/Homework/user-account.png");
	        	Files.copy(screenshotFolder, screenshotPath);
	        }
	        catch(IOException e) {
	        	e.printStackTrace();
	        	System.out.println("Unable to save the screenshot!");
	        }
	        
	        
	        

	}

}
