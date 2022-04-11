package testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class PortifolioManagement extends BaseTest
{
	
  @Test
  public void createPortifolio() 
  {
	  test.log(Status.INFO, "createPortifolio");	
	  app.reportFailure("Some non critical failure...",false);
  }
  
  @Test()
  public void modifyPortifolio() 
  {
	  System.out.println("modifyPortifolio");
  }
  
  @Test
  public void deletePortifolio() 
  {
	  test.log(Status.INFO, "deletePortifolio");
  }
}
