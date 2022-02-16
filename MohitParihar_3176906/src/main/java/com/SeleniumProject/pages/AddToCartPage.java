package com.SeleniumProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
     WebDriver driver;

	
	public AddToCartPage(WebDriver driver)
	{

		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'OPPO A74 5G (Fantastic Purple,6GB RAM,128GB Storag')]")
	WebElement product;
	
	@FindBy(how=How.ID,using="add-to-cart-button")
	WebElement cartButton;
	
	@FindBy(how=How.ID,using="hlb-view-cart-announce")
	WebElement cart;
	
	@FindBy(how=How.ID,using="a-color-link")
	WebElement delete;
	public void clickOnProduct()
	{
		product.click();
	}
	
	public void clickToaddToCart()
	{
		cartButton.click();
	}
	
	public void clicktocart()
	{
		cart.click();
	}
	
	public void deletefromCart()
	{
		delete.click();
	}

}
