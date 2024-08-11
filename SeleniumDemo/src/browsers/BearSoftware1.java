package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BearSoftware1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Open chrome browser Go to
		 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * Enter valid username Clear username and enter again valid username Leave
		 * password field empty Click on login button Verify error message with text
		 * "Invalid Login or Password." is displayed.
		 */
      WebDriver driver=new ChromeDriver();
      driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
      WebElement username=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
      username.sendKeys("Bob Marley Faruk");
      username.clear();
      username.sendKeys("Arif Isik");
      driver.findElement(By.cssSelector("#ctl00_MainContent_login_button")).click();
      WebElement error=driver.findElement(By.cssSelector("#ctl00_MainContent_status"));
      if(error.isDisplayed()) {
    	 System.out.println(error.getText());
      }
      Thread.sleep(2031);
      driver.quit();
	}

}
