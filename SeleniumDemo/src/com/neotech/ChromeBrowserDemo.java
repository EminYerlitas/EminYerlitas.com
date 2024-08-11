package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.neotechacademy.com/");
		Thread.sleep(9000);
		driver.quit();

	}

}
