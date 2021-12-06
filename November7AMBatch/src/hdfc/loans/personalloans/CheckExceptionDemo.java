package hdfc.loans.personalloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckExceptionDemo 
{

	public static void m1() 
	{
		try {
			BufferedReader b = new BufferedReader(new FileReader("d://abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		m1();

	}

}
