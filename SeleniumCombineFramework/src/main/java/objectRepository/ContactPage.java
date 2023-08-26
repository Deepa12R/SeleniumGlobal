package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Contacts")
	private WebElement ContactsButton;

	@FindBy(xpath = "//a[@href='index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing']")
	private WebElement CreateNewContactButton;

	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement salutationtypeButton;

	@FindBy(xpath = "//option[@value='Mrs.']")
	private WebElement MrsButton;
	
	@FindBy(name = "firstname")
	private WebElement TextButton;

	

	public WebElement getSalutationtypeButton() {
		return salutationtypeButton;
	}

	

	public WebElement getContactsButton() {
		return ContactsButton;
	}

	public WebElement getCreateNewContactButton() {
		return CreateNewContactButton;
	}

	public WebElement getSalutationTypeButton() {
		return salutationtypeButton;
	}

	public WebElement getMrsButton() {
		return MrsButton;
	}
    
	public WebElement getTextButton()
	{
		return TextButton;
	}
}
