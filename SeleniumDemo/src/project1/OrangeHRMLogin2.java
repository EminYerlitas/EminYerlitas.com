package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.CommonMethods;

public class OrangeHRMLogin2 extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * Homework 2: OrangeHRM Login Navigate to https://hrm.neotechacademy.com/ Login
		 * to the application by writing xpath based on
		 * "following and preceding siblings"
		 */
		setUp();
		WebElement username=driver.findElement(By.xpath("//div[@class=\"input-field\"][2]//preceding-sibling::div[@class=\"input-field\"]//input"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//div[@class=\"login-form shadow\"]//descendant::form//descendant::div[2]//input[@name=\"txtPassword\"]"));
		password.sendKeys("Neotech@123");
		WebElement submit=driver.findElement(By.xpath("//div[@class=\"organization-logo shadow\"]//following-sibling::div[1]//descendant::form//div[3]//img//.."));
		submit.click();
		

	}

}
