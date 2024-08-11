package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssGuru99Register {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Homework 2: Using Css ONLY TC 2: Mercury Tours Registration: Open chrome
		 * browser Go to “http://demo.guru99.com/test/newtours/” Click on Register Link
		 * Fill out all required info Click Submit User successfully registered
		 */
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.findElement(By.cssSelector("a[href='register.php']")).click();
        driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("Tuco");
        driver.findElement(By.cssSelector("[name='lastName']")).sendKeys("Salamanca");
    	driver.findElement(By.cssSelector("[name='phone']")).sendKeys("505-842-5662");
    	driver.findElement(By.cssSelector("[name='userName']")).sendKeys("dmnmanlktthtlk@gmail.com");
    	driver.findElement(By.cssSelector("[name='address1']")).sendKeys("906 Park Ave SW");
    	driver.findElement(By.cssSelector("[name='city']")).sendKeys("Albuquerque");
    	driver.findElement(By.cssSelector("[name='state']")).sendKeys("New Mexico");
    	driver.findElement(By.cssSelector("[name='postalCode']")).sendKeys("906");
    	new Select(driver.findElement(By.cssSelector("[name='country']"))).selectByValue("UNITED STATES");
    	driver.findElement(By.cssSelector("[name='email']")).sendKeys("Tight Tight Tight");
    	driver.findElement(By.cssSelector("[name='password']")).sendKeys("ParaSalamancas");
    	driver.findElement(By.cssSelector("[name='confirmPassword']")).sendKeys("ParaSalamancas");
    	driver.findElement(By.cssSelector("[name='submit']")).click();
    	Thread.sleep(3452);
        driver.quit();
		
		
	}

}
