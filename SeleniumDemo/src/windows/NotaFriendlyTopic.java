package windows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.neotech.BaseClass;

public class NotaFriendlyTopic extends BaseClass {
	/*
	 * 1) Launch the browser and open the site
	 * "https://neotech.vercel.app/iframe/multi2" 2) Verify on the page header
	 * "Not a Friendly Topic" displayed 3) Click on the Inner Frame Check box 4)
	 * Choose Dog from Animals dropdown 5) Quit the browser
	 * 
	 */

	public static void main(String[] args) {
		setUp();
		WebElement header=driver.findElement(By.xpath("//div//span[contains(text(),'Not a Friendly Topic')]"));
		if(header.getText().equals("Not a Friendly Topic")) {
			System.out.println(header.isDisplayed());
		}
		driver.switchTo().frame("animals");
		driver.findElement(By.xpath("//select[@id='animal-select']")).click();
		Select animals=new Select(driver.findElement(By.xpath("//select[@id='animal-select']")));
		animals.getOptions();
		animals.selectByVisibleText("Dog");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	    FluentWait<WebDriver>wait2=new FluentWait<WebDriver>(driver);
	    wait2.withTimeout(Duration.ofSeconds(5));
	    wait2.pollingEvery(Duration.ofSeconds(1));
		tearDown();
		
		

	}

}
