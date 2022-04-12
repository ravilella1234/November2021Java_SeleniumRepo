package keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import reportings.ExtentManager;

public class GenericKeywords  
{
	public WebDriver driver;
	public  String projectPath = System.getProperty("user.dir");
	public  FileInputStream fis;
    public  Properties orprop;
	public Properties mainprop;
	public Properties childProp;
	public ExtentTest test;
	SoftAssert softAssert;	

	public void openBrowser(String browser)
	{
		log("Opening Browser :" + browser);
		//test.log(Status.INFO, "Opening Browser :" + browser);
		if(childProp.getProperty(browser).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(childProp.getProperty(browser).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
	}
	
	public void navigate(String url)
	{
		log("Navigating to Url : " + url);
		//test.log(Status.INFO, "Navigating to Url : " + url);
		driver.navigate().to(childProp.getProperty(url));
	}
	
	public void click(String locatorKey)
	{
		log("Clicking on element :"+locatorKey);
		//test.log(Status.INFO, "Clicking on element :"+locatorKey);
		getElement(locatorKey).click();
	}
	
	public void type(String locatorKey, String text)
	{
		log("Typing text :" +text+"By ussing locator :"+ locatorKey);
		//test.log(Status.INFO, "Typing text :" +text+"By ussing locator :"+ locatorKey);
		getElement(locatorKey).sendKeys(childProp.getProperty(text));
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
			by = By.id(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_name")) {
			by = By.name(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("className")) {
			by = By.className(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("xpath")) {
			by = By.xpath(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("css")){
			by = By.cssSelector(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("linktext")) {
			by = By.linkText(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(orprop.getProperty(locatorKey));
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
	
	public void reportFailure(String failureMsg,boolean stopOnFailure)
	{
		System.out.println(failureMsg); // failure msg in Console
		test.log(Status.FAIL, failureMsg); // failure msg in Extent Reports
		takeScreenShot(); // put the screenshots in the report
		softAssert.fail(failureMsg);  // failure in TestNG Reports
		
		if(stopOnFailure)
			assertAll(); // reports all the failures
			
	}
	
	public void assertAll()
	{
		Reporter.getCurrentTestResult().getTestContext().setAttribute("criticalFailure", "Y");
		softAssert.assertAll();
	}
	
	public void takeScreenShot()
	{
		// fileName of the screenshot
		Date d=new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
		// take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			// get the dynamic folder name
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath+"//"+screenshotFile));
			//put screenshot file in reports
			test.log(Status.INFO,"Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+"//"+screenshotFile));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
