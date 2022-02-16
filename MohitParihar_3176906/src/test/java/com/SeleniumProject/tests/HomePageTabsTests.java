package com.SeleniumProject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumProject.pages.HomePageTabs;
import com.relevantcodes.extentreports.LogStatus;

public class HomePageTabsTests extends BaseTest{
	//@Test
	public void tabstest()
	{
		extentTest=extent.startTest("Verifying the Mobile Tab");
		HomePageTabs tab = new HomePageTabs(driver);
		tab.clicktab();
		Assert.assertEquals(driver.getTitle(),"Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in");
		extentTest.log(LogStatus.PASS,"TabTest is successfull as it goes to specific page of specific tab");
   		extent.endTest(extentTest);
	}

	//@Test
	public void testMousehover()
	{
		 extentTest=extent.startTest("Verifying the MouseHover");
		 HomePageTabs tab= new HomePageTabs(driver);
		 tab.MouseHover();
		 Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	   	 extentTest.log(LogStatus.PASS,"TabTest is successfull as it goes to specific page of specific tab");
	     extent.endTest(extentTest);
		
	}

}
