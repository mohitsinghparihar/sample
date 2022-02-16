package com.SeleniumProject.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumProject.pages.AddToCartPage;
import com.SeleniumProject.pages.SearchPage;
import com.SeleniumProject.utils.Data;
import com.relevantcodes.extentreports.LogStatus;

public class AddToCartTest extends BaseTest {
	
	@Test(dataProvider="DataForSearches",dataProviderClass=Data.class)
	public void addToCart(String valid, String invalid)
	{
		extentTest=extent.startTest("Verifying the AddToCart feature");
		SearchPage search= new SearchPage(driver);
		search.searchSomething(valid);  //valid==mobile in that case
		search.submit();
		AddToCartPage add= new AddToCartPage(driver);
		add.clickOnProduct();
		String currentHandle= driver.getWindowHandle();
		Set<String> handleSet= driver.getWindowHandles();
		for(String handle: handleSet)
		{
			 if(!handle.equalsIgnoreCase(currentHandle)) 
			 {
				 driver.switchTo().window(handle);
			 }
		}
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		add.clickToaddToCart();
		Assert.assertEquals(driver.getTitle(),"Amazon.in Shopping Cart");
		extentTest.log(LogStatus.PASS,"Product is added to cart successfully");
   		extent.endTest(extentTest);
		
				
	}
	

}
