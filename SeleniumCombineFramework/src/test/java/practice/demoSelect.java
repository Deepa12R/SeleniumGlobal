package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demoSelect {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ishit/OneDrive/Desktop/new.html");
	WebDriverUtility uti = new WebDriverUtility();
	uti.handlingDropDown(driver.findElement(By.id("single")), 3);
}
}
