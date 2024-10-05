package pages.neotech;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.neotech.BaseClass;

public class LoginPageUsingPageFactory {

	@FindBy(id = "txtUsername")
	public WebElement username;
	@FindBy(id = "txtPassword")
	public WebElement password;
	@FindBy(xpath = "//button")
	public WebElement loginBtn;

	public LoginPageUsingPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
