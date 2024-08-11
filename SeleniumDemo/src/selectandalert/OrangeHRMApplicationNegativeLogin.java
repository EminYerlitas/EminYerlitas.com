package selectandalert;

import org.openqa.selenium.By;

import com.utils.neotech.BaseClass;

public class OrangeHRMApplicationNegativeLogin extends BaseClass {

	public static void main(String[] args) {
		/*
		 * TC 2: Orange HRM Application Negative Login: Open Chrome browser Go to
		 * https://hrm.neotechacademy.com/ Enter valid username Leave password field
		 * empty Verify error message with text "Password cannot be empty" is displayed.
		 */
		setUp();
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String errormessage=driver.findElement(By.xpath("//span[@id='txtPassword-error']")).getText();
		if(errormessage.equals("Password cannot be empty")) {
			System.out.println("Password cannot be empty");
		}
		else {
			System.out.println(errormessage);
		}
		
		
		
	}

}
