package pages.neotech;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.neotech.BaseClass;

public class AddEmployeePageFactory {
	@FindBy(id="first-name-box")
	WebElement firstName;
	@FindBy(id="last-name-box")
	WebElement lastName;
	@FindBy(id="modal-save-button")
	WebElement modalSaveButton;
	@FindBy(xpath="//img[@data-tooltip='Change Profile Picture']")
	WebElement imageButton;
	@FindBy(id="employeePicture")
	WebElement employeePicture;
	@FindBy(xpath="//a[@form-name='photoForm']")
	WebElement photoSaveButton;
	public AddEmployeePageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	
	}
	

}
