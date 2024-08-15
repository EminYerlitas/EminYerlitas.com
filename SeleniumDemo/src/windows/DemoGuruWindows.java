package windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.BaseClass;
/*
 * 1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
3) On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed.Switch to the parent window.
6) Quit all browsers
 */

public class DemoGuruWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String window1 = it.next();
		String window2 = it.next();
		driver.switchTo().window(window2);
		WebElement emailid=driver.findElement(By.xpath("//input[@name='emailid']"));
		emailid.click();
		emailid.sendKeys("eminyerlitas52@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.close();
		driver.switchTo().window(window1);
		Thread.sleep(5000);
	    driver.quit();
		
		
		

}}
