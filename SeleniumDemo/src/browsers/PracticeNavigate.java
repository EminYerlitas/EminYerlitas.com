package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNavigate {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Open Chrome browser // Navigate to https://www.selenium.dev/ // Navigate to
		 * https://www.google.com/ // Go back and forth 10 times. // Use a for loop //
		 * Wait 1 second between each navigation
		 */
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev");
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		for(int a=0;a<10;a++) {
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
			
			
		}
		driver.quit();
	}

}
