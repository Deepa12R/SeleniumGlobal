package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSwitching {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		String expectedtitle = "AlertsDemo";
		WebDriverUtility uti = new WebDriverUtility();
		uti.switchtoWindow(driver, parentid, driver.getWindowHandles(), expectedtitle);
		driver.close();

		Thread.sleep(2000);

		uti.switchBacktoMainwindow(driver, parentid);
		driver.close();
	}
}
