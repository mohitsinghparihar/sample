package com.SeleniumProject.utils;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;




public class Data {
	
	@DataProvider(name="DataForLogin")
	public Object[][] testData(Method m)
	{
		Object testData=null;
		
		if(m.getName().equals("ValidLogin"))
		{
			testData= new Object[][] {
				{"m4474398@gmail.com","Singh@97"}
			};
		}
		
		if(m.getName().equals("InvalidLogin"))
		{
			testData= new Object[][] {
				{"m447439@gmail.com","12345678"}
			};
		}
		return (Object[][]) testData;
		
	}
	
	@DataProvider(name="DataForSearches")
	public Object[][] testDatasearch(Method m)
	{
		Object testDatasearch=null;
		
		if(m.getName().equals("ValidSearch"))
		{
			testDatasearch = new Object[][] {
					{"mobile","++)(*&"}
			};
		}
		if(m.getName().equals("InValidSearch"))
		{
			testDatasearch = new Object[][] {
					{"mobile","++)(*&"}
			};
		}
		
		if(m.getName().equals("addToCart"))
		{
			testDatasearch = new Object[][] {
					{"mobile","++)(*&"}
			};
		}	
		
		return (Object[][]) testDatasearch;
	}
	
	
}
	