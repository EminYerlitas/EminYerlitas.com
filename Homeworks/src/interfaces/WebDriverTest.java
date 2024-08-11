package interfaces;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver[]array1= {new ChromeDriver(), new FirefoxDriver()};
		Camera[]array2= {new ChromeDriver(), new FirefoxDriver()};
		for(WebDriver arr:array1) {
			arr.openBrowser();
			arr.maximizeWindow();
			arr.findElement();
            arr.closeBrowser();
		}
		for(Camera arr:array2) {
			arr.takePicture();
		}
		
		

	}

}
