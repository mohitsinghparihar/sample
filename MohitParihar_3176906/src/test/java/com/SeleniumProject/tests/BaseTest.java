package com.SeleniumProject.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.SeleniumProject.utils.Screenshots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BaseTest{
	static WebDriver driver;
	static File file=new File("./Resources/config.properties");
	static FileInputStream fis=null;
	static Properties prop= new Properties();
	public static ExtentTest extentTest;
	public static ExtentReports extent;
   
	{
		try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@BeforeSuite
	public static void setExtent()
	{
		extent =new ExtentReports("./Reports/ExtentReport.html");
	}
	
	@AfterSuite
	public void endReport()
	{
		extent.flush();
		extent.close();
	}
	
	
	@BeforeMethod
	@Parameters("Browsers")
	public void chooseDriver(String browserName)
     {
	          if(browserName.equalsIgnoreCase("Chrome")){
	        	  
	 			 System.setProperty(prop.getProperty("chromeDriverProperty"),prop.getProperty("chromeDriverPath")); 
	 			 ChromeOptions option= new ChromeOptions();
	 			 option.setHeadless(true);
	 		     driver=new ChromeDriver(option);
	          }
	          
	          else if(browserName.equalsIgnoreCase("Edge")) {
	        	  
		 			 System.setProperty(prop.getProperty("edgeDriverProperty"),prop.getProperty("edgeDriverPath"));
		 		     driver=new EdgeDriver();
		 		    
	          }
	          
	          else if(browserName.equalsIgnoreCase("FireFox")) {

		 			 System.setProperty(prop.getProperty("fireFoxDriverProperty"),prop.getProperty("fireFoxDriverPath"));
		 		     driver=new FirefoxDriver();
	          }    
	          driver.manage().window().maximize();
	          driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		      driver.get(prop.getProperty("URL"));
	        	  
	 }
	@AfterMethod
	@Parameters("Browsers")
	public void attachScreenshot(ITestResult result,String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome") || browserName.equalsIgnoreCase("Edge") || browserName.equalsIgnoreCase("FireFox")) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshotPath=Screenshots.captureScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath),"Invalid credentials");
			extent.endTest(extentTest);
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			extentTest.log(LogStatus.PASS,"Test Case Passed");
		}
	  }	
		driver.quit();
	}
	
	
	
}