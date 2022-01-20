package suitesParallel;

import org.testng.annotations.Test;

public class NewTest 
{
  @Test
  public void test1()
  {
	  System.out.println("Iam test1 :" +Thread.currentThread().getId());
  }
  
  @Test
  public void test2()
  {
	  System.out.println("Iam test2 :"+Thread.currentThread().getId());
  }
  
  @Test
  public void test3()
  {
	  System.out.println("Iam test3 :"+Thread.currentThread().getId());
  }
}
