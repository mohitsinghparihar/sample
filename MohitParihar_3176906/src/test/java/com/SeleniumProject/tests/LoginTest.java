package com.SeleniumProject.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumProject.pages.LoginPage;
import com.SeleniumProject.utils.Data;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends BaseTest{
	

	//@Test(dataProvider="DataForLogin",dataProviderClass=Data.class)
	public void ValidLogin(String Email , String Pass)
	{
    	extentTest=extent.startTest("Verifying the ValidLogin");
    	LoginPage login=new LoginPage(driver);
    	login.clickAccounlistTab();
    	login.enterEmail(Email);                 
    	login.clickContinue();
    	login.enterPassword(Pass);                 
    	login.clickSignin();           // SOMTIMES AFTER CLICKING SIGNIN BUTTON IT GOES TO A PAGE 
    	                               // WHERE IT ASK FOR ENTERING CAPTCHA DUE TO MULTIPLE LOGIN SO IN THAT CASE 
    	                               // IT NOT GOES TO HOMEPAGE SO THIS IS THE CASE WHERE TESTCASE FAILED
    	                               // BUT SOMETIME IT NOT ASK FOR CAPTCHA AND DIRECTLY LOGIN TO ACCOUNT AND TEST CASE 
    	                               // PASSED
    	Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    	extentTest.log(LogStatus.PASS,"Login is successfull");
   		extent.endTest(extentTest);
  
 
	}
	
	//@Test(dataProvider="DataForLogin",dataProviderClass=Data.class)
	
	public void InvalidLogin(String email, String pass)
	{
		extentTest=extent.startTest("Verifying the InValid Login");
	    LoginPage login=new LoginPage(driver);
	    login.clickAccounlistTab();
	    login.enterEmail(email);                 
	    login.clickContinue();
	    Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    	extentTest.log(LogStatus.PASS,"Login is successfull");
   		extent.endTest(extentTest);
  
	}
	
   

}
