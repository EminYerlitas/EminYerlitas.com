package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningFireFox {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * HW2: Opening Page on Firefox Browser Open Firefox browser Navigate to
		 * “https://www.redfin.com/” Verify that you have navigated to
		 * (https://www.redfin.com/) End the Session (close the browser).
		 */
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redfin.com/");
		String actualUrl="https://www.redfin.com/";
		String expectedUrl="https://www.redfin.com/";
		if(actualUrl.equals(expectedUrl)) {
			System.out.println(driver.getCurrentUrl());
		}
		else {
			System.out.println("You are in the wrong page");
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
