package excelOperations;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataManagementFinalVersion 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> h) 
  {
	  System.out.println("USerEmail : " + h.get("UserName"));
	  System.out.println("userPassword : " + h.get("UserPassword"));
  }
  
  @DataProvider
  public Object[][] getData() throws Exception
  {
	ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
	String sheetName = "data";
	String testCaseName = "LoginTest";
	  
	return DataUtils.getTestData(e, sheetName, testCaseName);
	  
  }
}
