package testcases;

import org.testng.annotations.Test;

public class Session extends BaseTest
{
	
	
  @Test
  public void doLogin()
  {
	  System.out.println("Logging In .....");
	  app.click("signin_linktext");
	 
  }
  
  @Test
  public void doLogout()
  {
	  System.out.println("Logging Out .....");
  }
}
