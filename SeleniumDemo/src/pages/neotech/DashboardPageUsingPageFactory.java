package pages.neotech;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.neotech.BaseClass;

public class DashboardPageUsingPageFactory {
	@FindBy(id = "ohrm-small-logo")
	public WebElement logo;

	@FindBy(id = "account-name")
	public WebElement accountName;
	
	@FindBy(xpath="//span[text()='PIM']")
	public WebElement PIM;
	
	@FindBy(xpath="//span[text()='Add Employee']")
	public WebElement addEmployee;
	
	
	

	public DashboardPageUsingPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
