package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@style='padding: 0px;padding-left:5px']")
	private WebElement AdminIcon;
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	private WebElement SignoutButton;
	public WebElement getAdminIcon()
	{
		return AdminIcon;
	}
	public WebElement getSignoutButton()
	{
		return SignoutButton;
	} 
}

