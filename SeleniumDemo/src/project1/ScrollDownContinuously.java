package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.utils.neotech.CommonMethods;

public class ScrollDownContinuously extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Open chrome browser Go to "https://the-internet.herokuapp.com/" Click on the
		 * "Infinite Scroll" link Scroll down by 500 pixels 10 times Wait 1 second
		 * between each scroll Scroll into the view of tag h3 (Infinite Scroll) Close
		 * the browser
		 */
		setUp();
		click(driver.findElement(By.xpath("//a[@href='/infinite_scroll']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i <= 10; i++) {
			wait(1);
			js.executeScript("window.scrollBy(0,500)");

		}
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h3")));
		wait(3);
		tearDown();

	}

}
