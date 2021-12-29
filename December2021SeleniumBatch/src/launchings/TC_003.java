package launchings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		//selectOption("amazondropdown_id","Books");
		
		//typeText("amazontextbox_name","Harry Potter");
		
		//clickElement("amazonsearchbutton_xpath");
		
		//driver.findElement(By.linkText("Customer Service")).click();
		
		//driver.findElement(By.partialLinkText("Customer Ser")).click();
		
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			if(!elements.get(i).getText().isEmpty())
			System.out.println(elements.get(i).getText());
		}
		
		
		  //WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		  //loc.sendKeys("Books");
		  
		  //driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		  
		  //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	}

}
