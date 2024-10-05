package project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Try1 {
/*
	Test case:
	
    Go to https://www.webstaurantstore.com/
    Search for 'stainless work table'.
    Go to the next page, until the last one.
    Add the last of found items to the Cart.
    Empty the Cart.
 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webstaurantstore.com/");
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement policyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept']")));
		
		if(policyButton.isDisplayed()) {
			policyButton.click();
		}
		
		WebElement searchInput = driver.findElement(By.xpath("//input[@aria-owns='awesomplete_list_1']"));
		searchInput.sendKeys("stainless work table");
		
		WebElement searchButton = driver.findElement(By.xpath("//div[contains(@class, 'max-w-[900px]')]//button[@value='Search']"));
		searchButton.click();
		
		WebElement nextPageButton = driver.findElement(By.xpath("//li[contains(@class, 'rounded-r-md')]"));
		nextPageButton.click();

		String totalPage = driver.findElement(By.xpath("//li[contains(@class, 'rounded-r-md')]//preceding-sibling::li[1]")).getText();
		String currentPage = driver.getCurrentUrl().split("=")[1];
		
		while(!currentPage.equals(totalPage)) {
			nextPageButton = driver.findElement(By.xpath("//li[contains(@class, 'rounded-r-md')]"));
			nextPageButton.click();
			currentPage = driver.getCurrentUrl().split("=")[1];
			Thread.sleep(1000);
		}
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@id='product_listing']/div"));
		WebElement lastProduct = products.get(products.size() -1);
		WebElement addToCartButton = lastProduct.findElement(By.xpath(".//input[@type='submit']"));
		addToCartButton.click();
		Thread.sleep(1000);
		
		WebElement viewCartButton = driver.findElement(By.xpath("//*[text()='View Cart']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click()", viewCartButton);
		Thread.sleep(1000);
		
		WebElement emptyCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Empty Cart']")));
		emptyCartButton.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@data-testid='modal-footer']/button[text()='Empty']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}}