package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.utils.neotech.BaseClass;

public class FluentWaitVerify extends BaseClass {

	public static void main(String[] args) {
		/*
		 * Homework 2: Same as Homework1 -> Use FluentWait
		 */
      setUp();
      FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
      wait.withTimeout(Duration.ofSeconds(10));
      wait.pollingEvery(Duration.ofSeconds(1));
      driver.findElement(By.xpath("//*[@id=\"menu-interactions\"]/div[1]/p")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"waits\"]/div/div/p")));
      driver.findElement(By.xpath("//*[@id=\"waits\"]/div/div/p")).click();
      driver.findElement(By.xpath("//*[@id='btnEnable']")).click();
      wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id='btnEnable']"), "ENABLE"));
      WebElement text2box=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
      text2box.sendKeys("Hello");
      String text2=text2box.getAttribute("value");
      if(text2box.isDisplayed()&&text2.equals("Hello")) {
    	  System.out.println("Verified");
      }
      tearDown();
      
      
      
      
      
	}

}
