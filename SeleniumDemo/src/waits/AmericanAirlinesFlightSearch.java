package waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.BaseClass;

public class AmericanAirlinesFlightSearch extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		//Locate origin location
		WebElement from=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		from.click();
	    from.clear();
	    from.sendKeys("CHI");
		//Locate destination location
		WebElement to=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		to.click();
		to.clear();
		to.sendKeys("IST");
		//Click on reservation button
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[1]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Create a while loop to choose the month and click on month
		String currentmonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText();
		while(!currentmonth.equals("December")) {
			String frommonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText();
			if(frommonth.equals("December")) {
			break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
				Thread.sleep(1000);
			}
		}
		//Create list of days and click on day
		List<WebElement>days=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td"));
		for(WebElement day:days) {
			if(day.getText().equals("14")) {
				day.click();
				break;
			}
		}
		//Same things for destination date
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[2]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String currentmonth2=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText();
		while(!currentmonth2.equals("December")){
			String tomonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText();
			if(tomonth.equals("December")) {
			break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
				Thread.sleep(1000);
			}
		}
		List<WebElement>days2=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td"));
		for(WebElement day2:days2) {
			if(day2.getText().equals("22")) {
				day2.click();
				break;
			}
	}
		//Click on Search button
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
		Thread.sleep(1500);
		tearDown();

}}
