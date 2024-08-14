package hmtbt7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.neotech.BaseClass;
import com.utils.neotech.ConfigsReader;

public class HMTBT7_2  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		String username=ConfigsReader.getProperty("username");
		String password=ConfigsReader.getProperty("password");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"right-side\"]/header/div/ohrm-navbar/nav/div/div/ul[1]/li")));
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_addEmployee")));
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));
		driver.findElement(By.id("first-name-box")).sendKeys("Arthur");
		driver.findElement(By.id("last-name-box")).sendKeys("Morgan");
		Select region=new Select(driver.findElement(By.id("location")));
		region.selectByVisibleText("Texas R&D");
		Thread.sleep(1000);
		driver.findElement(By.id("modal-save-button")).click();
		Thread.sleep(20000);
		Select nationality= new Select(driver.findElement(By.id("nation_code")));
		System.out.println(nationality.getOptions().get(10).getText());
		nationality.selectByIndex(10);
		//Select gender=new Select(driver.findElement(By.id("emp_gender_inputfileddiv")));
		//gender.selectByVisibleText("Male");
		//Select marial=new Select(driver.findElement(By.id("emp_marital_status_inputfileddiv")));
		//marial.selectByVisibleText("Other");
		//driver.findElement(By.id("militaryService")).sendKeys("Veteran");
		//driver.findElement(By.id("nickName")).sendKeys("Morgie");
		//driver.findElement(By.id("smoker")).click();
		//*[@id="emp_marital_status"]
		
		
		
		
		
		

	}

}
