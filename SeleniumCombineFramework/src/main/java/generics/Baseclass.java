package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactPage;
import objectRepository.EmailComposePage;
import objectRepository.FunT2Page;
import objectRepository.FunctionalT1Page;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.OrganizationPage;
import objectRepository.QuickCreatePage;

public class Baseclass {
	public static WebDriver driver;
	public PropertyUtility property;
	public WebDriverUtility utility;
	public LoginPage login;
	public HomePage home;
	public ContactPage contact;
	public OrganizationPage OrganizationTab;
	public QuickCreatePage QuickCreatdropdown;
	public EmailComposePage EmailTab;
	public FunctionalT1Page FunTest1;
	public FunT2Page FundT2;
	
	
	@BeforeClass
public void launchingBrowser()
{
	property = new PropertyUtility();
	utility = new WebDriverUtility();
	
	if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
	else
	{
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
	@BeforeMethod
public void navigatingtoApplication()
{
		login = new LoginPage(driver);
		home = new HomePage(driver);
		contact= new ContactPage(driver);
		OrganizationTab =new OrganizationPage(driver);
		QuickCreatdropdown =new QuickCreatePage(driver);
		EmailTab =new EmailComposePage(driver);
		FunTest1 =new FunctionalT1Page(driver);
		FundT2 =new FunT2Page(driver);
		
	driver.get(property.readingDataFromPropertyFile("url"));
	login.loginToApplication(property.readingDataFromPropertyFile("username"), property.readingDataFromPropertyFile("password"));
}
	@AfterMethod
public void signOutFromApplication()
{
		login = new LoginPage(driver);
		home = new HomePage(driver);
		
	utility.mouseHoveringOnElement(driver,home.getAdminIcon());
	home.getSignoutButton().click();
	System.out.println("signed out");
}
	@AfterClass
public void closingTheBrowser()
{
	driver.quit();
}
}
