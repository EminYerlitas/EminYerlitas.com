package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.BaseClass;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class UpdateCustomerInformation extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1) Open chrome browser 2) Go to
		 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * 3) Login to the application 4) Verify customer "Susan McLaren" is present in
		 * the table 5) Click on customer details 6) Update customers last name and
		 * credit card info 7) Verify updated customers name and credit card number is
		 * displayed in table 8) Close browser
		 */
        setUp();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        WebElement user=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[2]"));
        if(user.getText().equals("Susan McLaren")) {
        	System.out.println("Verified");
        }
        driver.findElement(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input")).click();
        WebElement name=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        name.clear();
        name.sendKeys("Susan Suzi");
        WebElement creditcard= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        creditcard.clear();
        creditcard.sendKeys("188119382002");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]")).click();
        Thread.sleep(2000);
        WebElement newname=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[2]"));
        if(newname.getText().equals("Susan Suzi")) {
        	System.out.println("Verified");
        }
        
              
       
        
	}

}
