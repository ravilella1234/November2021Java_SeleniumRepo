package suitesParallel;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteParallel 
{

	public static void main(String[] args) 
	{
		/*
		 * String[] s1 = new String[3]; s1[0]="ravi";
		 * 
		 * String[] s2 = {"ravi"};
		 * 
		 * String[] s3 = new String[] {"ravi"};
		 */
		
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}

}
