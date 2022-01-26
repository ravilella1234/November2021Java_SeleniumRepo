package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
	
  @Test
  public void applyDiscount() 
  {
	  System.out.println("applyDiscount");
  }
  
  @Test
  @Parameters({"action"})
  public void makePayment(String paymentType, ITestContext context) 
  {
	  if(paymentType.equals("pay@hotel"))
		  System.out.println("pay@hotel Booking");
	  else
		  System.out.println("electonicPayment Booing");
	  
	  //booking number
	  String bookingID = "ravi1234";
	  context.setAttribute("bookingid", bookingID);
	  System.out.println("Booking id in makePayment function :" + bookingID);
	  
  }
  
}
