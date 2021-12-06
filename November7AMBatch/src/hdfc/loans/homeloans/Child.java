package hdfc.loans.homeloans;

 class Parent
{
	public  Number workhard()
	{
		System.out.println("Parent : wake-up early, goto college");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent :  Atmost care");
	}
	
	
}

public class Child extends Parent
{
	public  Integer workhard()
	{
		System.out.println("Child : wake-up anytime, goto movie");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}
	
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		p.workhard();
		p.care();
		
		System.out.println("------------------");
		
		Child obj = new Child();
		obj.workhard();
		obj.care();
		obj.love();
	}
}
