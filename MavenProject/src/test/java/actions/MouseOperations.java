package actions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class MouseOperations 
{
	WebDriver driver;
	Actions a;
	
  @BeforeMethod
  public void beforeMethod()
  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }
	
  @Test(enabled = false)
  public void moveToElement() 
  {
	  driver.get("https://www.snapdeal.com/");
	  
	  a  = new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).perform();
	  driver.findElement(By.xpath("//a[contains(text(),'Your Orders')]")).click();
  }
  
  
  @Test(enabled = false)
  public void dragDrop()
  {
	  driver.get("https://jqueryui.com/droppable/");
	  
	  a = new Actions(driver);
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  
	  WebElement drag = driver.findElement(By.id("draggable"));
	  WebElement drop = driver.findElement(By.id("droppable"));
	  
	  //a.dragAndDrop(drag, drop).perform();
	  a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
  }
  
  
  @Test(enabled = false)
  public void slider()
  {
	  driver.get("https://jqueryui.com/slider/");
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  
	  WebElement drag = driver.findElement(By.className("ui-slider-handle"));
	  a = new Actions(driver);
	  a.dragAndDropBy(drag, 100, 0).perform();
  }
  
  
  @Test(enabled = false)
  public void rightClick()
  {
	  driver.get("https://jqueryui.com/slider/");
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  
	  WebElement drag = driver.findElement(By.className("ui-slider-handle"));
	  a = new Actions(driver);
	  a.contextClick(drag).perform();
  }
  
  
  
  @Test(enabled = false)
  public void browserSlider() throws Exception
  {
	  driver.get("https://www.amazon.in");
	  for(int i=0;i<10;i++)
	  {
		  ((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100)"); 
		  Thread.sleep(3000);
	  }
	  
  }
  
  @Test
  public void autosuggetion()
  {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Hadoop tutorial");
	  String val = driver.findElement(By.name("q")).getAttribute("value");
	  
	  List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/span"));
	  for(int i=0;i<list.size();i++)
	  {
		  if(list.get(i).getText().equalsIgnoreCase(val))
		  {
			  list.get(i).click();
			  return;
		  }
		  list = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/span"));
	  }
  }

}
