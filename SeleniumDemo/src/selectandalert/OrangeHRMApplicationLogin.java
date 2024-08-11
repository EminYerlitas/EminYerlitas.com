package selectandalert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.neotech.BaseClass;



	public class OrangeHRMApplicationLogin extends BaseClass  {

		public static void main(String[] args) throws InterruptedException {
			/*
			 * HW1: Orange HRM Application Login: Open Chrome browser Go to
			 * https://hrm.neotechacademy.com/ Enter valid username and password Click on
			 * login button Then verify that "span with id account-name" has the text
			 * "Jacqueline White". Quit the browser
			 */
	  setUp();
	    
	    driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	    driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Neotech@123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String accountname = driver.findElement(By.xpath("//span[@id='account-name']")).getText();
	    if(accountname.equals("Jacqueline White")) {
	    	System.out.println("Username is correct");
	    }
	    else {
	    	System.out.println("Invalid username");
	    }
	    tearDown();
	    
	   
	    
	   
		
		}
		
	
	
    
}
