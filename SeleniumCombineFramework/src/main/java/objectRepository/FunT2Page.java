package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunT2Page {
	public FunT2Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);

}
@FindBy(xpath="//a[contains(text(),'Opportunities')]/..//parent::td[contains(@class,'tabUnSelected')]")
private WebElement OpportunitiesTab;
@FindBy(xpath="//a[contains(text(),'Opportunities')]/..//parent::td[contains(@class,'moduleName')]")
private WebElement OpportunitiesLink;
public WebElement getOpportunitiesTab() {
	return OpportunitiesTab;
}
public WebElement getOpportunitiesLink() {
	return OpportunitiesLink;
}

}


