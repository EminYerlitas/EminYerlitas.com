package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXPath {

	public static void main(String[] args) {
		/*
		 * / Go to https://demoqa.com/text-box // Fill the form and submit // Use xPath
		 * or CSS Selector
		 */
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@id='currentAddress']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@id='permanentAddress']")).sendKeys("a");
		
		
	}
	
}
