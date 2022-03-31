package testcases;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;
import reportings.ExtentManager;

public class BaseTest 
{
 
  public  ApplicationKeywords app;
  public static String projectPath = System.getProperty("user.dir") ;
  public static ExtentReports rep;
  public static ExtentTest test;
    
  @BeforeTest
  public void beforeTest(ITestContext context) throws Exception
  {
	  app = new ApplicationKeywords();
	  context.setAttribute("app", app);
	  app.openBrowser("chrome");
	  app.navigate("https://money.rediff.com/index.html");
	  
	  //init the Reporting for the Test
	  rep = ExtentManager.getReports();
	  test =  rep.createTest(context.getCurrentXmlTest().getName());
	  test.log(Status.INFO, "starting the test :" + context.getCurrentXmlTest().getName());
	  
	  app.setReport(test);
	  context.setAttribute("report", rep);
	  context.setAttribute("test", test);
  }
  
  @BeforeMethod
  public void beforeMethod(ITestContext context)
  {
	 app  =  (ApplicationKeywords)context.getAttribute("app");
	 rep  =  (ExtentReports)context.getAttribute("report");
	 test = (ExtentTest)context.getAttribute("test");
  }

}
