package gridpack;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridDemo 
{
  @Test
  public void test1() throws Exception 
  {
	  System.out.println("Starting Test1");
	  WebDriverManager.chromedriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  
	  Thread.sleep(5000);
	  driver.quit();
	  System.out.println("Ending Test1");
  }
  
  
  @Test
  public void test2() throws Exception 
  {
	  System.out.println("Starting Test2");
	  WebDriverManager.chromedriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	  driver.quit();
	  System.out.println("Ending Test2");
  }
  
  
  @Test
  public void test3() throws Exception 
  {
	  System.out.println("Starting Test3");
	  WebDriverManager.chromedriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	  driver.quit();
	  System.out.println("Ending Test3");
  }
  
  
  @Test
  public void test4() throws Exception 
  {
	  System.out.println("Starting Test4");
	  WebDriverManager.chromedriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	  driver.quit();
	  System.out.println("Ending Test4");
  }
  
  @Test
  public void test5() throws Exception 
  {
	  System.out.println("Starting Test5");
	  WebDriverManager.chromedriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	  driver.quit();
	  System.out.println("Ending Test5");
  }
  
  @Test
  public void test6() throws Exception 
  {
	  System.out.println("Starting Test6");
	  WebDriverManager.chromedriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.187:4444/wd/hub"), ds);
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	  driver.quit();
	  System.out.println("Ending Test6");
  }
  
  
}
