package testcases;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;
import reportings.ExtentManager;

public class BaseTest 
{
	
//acceptable Failure, Critical Failure, Unexpected Failure	
 
  public  ApplicationKeywords app;
  public static String projectPath = System.getProperty("user.dir") ;
  public static ExtentReports rep;
  public static ExtentTest test;
    
  @BeforeTest
  public void beforeTest(ITestContext context) throws Exception
  {
	  app = new ApplicationKeywords();
	  context.setAttribute("app", app);
	  	  
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
	  test = (ExtentTest)context.getAttribute("test");
	  String criticalFailure = (String)context.getAttribute("criticalFailure");
	  if(criticalFailure != null && criticalFailure.equals("Y"))
	  {
		  test.log(Status.SKIP, "criticalFailure in Test");
		  throw new SkipException("criticalFailure in Test"); // It skips in TesstNG
	  }
	 app  =  (ApplicationKeywords)context.getAttribute("app");
	 rep  =  (ExtentReports)context.getAttribute("report");
	 
  }
  
  @AfterTest
  public void quit()
  {
	  if(rep!=null)
		  rep.flush();
  }
  
 

}
