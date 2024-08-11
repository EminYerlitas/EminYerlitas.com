package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.utils.neotech.BaseClass;

public class AddEmployee extends BaseClass {

	/*
	 * Homework 3: Add Employee Open chrome browser Go to
	 * "https://hrm.neotechacademy.com/" Login into the application Click on PIM >
	 * Add Employee Add Employee Log out Quit the browser
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp();
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofSeconds(15));
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Neotech@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Employee']")));
        driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='first-name-box']")));
        driver.findElement(By.xpath("//*[@id='first-name-box']")).sendKeys("Jimmy");
        driver.findElement(By.xpath("//*[@id='middle-name-box']")).sendKeys("John");
        driver.findElement(By.xpath("//*[@id='last-name-box']")).sendKeys("Marston");
        driver.findElement(By.xpath("//*[@id='employeeId']")).sendKeys("1881");
        Select country=new Select(driver.findElement(By.xpath("//*[@id='location']")));
        country.getOptions().get(25).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='modal-save-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        driver.findElement(By.id("account-name")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
        driver.findElement(By.id("logoutLink")).click();
        tearDown();
        
        
        
        
        
        
        
	}

}
