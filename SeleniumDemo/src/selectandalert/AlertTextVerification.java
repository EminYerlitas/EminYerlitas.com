package selectandalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.neotech.BaseClass;

public class AlertTextVerification extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Homework 2: Alert text verification Open chrome browser Go to
		 * https://demoqa.com/ Click on "Alerts, Frame & Windows" link Click on "Alerts"
		 * links on the left side Click on button to see Alert Verify alert box with
		 * text "You clicked a button" is present Click on 3rd button in the page Verify
		 * alert box with text "Do you confirm action?" is present and click "confirm"
		 * Click on 4 th button in the page and enter your name and click ok. Quit
		 * browser
		 */
		setUp();

		driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(3)")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Alerts, Frame & Windows')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Alerts')]")).click();
		driver.findElement(By.id("alertButton")).click();
		Alert alert1 = driver.switchTo().alert();
		
		if (alert1.getText().equals("You clicked a button")) {
			System.out.println("Test is successfull");
		}
		alert1.accept();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert2 = driver.switchTo().alert();
		if (alert2.getText().equals("Do you confirm action?")) {
			System.out.println("Test is successfull");
		}
		alert2.accept();
		driver.findElement(By.id("promtButton")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Emin");
		alert3.accept();
		Thread.sleep(5000);
		tearDown();
		

	}

}
