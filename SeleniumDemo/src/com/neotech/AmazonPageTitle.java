package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPageTitle {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * HW1: Amazon Page Title Verification: Open chrome browser Go to
		 * “https://www.amazon.com/” Verify Title “Amazon.com: Online Shopping for
		 * Electronics, Apparel, Computers, Books, DVDs & more” is displayed End the
		 * Session (close the browser).
		 */
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.com/");
         String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
         if(driver.getTitle().equals(expectedTitle)) {
        	 System.out.println("You are in the right page"+driver.getCurrentUrl());
         }
         else {
        	 System.out.println("You are in the wrong page");
         }
        Thread.sleep(5000);
        driver.quit();
        
		
		
		
	}

}
