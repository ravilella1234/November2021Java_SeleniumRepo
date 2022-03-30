package testcases;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeywords;

public class BaseTest 
{
 
  public  ApplicationKeywords app;
    
  @BeforeTest
  public void beforeTest(ITestContext context) throws Exception
  {
	  app = new ApplicationKeywords();
	  context.setAttribute("app", app);
	  app.openBrowser("chrome");
	  app.navigate("https://money.rediff.com/index.html");
  }
  
  @BeforeMethod
  public void beforeMethod(ITestContext context)
  {
	 app =  (ApplicationKeywords)context.getAttribute("app");
  }

}
