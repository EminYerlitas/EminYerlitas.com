package browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegisteration {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * HW2: Facebook sign up: Open chrome browser Go to "https://www.facebook.com/"
		 * Click on Sign Up link Enter first name Enter last name Enter email address
		 * Re-enter email address Click on Sign Up button
		 */
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.facebook.com/");
       driver.findElement(By.linkText("Create new account")).click();
       Thread.sleep(2000);
       driver.findElement(By.name("firstname")).sendKeys("Walter");
       driver.findElement(By.name("lastname")).sendKeys("White");
       driver.findElement(By.name("reg_email__")).sendKeys("800-225-5324");
       driver.findElement(By.name("reg_passwd__")).sendKeys("SYMYNMHeisenbergURGDDMR");
       driver.findElement(By.id("day")).sendKeys("7");
       driver.findElement(By.id("month")).sendKeys("Sep");
       driver.findElement(By.id("year")).sendKeys("1958");
       driver.findElement(By.name("websubmit")).click();
       Thread.sleep(2000);
       driver.quit();
      }

}
