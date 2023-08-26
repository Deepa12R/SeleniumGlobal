package organisation;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generics.Baseclass;
import generics.ExcelUtility;

public class ST_ConactCreation_02_Test extends Baseclass{
	@Test(dataProvider="testdata",dataProviderClass= ExcelUtility.class)
	public void Create_Quick_Contact(String LastName,String OrganizationName,String Emailtxtfiled) throws InterruptedException
	{
		QuickCreatdropdown.getQuickCreateDropdown().click();
		utility.handlingDropDown(QuickCreatdropdown.getContactbutton(), "Contacts");
		Thread.sleep(3000);

		utility.handlingDropDown(QuickCreatdropdown.getFirstNamedropdown(), "Ms.");

		//		QuickCreatdropdown.getFirstNamedropdown().click();
		QuickCreatdropdown.getLastNameTextField().sendKeys(LastName);
		QuickCreatdropdown.getOrganizationNameTextField().sendKeys(OrganizationName);
		QuickCreatdropdown.getEmailTextField().sendKeys(Emailtxtfiled);
		QuickCreatdropdown.getSave_Button().click();
		QuickCreatdropdown.getContactTab().click();
		Thread.sleep(3000);
		QuickCreatdropdown.getCheckboxselect().click();
		QuickCreatdropdown.getDeletebutton().click();
		Actions action=new Actions(driver);
		driver.switchTo().alert().accept();
		utility.mouseHoveringOnElement(driver,home.getAdminIcon());
		home.getSignoutButton().click();
		
	}


}
