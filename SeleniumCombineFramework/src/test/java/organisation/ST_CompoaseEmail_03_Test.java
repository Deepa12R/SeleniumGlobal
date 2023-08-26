package organisation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generics.Baseclass;


public class ST_CompoaseEmail_03_Test extends Baseclass {
	@Test
	public void Compoase_Email() throws InterruptedException {
		EmailTab.getEmailTab().click();
		EmailTab.getCompoaseLink().click();
		Set<String> handles = driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		driver.switchTo().window(childid);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='rdeepa30697@gmail.com'", EmailTab.getToTextField());
		EmailTab.getToTextField().sendKeys("rdeepa30697@gmail.com");
		EmailTab.getSubjectTextField().sendKeys("Compoase Email");
		EmailTab.getSaveButton().click();
		driver.switchTo().window(parentid);
		EmailTab.getCheckboxforDelete().click();
		EmailTab.getDeleteButton().click();
		Actions act=new Actions(driver);
		driver.switchTo().alert().accept();

	}

}
