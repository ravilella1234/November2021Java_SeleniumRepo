package switches;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload1 
{

	public static void main(String[] args) 
	{
		String fileType = "DOC, DOCX";
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		HashMap<String, Object> pref = new HashMap<String, Object>();
		pref.put("plugins.always_open_pdf_enternally", true);
		//pref.put("download.default_directory", "C:\\Users\\ravi\\Videos\\");
		
		option.setExperimentalOption("prefs", pref);
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		driver.switchTo().frame(driver.findElement(By.name("google_esf")));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Close']")))).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//td[text()='DOC, DOCX']/following-sibling::td[2]/a")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample')]")).click();

	}

}
