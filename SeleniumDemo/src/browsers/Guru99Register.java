package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Register {
	/*
	 * HW1: Open Chrome browser Go to "https://demo.guru99.com/test/newtours/" Click
	 * on Register Link Fill out ALL required info Click Submit User successfully
	 * registered (Create the script using different locators)
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Saul");
		driver.findElement(By.name("lastName")).sendKeys("Goodman");
		driver.findElement(By.name("phone")).sendKeys("505-842-5662");
		driver.findElement(By.name("userName")).sendKeys("bettercalljimmy@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("9800 Montgomery Blvd");
		driver.findElement(By.name("city")).sendKeys("Albuquerque");
		driver.findElement(By.name("state")).sendKeys("New Mexico");
		driver.findElement(By.name("postalCode")).sendKeys("9800");
		driver.findElement(By.name("email")).sendKeys("Jimmy McGill");

		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
