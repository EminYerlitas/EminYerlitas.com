package browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.BaseClass;

public class JunitAssertion extends BaseClass {

	public static void main(String[] args) {
		/*
		 * 1. Launch browser 2. Navigate to url 'http://automationexercise.com' 3.
		 * Verify that home page is visible successfully 4. Click on 'Products' button
		 * 5. Verify user is navigated to ALL PRODUCTS page successfully 6. Enter
		 * product name in search input and click search button 7. Verify 'SEARCHED
		 * PRODUCTS' is visible 8. Verify all the products related to search are visible
		 */
		setUp();
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));
		if(logo.isDisplayed()) {
			System.out.println("Home page is visible successfully.");
		}
		driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")).click();
		WebElement search=driver.findElement(By.cssSelector("#search_product"));
		if(search.isDisplayed()) {
			System.out.println("'SEARCHED PRODUCTS' is visible");
		} 
		//Step 8
		List<WebElement>products=driver.findElements(By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div > div:nth-child(4) > div > div.choose > ul > li > a > i"));
		for(WebElement product:products) {
			if(product.isDisplayed()) {
				System.out.println("Verified");
			}
			else {
				System.out.println("Could not verified.");
			}
		}
		
		
		

	}

}
