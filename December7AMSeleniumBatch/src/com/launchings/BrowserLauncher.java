package com.launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Desktop\\December LatestDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		//System.setProperty("webdriver.gecko.driver", "C:/Users/ravi/Desktop/December LatestDrivers/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.navigate().to("https://www.bestbuy.com");
	}

}
