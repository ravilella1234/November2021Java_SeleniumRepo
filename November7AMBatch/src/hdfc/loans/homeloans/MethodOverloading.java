package hdfc.loans.homeloans;

public class MethodOverloading 
{
	
	/*
	 * public void m1(int x) { System.out.println(x); }
	 */
	 
	/*
	 * public void m1(float x) { System.out.println(x); }
	 */
	
	/*
	 * public void m1(String x) { System.out.println(x); }
	 */
	
	/*
	 * public void m1(Integer x) { System.out.println(x); }
	 */
	
	/*
	 * public void m1(Number x) { System.out.println(x); }
	 */
	
	public void m1(Object x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("ravi");
		obj.m1(1000);
		obj.m1(12.45f);
		obj.m1("teja");
	}

}
