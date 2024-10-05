package project1;

import org.openqa.selenium.By;

import com.utils.neotech.CommonMethods;
import com.utils.neotech.ConfigsReader;

public class OrangeHRMBlankPasswordValidation extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * TC 1: Orange HRM blank password validation 1. Go to
		 * https://hrm.neotechacademy.com/ 2. Enter valid username and leave password
		 * field empty 3. Click on login button 4. Verify error message with text
		 * "Password cannot be empty" is displayed
		 * 
		 */
		setUp();
		sendText(driver.findElement(By.id("txtUsername")),ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).clear();
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		boolean message=true;
		if(driver.findElement(By.id("txtPassword-error")).isDisplayed()==true) {
			System.out.println("Error message is displayed? "+message);
		}
		else {
			System.out.println("Error message is displayed? "+!message);
		}
		
		
		

	}

}
