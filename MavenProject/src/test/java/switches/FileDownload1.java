package switches;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload1 
{

	public static void main(String[] args) throws Exception 
	{
		String fileType = "DOC, DOCX";
		
		//For Chrome Browser
		/*WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("user-data-dir=C:\\Users\\ravi\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 5");
		HashMap<String, Object> pref = new HashMap<String, Object>();
		pref.put("plugins.always_open_pdf_enternally", true);
		pref.put("download.default_directory", "C:\\Users\\ravi\\Videos\\");
		
		option.setExperimentalOption("prefs", pref);
		WebDriver driver = new ChromeDriver(option);*/
		
		
		//For Edge Browser
		/*WebDriverManager.edgedriver().setup();
		EdgeOptions option  = new EdgeOptions();
		HashMap<String, Object> pref = new HashMap<String, Object>();
		pref.put("plugins.always_open_pdf_enternally", true);
		option.setExperimentalOption("prefs", pref);
		
		WebDriver driver = new EdgeDriver(option);*/
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("browser.download.dir", "C:\\Users\\ravi\\Videos\\");
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
				
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='"+fileType+"']/following-sibling::td[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample')]")).click();

	}

}
