package organisation;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import generics.Baseclass;
	

public class ST_Organization_01_Test extends Baseclass{
	@Test
	public void Creating_an_Organization()
	{
		OrganizationTab.getOrganizationTab().click();
		OrganizationTab.getCheckbox().click();
		OrganizationTab.getDeletebutton().click();
		Actions action=new Actions(driver);
		driver.switchTo().alert().accept();
		OrganizationTab.getCreateOrganizationLink().click();
		OrganizationTab.getOganizationNameTxtField().sendKeys("AdvanceSelenium");
		OrganizationTab.getOtherEmailtxtField().sendKeys("rdeepa30697@gmail.com");
		OrganizationTab.getDescriptionTextField().sendKeys("demopurpose");
		OrganizationTab.getSaveButton().click();
		
		
		
	}
	

}
