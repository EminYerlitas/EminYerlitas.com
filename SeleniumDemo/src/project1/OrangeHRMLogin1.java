package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.CommonMethods;

public class OrangeHRMLogin1 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Homework 1: OrangeHRM Login Navigate to https://hrm.neotechacademy.com/ Login
		 * to the application by writing xpath based on "parent and child relation"
		 * 
		 */
		setUp();
		WebElement username=driver.findElement(By.xpath("//form[@class=\"form-body\"]//input[@name=\"login[_csrf_token]\"]/following-sibling::div[1]/input[@name=\"txtUsername\"]"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//div[@class=\"button-holder\"]//..//input[@name=\"txtPassword\"]"));
		password.sendKeys("Neotech@123");
		WebElement submit=driver.findElement(By.xpath("//img[@class=\"icon login-icon\"]//.."));
		submit.click();
		
		
		

	}

}
