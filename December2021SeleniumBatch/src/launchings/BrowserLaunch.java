package launchings;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserLaunch 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/ravi/Desktop/December 2021 drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravi\\Desktop\\December 2021 drivers\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		
		
		//webdriver.ie.driver
		//webdriver.edge.driver
	}

}
