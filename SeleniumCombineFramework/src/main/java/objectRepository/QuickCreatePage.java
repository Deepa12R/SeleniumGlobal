package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickCreatePage {
	public QuickCreatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="qccombo")
	private WebElement QuickCreateDropdown;
	@FindBy(xpath="//option[contains(@value,'Contacts')]/..//parent::select[contains(@id,'qccombo')]")
	private WebElement Contactbutton;
	@FindBy(xpath="//select[contains(@name,'salutationtype')]")
	private WebElement FirstNamedropdown;
	@FindBy(xpath="//option[contains(@value,'Ms.')]")
	private WebElement selectvaluefromFNdropdown;
	@FindBy(xpath="//input[contains(@name,\"account_name\")]")
	private WebElement OrganizationNameTextField;
	@FindBy(xpath="//input[contains(@id,\"email\")]")
	private WebElement EmailTextField;
	@FindBy(xpath="//input[contains(@name,\"lastname\")]")
	private WebElement LastNameTextField;
	@FindBy(xpath="//input[contains(@id,'selectCurrentPageRec')]")
	private WebElement Checkboxselect;

	public WebElement getCheckboxselect() {
		return Checkboxselect;
	}
	@FindBy(xpath="//input[contains(@class,\"crmbutton small save\")]")
	private WebElement Save_Button;
@FindBy(xpath="//a[contains(text(),'Contacts')]/..//parent::td[contains(@class,'tabSelected')]")	
private WebElement ContactTab;

@FindBy(xpath="//input[contains(@id,'8')]")
private WebElement Contactidcheckbox;
@FindBy(xpath="(//input[contains(@value,\"Delete\")])[2]")
private WebElement Deletebutton;


	public WebElement getDeletebutton() {
	return Deletebutton;
}
	public WebElement getContactTab() {
	return ContactTab;
}
public WebElement getContactidcheckbox() {
	return Contactidcheckbox;
}
	public WebElement getFirstNamedropdown() {
		return FirstNamedropdown;
	}
	public WebElement getSelectvaluefromFNdropdown() {
		return selectvaluefromFNdropdown;
	}
	public WebElement getOrganizationNameTextField() {
		return OrganizationNameTextField;
	}
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}
	public WebElement getSave_Button() {
		return Save_Button;
	}
	public WebElement getQuickCreateDropdown() {
		return QuickCreateDropdown;
	}
	public WebElement getContactbutton() {
		return Contactbutton;
	}

}
