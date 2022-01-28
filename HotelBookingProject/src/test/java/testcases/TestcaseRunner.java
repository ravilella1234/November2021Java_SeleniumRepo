package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestcaseRunner 
{

	public static void main(String[] args) 
	{
		TestNG testng = new TestNG();
		
		XmlSuite mysuite = new XmlSuite();
		mysuite.setName("LoginSuite");
		List<XmlSuite> allsuite = new ArrayList<XmlSuite>();
		allsuite.add(mysuite);
		testng.setXmlSuites(allsuite);
		
		XmlTest test = new XmlTest(mysuite);
		test.setName("LoginTest");
		
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("testcases.Login"));
		test.setXmlClasses(classes);
		
		testng.run();

	}

}
