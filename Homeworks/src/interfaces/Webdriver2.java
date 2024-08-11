package interfaces;

public interface Webdriver2 {
	void open();
	void close();
	String gettitle();

}
interface takeScreenShot{
	void getScreenShot();
}
interface RemoteWebDriver extends Webdriver2,takeScreenShot{
	void navigate();
}
class ChromeDriver2 implements RemoteWebDriver{
	String browser="Chrome Driver";
	public void open() {
		System.out.println("Open "+browser);
	}
	public void close() {
		System.out.println("Close "+browser);
	}
	public void navigate(){
		System.out.println(browser+" navigates to google.");
	}
    public void getScreenShot() {
    	System.out.println(browser+" gets a Screen Shot.");
				
	}			
	public String gettitle() {
		return browser;
	}
	
	
}
