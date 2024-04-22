package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsConfig {

	
	
	public static ExtentReports getReportsConfig()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index3.html";
		
		ExtentSparkReporter esr= new ExtentSparkReporter(path);
		esr.config().setReportName("Automation report");
		
		ExtentReports er= new ExtentReports();
		er.attachReporter(esr);;
		return er;
		
	}
}
