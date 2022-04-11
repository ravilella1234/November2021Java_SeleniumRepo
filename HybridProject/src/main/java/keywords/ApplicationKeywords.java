package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.asserts.SoftAssert;

public class ApplicationKeywords  extends ValidationKeywords
{
	
	public ApplicationKeywords() throws Exception 
	{
		 mainprop =new Properties();
		 childProp = new Properties();
		 orprop = new Properties();
		 
		 try 
		 {
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
			mainprop.load(fis);
			String e = mainprop.getProperty("env");
			System.out.println(e);
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
			childProp.load(fis);
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
			orprop.load(fis);
			
		 } 
		 catch (FileNotFoundException e)
		 {
			e.printStackTrace();
		 }
		
		 softAssert = new SoftAssert();
	}

	public void cutomerLogin()
	{
		
	}
	
	public void selectDatefromcalander()
	{
		
	}
	
}
