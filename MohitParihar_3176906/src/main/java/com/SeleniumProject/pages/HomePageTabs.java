package com.SeleniumProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageTabs {
	
	WebDriver driver;
	
	public HomePageTabs(WebDriver driver)
	{

		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Mobiles")
	WebElement mobile;   // As I am checking mobile tab whether it is working or not
	
	@FindBy(how=How.CLASS_NAME,using="icp-nav-link-inner")
	WebElement element;
	
	public void MouseHover()
	{
		Actions mousehover= new Actions(driver);
		mousehover.moveToElement(element).perform();
	}
	
	public void clicktab()
	{
		mobile.click();
	}

}
