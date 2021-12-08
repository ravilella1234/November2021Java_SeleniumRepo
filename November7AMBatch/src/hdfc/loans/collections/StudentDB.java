package hdfc.loans.collections;

public class StudentDB 
{
	int sno;
	String sname;
	
	public StudentDB(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "StudentDB [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		StudentDB s = new StudentDB(100, "sai");
		System.out.println(s);
	}

}
