package com.utils.neotech;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	// --- Step 4 ---
	//Create an instance variable for WebDriver so we can reach it from outside of our method.
	public static WebDriver driver;
	 /** This method will initialize the driver.
	 * We will call setUp() and tearDown() methods for our next projects.
	 * We will use switch case to check the driver.*/
	public static void setUp() {
		 /** ConfigsReader.readProperties is the method from Step 3 to read the Properties. 
		 *(ConfigsReader is the name of the class, readProperties is a method that we created).
		 *Constants.CONFIGURATION_FILEPATH is from Step 2, it will be (String filePath) parameter for our method. 
		 *(Constants is the name of that class, CONFIGURATION_FILEPATH is the name of the method). */
		//Basically we will connect the filePath to the file to read it.
 //public static void readProperties//   //(String filePath)//
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		//ConfigsReader.getProperty is the method from Step 3 to return the value for a specified key.
 //public static String getProperty// //(String key)//
		switch(ConfigsReader.getProperty("browser")) {
		//To open ChromeDriver
		case"chrome":
		driver = new ChromeDriver();
		break;
		//To open FirefoxDriver
		case"firefox":
		driver=new FirefoxDriver();
		break;
		//To open SafariDriver
		case"safari":
		driver=new SafariDriver();
		break;
		//For default cases
		default:
			throw new RuntimeException("Other browsers are not supported.");		
		}//To maximize the window of our driver
		driver.manage().window().maximize();
		//Get the url form Properties
		String url = ConfigsReader.getProperty("url");
		driver.get(url);
	}
	//This method will quit the driver if the value is not null.
	public static void tearDown() {
		if(driver!=null) {
		driver.quit();}
	}
	

}
