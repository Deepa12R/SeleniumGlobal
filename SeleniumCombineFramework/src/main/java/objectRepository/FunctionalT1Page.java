package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionalT1Page {
	public FunctionalT1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//a[contains(text(),'Organizations')]/..//parent::td[contains(@class,'tabUnSelected')]")
	private WebElement OrganizationTab;
	@FindBy(xpath="//a[contains(text(),'Organizations')]/..//parent::td[contains(@class,'moduleName')]")
	private WebElement OrganizationLink;
	public WebElement getOrganizationTab() {
		return OrganizationTab;
	}
	public WebElement getOrganizationLink() {
		return OrganizationLink;
	}
	
	

}
