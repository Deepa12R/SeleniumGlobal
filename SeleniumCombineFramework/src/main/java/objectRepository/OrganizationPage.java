package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
public OrganizationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//a[contains(text(),'Organizations')]/..//parent::td[contains(@class,'tabUnSelected')]")
private WebElement OrganizationTab;
@FindBy(xpath="//a[contains(text(),'Create an')]")
private WebElement CreateOrganizationLink;
@FindBy(xpath="//input[contains(@name,'accountname')]")
private WebElement OganizationNameTxtField;
@FindBy(id="email2")
private WebElement OtherEmailtxtField;
@FindBy(xpath="//textarea[contains(@name,'description')]")
private WebElement DescriptionTextField;
@FindBy(xpath="//input[contains(@class,'crmbutton small save')][1]")
private WebElement SaveButton;
@FindBy(xpath="//input[contains(@onclick,\"check_object(this)\")]")
private WebElement Checkbox;
@FindBy(xpath="//a[contains(text(),'del')]")
private WebElement deletebutton;

//public void getDeletebutton(WebElement deletebutton) {
	//this.deletebutton = deletebutton;
//}
public WebElement getDeletebutton() {
	return deletebutton;
}
public WebElement getCheckbox() {
	return Checkbox;
}
//public void getCheckbox(WebElement checkbox) {
	//Checkbox = checkbox;
//}
public WebElement getOrganizationTab() {
	return OrganizationTab;
}
public WebElement getCreateOrganizationLink() {
	return CreateOrganizationLink;
}
public WebElement getOganizationNameTxtField() {
	return OganizationNameTxtField;
}
public WebElement getOtherEmailtxtField() {
	return OtherEmailtxtField;
}
public WebElement getDescriptionTextField() {
	return DescriptionTextField;
}
public WebElement getSaveButton() {
	return SaveButton;
}


}
