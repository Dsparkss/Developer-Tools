package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {

	
	public static ExtentReports oneDemo() 
	{
		// ExtentReports [responsible to drive all reporting execution] , ExtentSparkReporter [class used for creating Extent Report , spark report used to create html file] 
		String path = System.getProperty("user.dir")+"\\DR\\index.html"; //s.gtprp(user.dir) give us the location of the project file
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName(" Web Automation Result By DInesh ");
		reporter.config().setDocumentTitle(" Dinesh Reports");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Dinesh");
		return extent;
	}

}
