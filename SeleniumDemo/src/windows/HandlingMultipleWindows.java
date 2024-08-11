package windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.neotech.BaseClass;

public class HandlingMultipleWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * 1) Launch the browser and open the site "http://demo.guru99.com/popup.php" 2)
		 * Click on link "Click Here". When the user clicks on the "Click Here" link,
		 * new child window opens. 3) On the Child Window, Enter your email ID and
		 * submit. 4) Then Access Credentials will be Displayed on submitted page. You
		 * will see the child window is open in new tab. 5) Close the Child window on
		 * which credentials are displayed.Switch to the parent window. 6) Quit all
		 * browsers
		 */
      setUp();
      driver.findElement(By.xpath("//a[@target='_blank']")).click();
      Set<String> allwindows=driver.getWindowHandles();
    	  	Iterator<String>it=allwindows.iterator();
    	  	String window1=it.next();
    	  	String window2=it.next();
    	  	driver.switchTo().window(window2);
    	  	
      driver.findElement(By.cssSelector("input[name='emailid']")).sendKeys("Emin52");
      driver.findElement(By.cssSelector("input[name='btnLogin']")).click();
      for(String windows:allwindows) {
    	  if(windows.equals(window2)) {
    		  driver.close();
    	  }
    	  
      }
      Thread.sleep(2500);
      driver.switchTo().window(window1);
      tearDown();
      
	}

}
