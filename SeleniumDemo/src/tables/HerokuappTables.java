package tables;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.neotech.BaseClass;

public class HerokuappTables extends BaseClass {

	public static void main(String[] args) {
		/*
		 * // Go to https://the-internet.herokuapp.com/tables // I want you to print all
		 * the data from the tbody of the second table // Create the path dynamically //
		 * Don't print the last column
		 */
		setUp();
		List<WebElement> table2rows = driver.findElements(By.xpath("//*[@id=\"table2\"]/tbody/tr"));
		List<WebElement> table2cols = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td"));
		for(int a=1; a<=table2rows.size(); a++) {
			for(int b=1; b<table2cols.size(); b++) {
				WebElement element=driver.findElement(By.xpath("//table[@id='table2']/tbody/tr["+a+"]/td["+b+"]"));
				System.out.print(element.getText()+" \t ");
			}
			System.out.println();

		}
		

	}
}
