package hdfc.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('k'));
		
		System.out.println(s1.substring(2, 7));
		
		String s2 = new String("lella");
		System.out.println(s2);
		System.out.println(s1);
		
		System.out.println(s1.equals(s2));
		
		String s3 = "Ravikanth";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s4 = "Ravikant";
		System.out.println(s1.contains(s4));
		
		System.out.println(s4);
		System.out.println(s4.toLowerCase());
		System.out.println(s1.contains(s4.toLowerCase()));
		
		String s5 = "RaviKanth";
		System.out.println(s5);
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		//s1 = s1+s2;
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		String s6 = "ravikanth";
		String s7 = " Ravikanth";
		System.out.println(s6.equals(s7));
		System.out.println(s7);
		//System.out.println(s7.trim());
		//System.out.println(s6.equals(s7.trim()));
		System.out.println(s6.equals(s7.trim().toLowerCase()));
		System.out.println(s6.equalsIgnoreCase(s7.trim()));
		
		String s8 = "ravikanth";
		System.out.println(s8);
		System.out.println(s8.replace('r', 'k'));
		
		String s9 = "ravi kanth lella";
		System.out.println(s9);
		String[] str = s9.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
		
		String s10 = "Ravikanth";
		System.out.println(s10);
		System.out.println(s10.startsWith("rav"));
		System.out.println(s10.toLowerCase().startsWith("ravi"));
		
		System.out.println(s10);
		System.out.println(s10.endsWith("nth"));
	}

}
