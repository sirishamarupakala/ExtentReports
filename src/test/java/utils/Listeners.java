package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import testcases.Testmodule2;

public class Listeners extends Testmodule2 implements ITestListener{

	ExtentReports er;
	public void onTestStart(ITestResult result) {
		System.out.println("test starts");
		if(er==null)
		{
		er= ExtentReportsConfig.getReportsConfig();
		}
		er.createTest(result.getMethod().getMethodName());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getMethod().getMethodName());
		
		
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String destpath=System.getProperty("user.dir")+"//FailedScreenshot//"+result.getMethod().getMethodName()+".png";
		File dest =new File(destpath);
		//File dest= new File("C:\\Users\\siris\\Downloads\\failedtest.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
		er.flush();	
		}

	
	
	
}
