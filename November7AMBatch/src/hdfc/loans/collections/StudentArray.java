package hdfc.loans.collections;

public class StudentArray 
{

	public static void main(String[] args)
	{
		StudentDB s1 = new StudentDB(100, "student1");
		StudentDB s2 = new StudentDB(200, "student2");
		StudentDB s3 = new StudentDB(300, "student3");
		StudentDB s4 = new StudentDB(400, "student4");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		
		//int[] a = new int[3];
		StudentDB[] st = new StudentDB[4];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(StudentDB s:st)
		{
			System.out.println(s);
		}

	}

}
