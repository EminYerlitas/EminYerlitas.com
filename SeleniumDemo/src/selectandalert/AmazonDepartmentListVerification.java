package selectandalert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.neotech.BaseClass;

public class AmazonDepartmentListVerification extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Homework 1: Amazon Department List Verification Open chrome browser Go to
		 * "http://amazon.com/" Verify how many department options available. Print each
		 * department Select Computers Quit browser
		 * 
		 */
		setUp();
		Select selection=new Select(driver.findElement(By.cssSelector("#searchDropdownBox")));
		List<WebElement> elements=selection.getOptions();
		int numbers=elements.size();
		System.out.println(numbers);
		for(WebElement element:elements ) {
			System.out.println(element.getText());
		
		}
		for(WebElement element:elements ) {
			if(element.getText().equals("Computers")){
					element.click();
				
			}
			Thread.sleep(4500);
			tearDown();
			
		}
		
		
		
		
		
		
		
		
		
	}

}
