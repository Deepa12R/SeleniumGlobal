package generics;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
/**
 * this method is used to enter the data by using javascriptexecutor
 * @param driver
 * @param element
 * @param data
 */
	public void enteringDataIntoTF(WebDriver driver, WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + data + "'", element);
	}

	/**
	 * this method os used to click on a element using java script executor
	 * @param driver
	 * @param element
	 */
	public void clickingOnElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * this method is used to switching the frame by using index
	 * @param driver
	 * @param index
	 */
	public void switchingToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * this method is used to switching the frame by using name
	 * @param driver
	 * @param name
	 */

	public void switchingToFrame(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}

	/**
	 * this method is used to switching the frame by using webelement element
	 * @param driver
	 * @param element
	 */
	public void switchingToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * this method is used to switching back to the window 
	 * @param driver
	 */
	public void switchingBackToFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * this method is used to switch the alert
	 * @param driver
	 * @return
	 */
	public Alert switchingToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void mouseHoveringOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * this method is used to handling the drop down by the reference of string value
	 * @param dropdown
	 * @param value
	 */
	public void handlingDropDown(WebElement dropdown, String value) {
		Select select = new Select(dropdown);
		try {
			select.selectByValue(value);
		} catch (NoSuchElementException e) {
			select.selectByVisibleText(value);
		}
	}

	/**
	 * this method is used to handling the drop down by the reference of integer value
	 * @param dropdown
	 * @param value
	 */
	public void handlingDropDown(WebElement dropdown, int value) {
		Select select = new Select(dropdown);
		select.selectByIndex(value);
	}

	/**
	 * This method is used to open a new window or new tab
	 * @param driver
	 * @param parentwindow
	 * @param alwindowID
	 * @param title
	 */
	public void switchtoWindow(WebDriver driver, String parentwindow, Set<String> alwindowID, String title) {
		alwindowID.remove(parentwindow);
		for (String id : alwindowID) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains(title))
				break;
		}
	}
	/**
	 * This method is used to switching back to main window or main
	 * @param driver
	 * @param ParentWindowid
	 */
	public void switchBacktoMainwindow(WebDriver driver, String ParentWindowid) {
		driver.switchTo().window(ParentWindowid);
	}
}