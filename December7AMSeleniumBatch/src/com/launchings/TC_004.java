package com.launchings;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.icicibank.com/");
		
		
		init();
		
		launcher("chromebrowser");
		
		navigateUrl("iciciurl");
	}

}
