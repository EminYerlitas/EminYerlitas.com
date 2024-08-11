package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathGuru99Register {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Homework 1: Using xPath ONLY TC 2: Mercury Tours Registration: Open chrome
		 * browser Go to “http://demo.guru99.com/test/newtours/” Click on Register Link
		 * Fill out all required info Click Submit User successfully registered
		 */
     WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.findElement(By.xpath("//a[@href='register.php']")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jessie");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Pinkman");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("440-654-1662");
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("whatupbtch@gmail.com");
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("9809 Margo Street");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Albuquerque");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("New Mexico");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("9809");
	new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByValue("UNITED STATES");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("AlCamino");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("YeahScienceYo");
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("YeahScienceYo");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Thread.sleep(2024);
    driver.quit();
	
		
	}

}
