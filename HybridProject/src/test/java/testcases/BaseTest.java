package testcases;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeywords;

public class BaseTest 
{
 
  public ApplicationKeywords app;
  public  String projectPath = System.getProperty("user.dir");
  public  FileInputStream fis;
  public  Properties orprop;
	
  
  public  void init() throws Exception
  {
	  fis = new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
	  orprop = new Properties();
	  orprop.load(fis);
  }
  
  @BeforeTest
  public void beforeTest() throws Exception
  {
	  init();
	  app = new ApplicationKeywords();
	  app.openBrowser("chrome");
	  app.navigate("https://money.rediff.com/index.html");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  
  }

}
