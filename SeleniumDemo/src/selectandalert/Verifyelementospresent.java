package selectandalert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.BaseClass;

public class Verifyelementospresent extends BaseClass {

	public static void main(String[] args) {
		/*
		 * Verify element is present Open chrome browser Go to
		 * "https://the-internet.herokuapp.com/" Click on the "Dynamic Loading" link
		 * Click on "Example 1..." and click on "Start" Verify element with text
		 * "Hello World!" is displayed Close the browser
		 */
       setUp();
       WebElement dynamicloading=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a"));
       dynamicloading.click();
       driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
       driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       Boolean text=driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed();
       System.out.println("The message is displayed "+text);
       tearDown();
       
       		
	}

}
