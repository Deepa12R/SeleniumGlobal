package contacts;

import org.testng.annotations.Test;

import generics.Baseclass;
import generics.ExcelUtility;

public class FT_CONTACTS_01_Test extends Baseclass {
@Test
	public void Creating_a_contact_with_valid_details() throws InterruptedException 
	{
		
	contact.getContactsButton().click();
	
	contact.getCreateNewContactButton().click();
	
	contact.getSalutationTypeButton().click();
	
	contact.getMrsButton().click();
	
	contact.getTextButton().sendKeys("ISHITA");
	Thread.sleep(2000);
	}
}

