package com.massmutual.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.massmutual.BasePage.BasePage;
import com.massmutual.CoreUtil.WebLibrary;

public class LoginPage extends BasePage {
	
	
	public WebLibrary lib;
	 public LoginPage() 
	 {
	     PageFactory.initElements(driver, this);
	      lib=new WebLibrary();
	     
	 }
	 
	   public void navigateTo()
			{
				driver.get("https://www.exercise1.com");
				wait.forLoading(5);
			}
	
	
	@FindBy (id="userid")
	private WebElement txtuserId;
	
	
	@FindBy (id="password")
	private WebElement txtuserPassword;
	
	
	@FindBy (id="lebHomeScreen")
	private WebElement homepage_Header;
	
	@FindBy (id="btnLogin")
	private WebElement btnLogin;
	
	public WebElement getTxtuserId() {
		return txtuserId;
	}

	public WebElement getTxtuserPassword() {
		return txtuserPassword;
	}

	public WebElement getHomepage_Header() {
		return homepage_Header;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

	  public void Login(String userName, String password) 
	  {
	  lib.enter(getTxtuserId(), "abc", "UserID");
	lib.enter(getTxtuserPassword(), "xyz", "Password");
	  
	  }
	  
	  public void ClickLogin() 
	  { getBtnLogin().click(); 
	  }
	  
	 

	
}
