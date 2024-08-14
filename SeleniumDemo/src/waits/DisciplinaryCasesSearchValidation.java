package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.neotech.BaseClass;
import com.utils.neotech.ConfigsReader;

public class DisciplinaryCasesSearchValidation extends BaseClass {
	/*
	 * Open chrome browser Go to https://hrm.neotechacademy.com/ Login into the
	 * application Select Discipline Select Disciplinary Cases Click on Filter
	 * (Up-Right next to Help) Select from June 6, 2022 to July 15, 2022 Click on
	 * Search Validate that there are no rows in result table Quit the browser
	 */
	public static void main(String[] args) {
		setUp();
		String username = ConfigsReader.getProperty("username");
		String password = ConfigsReader.getProperty("password");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"right-side\"]/header/div/ohrm-navbar/nav/div/div/ul[1]/li")));
		driver.findElement(By.xpath("//*[@id=\"menu_discipline_defaultDisciplinaryView\"]/a/span[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu_discipline_viewDisciplinaryCases\"]/span[2]")));
		driver.findElement(By.xpath("//*[@id=\"menu_discipline_viewDisciplinaryCases\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"searchModal\"]/i")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DisciplinaryCaseSearch_createdDateFrom")));
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();
		WebElement month=driver.findElement(By.xpath("//*[@id=\"DisciplinaryCaseSearch_createdDateFrom_root\"]/div/div/div/div/div[2]/div/div[1]/input"));
		WebElement year=driver.findElement(By.xpath("//*[@id=\"DisciplinaryCaseSearch_createdDateFrom_root\"]/div/div/div/div/div[2]/div/div[2]/input"));
		
		while(!month.getText().equals("June")&&!year.getText().equals("2022")) {
		driver.findElement(By.xpath("//*[@id=\"DisciplinaryCaseSearch_createdDateFrom_root\"]/div/div/div/div/div[2]/div/div[3]")).click();
		if(month.getText().equals("June")&&year.getText().equals("2022")) {
			break;
		}
	}
		}

}
