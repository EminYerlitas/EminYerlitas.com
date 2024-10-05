package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.utils.neotech.CommonMethods;

public class EscTabEnter extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * //Task until: 1:00 //Go to https://the-internet.herokuapp.com/key_presses
		 * //Press on ESC, TAB, and ENTER.
		 */
       setUp();
       WebElement a=driver.findElement(By.id("target"));
       sendText(a,"Java");
       a.sendKeys(Keys.ESCAPE);
       wait(2);
       a.sendKeys(Keys.TAB);
       wait(2);
       a.sendKeys(Keys.ENTER);
       wait(2);
       sendText(a,"Selenium");
       a.sendKeys(Keys.TAB);
       tearDown();
       
       
	}

}
