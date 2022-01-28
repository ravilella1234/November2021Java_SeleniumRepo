package testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class SimpleRunner 
{

	public static void main(String[] args) 
	{
		TestNG testng = new TestNG();
		
		XmlSuite mysuite = new XmlSuite();
		mysuite.setName("BookingSuite");
		List<XmlSuite> allsuites = new ArrayList<XmlSuite>();
		allsuites.add(mysuite);
		testng.setXmlSuites(allsuites); 
		
		// 1st testcase
		XmlTest createBooking = new XmlTest(mysuite);
		createBooking.setName("Create Booking Test- Applying Discount - pay@hotel");
		
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("action", "pay@hotel");
		createBooking.setParameters(parameters);
		
		List<XmlClass> testclasses = new ArrayList<XmlClass>();
		XmlClass testclass = new XmlClass("testcases.BookingSearch");
		
		List<XmlInclude> methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("searchHotel",1));
		methods.add(new XmlInclude("selectHotel",2));
		methods.add(new XmlInclude("entertGuestInformation",3));
		testclass.setIncludedMethods(methods);
		testclasses.add(testclass);

		testclass = new XmlClass("testcases.PaymentManager");
		methods.add(new XmlInclude("applyDiscount",1));
		methods.add(new XmlInclude("makePayment",2));
		testclass.setIncludedMethods(methods);
		testclasses.add(testclass);
		
		testclass = new XmlClass("testcases.CustomerCommunication");
		methods.add(new XmlInclude("checkEmailVerification",1));
		methods.add(new XmlInclude("checkMobileVerification",2));
		testclass.setIncludedMethods(methods);
		testclasses.add(testclass);
		
		createBooking.setXmlClasses(testclasses);
		
		testng.run();
	}

}
