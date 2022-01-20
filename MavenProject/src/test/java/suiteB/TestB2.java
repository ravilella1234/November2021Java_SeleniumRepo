package suiteB;

import org.testng.annotations.Test;

public class TestB2 
{
  @Test
  public void f() throws Exception 
  {
	  System.out.println("Starting TestB2");
	  
	  Thread.sleep(4000);
	  
	  System.out.println("Ending TestB2");
  }
}
