package suiteB;

import org.testng.annotations.Test;

public class TestB1 
{
  @Test
  public void f() throws Exception 
  {
	  System.out.println("Starting TestB1");
	  
	  Thread.sleep(4000);
	  
	  System.out.println("Ending TestB1");
  }
}
