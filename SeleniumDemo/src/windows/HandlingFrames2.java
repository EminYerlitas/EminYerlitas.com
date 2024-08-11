package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.utils.neotech.BaseClass;

public class HandlingFrames2 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * 1) Launch the browser and open the site
		 * "https://neotech.vercel.app/iframe/multi2" 2) Verify on the page header
		 * "Not a Friendly Topic" displayed 3) Click on the Inner Frame Check box 4)
		 * Choose Dog from Animals dropdown 5) Quit the browser
		 * 
		 */
		setUp();
		driver.findElement(By.xpath("//*[contains(text(),'Not a Friendly Topic')]")).isDisplayed();		
		driver.switchTo().frame("nested1").switchTo().frame("child-frame");
		driver.findElement(By.id("inner-frame-check-box")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("animals");
		Select animal= new Select(driver.findElement(By.id("animal-select")));
	    animal.selectByIndex(0);
	    
		
		
		
		
		
	}

}
