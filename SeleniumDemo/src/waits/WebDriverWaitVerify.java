package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.neotech.BaseClass;

public class WebDriverWaitVerify extends BaseClass {
	/*
	 * Use WebDriverWait Verify element is enabled Open chrome browser Go to
	 * "https://neotech.vercel.app/" Click on the "Interactions" link Then click on
	 * "Waits" Click on enable button Enter "Hello" and verify text is entered
	 * successfully Close the browser
	 */

	public static void main(String[] args) {
		setUp();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"menu-interactions\"]/div[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"waits\"]/div/div/p")));
		driver.findElement(By.xpath("//*[@id=\"waits\"]/div/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"btnEnable\"]")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"btnEnable\"]"),"DISABLE"));
		WebElement textbox=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
		textbox.sendKeys("Hello");
		String text=textbox.getAttribute("value");
		if(textbox.isDisplayed()&&text.equals("Hello")) {
			System.out.println("Verified");
		}
		tearDown();

	}

}
