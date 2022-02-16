package com.SeleniumProject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumProject.pages.SearchPage;
import com.SeleniumProject.utils.Data;
import com.relevantcodes.extentreports.LogStatus;

public class SearchTest extends BaseTest {
	
	//@Test(dataProvider="DataForSearches",dataProviderClass=Data.class)
	
	public void ValidSearch(String validEntry, String invalidEntry) 
	{
		extentTest=extent.startTest("Verifying the Valid Search");
		SearchPage search=new SearchPage(driver);
		search.searchSomething(validEntry);
		search.submit();
		Assert.assertEquals(driver.getTitle(),"Amazon.in : mobile");  // for valid search i use mobile 
    	extentTest.log(LogStatus.PASS,"Search is successfull");
   		extent.endTest(extentTest);
	}
	
   //@Test(dataProvider="DataForSearches",dataProviderClass=Data.class)
	
	public void InValidSearch(String validEntry, String invalidEntry) 
	{
		extentTest=extent.startTest("Verifying the InValid Search");
		SearchPage search=new SearchPage(driver);
		search.searchSomething(invalidEntry);
		search.submit();
		Assert.assertEquals(driver.getTitle(),"Amazon.in : mobile");  
    	extentTest.log(LogStatus.PASS,"Search is successfull");
   		extent.endTest(extentTest);
	}
	

}
