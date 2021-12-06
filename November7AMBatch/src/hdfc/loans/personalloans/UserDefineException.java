package hdfc.loans.personalloans;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter the 10 character String : ");
			str = sc.nextLine();
			try 
			{
				if (str.length() != 10)
				{
					throw new UserDefineException("String should be 10 charater String...");
				}
				else
				{
					System.out.println(str);
					break;
				}
			} 
			catch (UserDefineException e) 
			{
				e.printStackTrace();
			} 
		}
		

	}

}
