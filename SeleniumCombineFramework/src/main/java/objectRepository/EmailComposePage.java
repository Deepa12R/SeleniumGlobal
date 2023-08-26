package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailComposePage {

	public EmailComposePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
		
	}
	@FindBy(xpath="(//a[contains(text(),'Email')]/..)[1]")
	private WebElement EmailTab;
	@FindBy(xpath="//a[contains(text(),'Compose')]")
	private WebElement CompoaseLink;
	@FindBy(id="parent_name")
	private WebElement ToTextField;
	@FindBy(xpath="//input[contains(@name,'subject')]")
	private WebElement SubjectTextField;
	@FindBy(xpath="(//input[contains(@value,' Select Email Template  ')])[1]")
	private WebElement SelectEmailTemplateTab;
	@FindBy(xpath="//a[contains(text(),'Thanks Note')]")
	private WebElement ThankNoteOption;
	@FindBy(xpath="(//input[contains(@value,' Send ')])[1]")
	private WebElement SendButton;
	@FindBy(xpath="//input[contains(@name,'Button2')]")
	private WebElement deleteButton;
	public WebElement getDeleteButton() {
		return deleteButton;
	}
	@FindBy(xpath="(//input[contains(@value,'  Save ')])[1]")
	private WebElement SaveButton;
	@FindBy(xpath="//input[contains(@name,'selectall')]")
	private WebElement checkboxforDelete;
	
	public WebElement getCheckboxforDelete() {
		return checkboxforDelete;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}
	public WebElement getEmailTab() {
		return EmailTab;
	}
	public WebElement getCompoaseLink() {
		return CompoaseLink;
	}
	public WebElement getToTextField() {
		return ToTextField;
	}
	public WebElement getSubjectTextField() {
		return SubjectTextField;
	}
	public WebElement getSelectEmailTemplateTab() {
		return SelectEmailTemplateTab;
	}
	public WebElement getThankNoteOption() {
		return ThankNoteOption;
	}
	public WebElement getSendButton() {
		return SendButton;
	}
	
	
	
}
