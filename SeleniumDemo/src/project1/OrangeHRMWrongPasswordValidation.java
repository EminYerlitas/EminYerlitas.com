package project1;

import org.openqa.selenium.By;

import com.utils.neotech.CommonMethods;
import com.utils.neotech.ConfigsReader;

public class OrangeHRMWrongPasswordValidation extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * TC 2: Orange HRM wrong password validation 1. Go to
		 * https://hrm.neotechacademy.com/ 2. Enter valid username and wrong password 3.
		 * Click on login button 4. Verify error message with text "Invalid Credentials"
		 * is displayed
		 * 
		 */
		setUp();
		sendText(driver.findElement(By.id("txtUsername")),ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")),"Wrong Password");
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		wait(3);
		boolean message=true;
		if(driver.findElement(By.xpath("//div[contains(text(),'Invalid Credentials')]")).isDisplayed()){
			System.out.println("Is message displayed? "+message);
			
		}
		else {
			System.out.println("Is message displayed? "+!message);
		}
	}

}
