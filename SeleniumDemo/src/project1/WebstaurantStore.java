package project1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.neotech.CommonMethods;

public class WebstaurantStore extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * This is the test case Must be runnable on Windows 10 Written in Java or
		 * Groovy, using Selenium Chrome browser Use of WebDriverManager highly
		 * recommended (We will learn it in 2 weeks) No BDD approach is allowed. (We
		 * will learn it in 3 weeks)
		 * 
		 * Test case: Go to https://www.webstaurantstore.com/ Search for 'stainless work
		 * table'. Go to the next page, until the last one. Add the last of found items
		 * to the Cart. Empty the Cart.
		 */
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.webstaurantstore.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement search=driver.findElement(By.id("searchval"));
		search.sendKeys("stainless work table");
		search.sendKeys(Keys.ENTER);
		//wait.until(ExpectedConditions.visibilityOf(search));
		
		
		//js.executeScript("window.scrollBy(0,10500)");
	
			for(int i=0;i<8;i++) {
				WebElement nextView=driver.findElement(By.id("paging"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", nextView);
				wait.until(ExpectedConditions.visibilityOf(nextView));
				WebElement nextArrow=driver.findElement(By.xpath("//li[@class='inline-block leading-4 align-top rounded-r-md']/a"));
				nextArrow.click();
			}
			WebElement nextView=driver.findElement(By.id("paging"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", nextView);
			wait.until(ExpectedConditions.visibilityOf(nextView));
			List<WebElement>submits=driver.findElements(By.xpath("//input[@type='submit']"));
			WebElement lastProduct=submits.get(submits.size()-1);
			lastProduct.click();
		
			WebElement viewCart=driver.findElement(By.xpath("//i[@class='icon-shopping-cart pr-1']"));
		    Thread.sleep(3000);
		    //click(viewCart);
            js.executeScript("arguments[0].click()", viewCart);			
			
			
			
		}
	
	}


