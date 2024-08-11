package browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		/*
		 * Radio Button Practice Open chrome browser Go to
		 * "https://demoqa.com/radio-button" Verify if all radio buttons are displayed
		 * and clickable Click on all radio buttons Verify radio buttons has been
		 * clicked successfully Quit browser
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		List<WebElement> buttons = driver.findElements(By.cssSelector(".custom-control-label"));

		for (WebElement button : buttons) {
			if (button.isDisplayed()) {
				System.out.println("'" + button.getText() + "'" + " displayed");
				button.click();
				System.out.println("'" + button.getText() + "'" + " is clickable");

			}
			if (button.isEnabled()) {
				System.out.println(button.isEnabled());

			}

		}
		driver.quit();
	}

}
