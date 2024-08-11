package interfaces;

public class TestWebDriver2 {

	public static void main(String[] args) {
		RemoteWebDriver[] a = { new ChromeDriver2(), new FirefoxDriver2(), new SafariDriver()

		};
		for(RemoteWebDriver each:a) {
			each.gettitle();
			each.open();
			each.close();
			each.getScreenShot();
			each.navigate();
			
		}

	}

}
