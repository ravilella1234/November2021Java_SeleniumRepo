package hdfc.loans.collections;

public class Emp2 
{
	int eno;
	String ename;
	
	public Emp2(int eno, String ename) 
	{
		this.eno = eno;
		this.ename = ename;
	}
	
	public void dispaly()
	{
		System.out.println("EMPID : " + eno +"  " + "ENAME : "+ ename);
	}

	public static void main(String[] args) 
	{
		Emp2 e = new Emp2(100, "ravi");
		e.dispaly();
	}

}
