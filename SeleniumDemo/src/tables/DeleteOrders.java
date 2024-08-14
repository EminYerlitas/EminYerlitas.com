package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.BaseClass;

public class DeleteOrders  extends BaseClass  {

	public static void main(String[] args) {
		/*
		 * 1) Open chrome browser 2) Go to
		 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * 3) Login to the application 4) Click on the checkbox of all orders with
		 * product FamilyAlbum 5) Delete Selected orders 6) Verify the orders have been
		 * deleted 7) Quit the browser
		 */
		setUp();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        List<WebElement>rows=driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr"));
        for(int i=1;i<rows.size();i++) {
        	WebElement row=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr["+(i+1)+"]/td[3]"));
        	String rowtext=row.getText();
        	if(rowtext.contains("FamilyAlbum")) {
        		List<WebElement>checkbox=driver.findElements(By.xpath(".//input[@type='checkbox']"));
        		checkbox.get(i-1).click();
     		
        	}
        
        }
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnDelete\"]")).click();
        tearDown();
     
	}

}
