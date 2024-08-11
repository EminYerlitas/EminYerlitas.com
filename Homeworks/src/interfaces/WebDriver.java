package interfaces;

interface WebDriver {
	public void openBrowser();

	public void closeBrowser();

	public void maximizeWindow();

	public void findElement();

}

interface Camera {
	public void takePicture();
}

class ChromeDriver implements WebDriver, Camera {
	public void openBrowser() {
		System.out.println("Open Chrome Driver.");

	}

	public void closeBrowser() {
		System.out.println("Close Chrome Driver.");
	}

	public void maximizeWindow() {
		System.out.println("Maximize Chrome Driver window.");

	}

	public void findElement() {
		System.out.println("Find an element from Chrome Driver.");
	}

	@Override
	public void takePicture() {
		System.out.println("Take a screenshot.");

	}

}

class FirefoxDriver implements WebDriver, Camera {
	public void openBrowser() {
		System.out.println("Open Firefox Driver.");

	}

	public void closeBrowser() {
		System.out.println("Close Firefox Driver.");
	}

	public void maximizeWindow() {
		System.out.println("Maximize Firefox Driver window.");

	}

	public void findElement() {
		System.out.println("Find an element from Firefox Driver.");
	}

	@Override
	public void takePicture() {
		System.out.println("Take a screenshot.");

	}

}
