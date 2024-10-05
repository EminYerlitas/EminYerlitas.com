package pages.neotech;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.utils.neotech.CommonMethods;
import com.utils.neotech.ConfigsReader;

public class AddAnEmployee extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Go to url: https://hrm.neotechacademy.com/ Log in using our custom methods Go
		 * to PIM menu Add an employee Wait for employee details to show Click on the
		 * employee image Upload an image in the employee photo
		 */
		setUp();
		LoginPageUsingPageFactory login = new LoginPageUsingPageFactory();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		wait(3);
		DashboardPageUsingPageFactory page = new DashboardPageUsingPageFactory();
		click(page.PIM);
		waitForVisibility(driver.findElement(By.xpath("//span[text()='Add Employee']")));
		click(page.addEmployee);
		AddEmployeePageFactory addEmployee = new AddEmployeePageFactory();
		waitForVisibility(driver.findElement(By.id("first-name-box")));
		sendText(addEmployee.firstName, "Jose");
		sendText(addEmployee.lastName, "Mourinho");
		selectDropdown(driver.findElement(By.id("location")), "France Regional HQ");
		wait(3);
		click(addEmployee.modalSaveButton);
		waitForVisibility(driver.findElement(By.id("personal_details_tab")));
		click(addEmployee.imageButton);
		String JoseMourinho = System.getProperty("user.dir") + "/screenshotFolder/Pictures1/JoseMourinho.jpg";
		sendText(addEmployee.employeePicture, JoseMourinho);
		wait(3);
		click(addEmployee.photoSaveButton);
		wait(4);
	    tearDown();

	}

}
