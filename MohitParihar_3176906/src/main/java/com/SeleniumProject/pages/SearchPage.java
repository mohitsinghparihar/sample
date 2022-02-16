package com.SeleniumProject.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(how=How.ID,using="nav-search-submit-button")
	WebElement submitButton;
	
	public void searchSomething(String something)
	{
		searchBox.sendKeys(something);
	}
	
	public void submit()
	{
		submitButton.click();
	}
	
	
}
