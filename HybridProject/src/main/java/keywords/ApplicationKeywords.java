package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ApplicationKeywords  extends GenericKeywords
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
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
			childProp.load(fis);
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
			orprop.load(fis);
			
		 } 
		 catch (FileNotFoundException e)
		 {
			e.printStackTrace();
		 }
		
	}

	public void cutomerLogin()
	{
		
	}
	
	public void selectDatefromcalander()
	{
		
	}
	
}
