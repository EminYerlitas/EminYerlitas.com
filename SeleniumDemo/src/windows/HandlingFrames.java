package windows;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.neotech.BaseClass;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1) Launch the browser and open the site
		 * "https://chercher.tech/practice/frames-example-selenium-webdriver" 2) Verify
		 * on the page header "Not a Friendly Topic" displayed 3) Click on the Inner
		 * Frame Check box 4) Choose baby Cat from Animals dropdown 5) Quit the browser
		 */
		setUp();
		driver.findElement(By.name("name")).sendKeys("Emin");
		driver.findElement(By.name("email")).sendKeys("emin52");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("mobile")).sendKeys("05312947134");
		driver.findElement(By.name("dob")).sendKeys("07/30/1999");
		driver.findElement(By.name("subjects")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[3]/input")).click();
		driver.findElement(By.cssSelector("textarea[placeholder='Currend Address']")).sendKeys("Chicago");
		Select selection1=new Select(driver.findElement(By.name("state")));
		List<WebElement>elements1=selection1.getOptions();
		for(WebElement element1:elements1) {
			if(element1.getText().equals("Rajasthan")) {
				element1.click();
			}
		}
		Select selection2=new Select(driver.findElement(By.name("city")));
		List<WebElement>elements2=selection2.getOptions();
		for(WebElement element2:elements2) {
			if(element2.getText().equals("Lucknow")) {
				element2.click();
			}
		}
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		Thread.sleep(3500);
		tearDown();
		
		

	}

}
