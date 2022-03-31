package reportings;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testcases.BaseTest;

public class ExtentManager extends BaseTest
{
	static ExtentHtmlReporter htmlReport;
	static ExtentReports report;
	
	public static ExtentReports getReports()
	{
		Date dt = new Date();
		String htmlFileName = dt.toString().replace(':', '_').replace(' ', '_');
		if(htmlReport == null)
		{
			htmlReport = new ExtentHtmlReporter(projectPath+"\\src\\test\\resources\\reports\\"+htmlFileName+".html");
			htmlReport.config().setDocumentTitle("Automation Report");
			htmlReport.config().setReportName("Functional Testing Report");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			report = new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("OS", "Windows");
			report.setSystemInfo("TesterName", "Ravikanthlella");
		}
		
		return report;
	}
}
