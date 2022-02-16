package com.SeleniumProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
    @FindBy(how = How.ID,using="nav-link-accountList-nav-line-1")
    WebElement accountListtab;
    
    @FindBy(how=How.NAME,using="email")
    WebElement emailEnter;
    
    @FindBy(how=How.ID,using="continue")
    WebElement continueButton;
    
    @FindBy(how=How.ID,using="ap_password")
    WebElement passwordEnter;
    
    @FindBy(how=How.ID,using="signInSubmit")
    WebElement signInbutton;
    
    
  public void clickAccounlistTab()
  {
	  accountListtab.click();
  }
  
  public void enterEmail(String email)
  {
	  emailEnter.sendKeys(email);
  }
  
  public void clickContinue()
  {
	  continueButton.click();
  }
  public void enterPassword(String Pass)
  {
	  passwordEnter.sendKeys(Pass);
  }
  
  public void clickSignin()
  {
	  signInbutton.click();
  }
    
 
    
  

}
