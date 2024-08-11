package selectandalert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.BaseClass;

public class ChallengingTask extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Homework 3: Open chrome browser Go to
		 * "https://semantic-ui.com/modules/dropdown.html" Scroll down to
		 * "Multiple Selection" Click on drop down and select "CSS" and "HTML" Verify
		 * value has been selected Deselect 1 of the options from the dropdown Quit
		 * browser
		 */

		setUp();
		WebElement element1=driver.findElement(By.cssSelector("#example > div.pusher > div > div.article > div.main.ui.container > div.ui.active.tab > div:nth-child(9) > div"));
	    element1.click();
		WebElement css1=driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]"));
		WebElement html1=driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[5]"));
		css1.click();
		html1.click();
		WebElement css2=driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[1]"));
		WebElement html2=driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[2]"));
		if(css2.isDisplayed()) {
			System.out.println("CSS has been selected");
		}
		if(html2.isDisplayed()) {
			System.out.println("HTML has been selected");
		}
		WebElement element2=driver.findElement(By.cssSelector("#example > div.pusher > div > div.article > div.main.ui.container > div.ui.active.tab > div:nth-child(9) > div"));
		element2.click();
		Thread.sleep(2000);
		tearDown();
	}

}
