package keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords  extends ValidationKeywords
{
	public WebDriver driver;
	public  String projectPath = System.getProperty("user.dir");
	public  FileInputStream fis;
    public  Properties orprop;
	public Properties mainprop;
	public Properties childProp;
	public ExtentTest test;
	
	
	public void openBrowser(String browser)
	{
		log("Opening Browser :" + browser);
		//test.log(Status.INFO, "Opening Browser :" + browser);
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
	}
	
	public void navigate(String url)
	{
		log("Navigating to Url : " + url);
		//test.log(Status.INFO, "Navigating to Url : " + url);
		driver.navigate().to(url);
	}
	
	public void click(String locatorKey)
	{
		log("Clicking on element :"+locatorKey);
		//test.log(Status.INFO, "Clicking on element :"+locatorKey);
		getElement(locatorKey).click();
	}
	
	public void type(String locatorKey, String text)s
	{
		log("Typing text :" +text+"By ussing locator :"+ locatorKey);
		//test.log(Status.INFO, "Typing text :" +text+"By ussing locator :"+ locatorKey);
		getElement(locatorKey).sendKeys(text);
	}
	
	public void selectOption(String locatorKey,String option)
	{
		getElement(locatorKey).sendKeys(option);
	}
	
	public String getText(String locatorKey)
	{
		return null;
	}
	
	public WebElement getElement(String locatorKey)
	{
		WebElement element = null;
		
		//check for presence of Element
		if(!isElementPresent(locatorKey))
			//report the failure
			System.out.println("Element is not present :- "+ locatorKey);
		
		element = driver.findElement(getLocator(locatorKey));
		
		return element;
		
	}

	public boolean isElementPresent(String locatorKey) 
	{
		System.out.println("Checking  for the Element Presence :" + locatorKey);	
		WebDriverWait wait = new WebDriverWait(driver, 30);
			try 
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
			} 
			catch (Exception e) 
			{
				return false;
			}
			return true;
	}
	
	public By getLocator(String locatorKey)
	{
		By by=null;
		if(locatorKey.endsWith("_id")) {
			by = By.id(locatorKey);
		}else if(locatorKey.endsWith("_name")) {
			by = By.name(locatorKey);
		}else if(locatorKey.endsWith("className")) {
			by = By.className(locatorKey);
		}else if(locatorKey.endsWith("xpath")) {
			by = By.xpath(locatorKey);
		}else if(locatorKey.endsWith("css")){
			by = By.cssSelector(locatorKey);
		}else if(locatorKey.endsWith("linktext")) {
			by = By.linkText(locatorKey);
		}else if(locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(locatorKey);
		}
		return by;
		
	}
	
	public void setReport(ExtentTest test)
	{
		this.test = test;
	}
	
	//Reporting Function
	public void log(String msg)
	{
		test.log(Status.INFO, msg);
	}
	
}
