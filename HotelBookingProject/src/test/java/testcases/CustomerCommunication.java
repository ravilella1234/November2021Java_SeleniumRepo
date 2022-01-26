package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerCommunication 
{
  @Test
  public void checkEmailVerification(ITestContext context) 
  {
	  String bookingid = (String)context.getAttribute("bookingid");
	  System.out.println("checkEmailVerification :" + bookingid);
  }
  
  @Test
  public void checkMobileVerification(ITestContext context) 
  {
	  String bookingid = (String)context.getAttribute("bookingid");
	  System.out.println("checkMobileVerification :" + bookingid);
  }
  
}
