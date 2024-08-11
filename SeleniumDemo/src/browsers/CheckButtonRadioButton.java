package browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButtonRadioButton {

	public static void main(String[] args) {
		/*
		 * Play with check boxes and radio buttons in these pages
		 * https://demo.seleniumeasy.com/basic-checkbox-demo.html
		 * https://demo.seleniumeasy.com/basic-radiobutton-demo.html
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	    driver.findElement(By.cssSelector("#isAgeSelected")).click();
	    List<WebElement>checkBoxes=driver.findElements(By.cssSelector("[type='checkbox']"));
		for(WebElement box:checkBoxes) {
			box.click();
			box.getText();
			
		}
	}

}
