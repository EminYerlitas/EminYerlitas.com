package waits;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.neotech.BaseClass;

public class NeotechAcademyPage extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * // Task until 12:42 // Open https://neotech.vercel.app/windows // Click on
		 * the button that opens NeoTech Academy page // Switch the focus back and forth
		 * 10 times // Hint: You switch the two handles that you have in the set
		 * 
		 * // Find the time for the best disco movement
		 * 
		 */
		setUp();
        driver.findElement(By.id("windowButton")).click();
        Set<String>windows=driver.getWindowHandles();
        Iterator<String>it=windows.iterator();
       String windows1=it.next();
       String windows2=it.next();
       for(int a=0;a<10;a++) {
    	   driver.switchTo().window(windows1);
    	   driver.switchTo().window(windows2);
    	   
       }
        tearDown();
        
	}

}
