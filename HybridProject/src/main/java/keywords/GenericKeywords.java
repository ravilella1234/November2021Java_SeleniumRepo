package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords  extends ValidationKeywords
{
	public WebDriver driver;
	
	
	public void openBrowser(String browser)
	{
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
	}
	
	public void navigate(String url)
	{
		driver.navigate().to(url);
	}
	
	public void click(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public void type(String locatorKey, String text)
	{
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
	
}
