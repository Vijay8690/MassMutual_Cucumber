package com.massmutual.stepdefs;




import java.sql.Driver;

import org.openqa.selenium.support.ui.ExpectedCondition;

import com.massmutual.CoreUtil.WebLibrary;
import com.massmutual.PageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background_StepDef  {
	
	 public LoginPage loginpage;
	 public WebLibrary lib;
	
	 
	 public Background_StepDef() {
	        this.loginpage = new LoginPage();
	         lib=new WebLibrary();
	       
	    }

	
	@Given("user naviagte to Exercise app")
	public void user_naviagte_to_exercise_app() {
	
	
		this.loginpage.navigateTo();
	
	}


	@When("user enters userid and password")
	public void user_enters_userid_and_password() {
		
		
		loginpage.Login("abc","xyz");
		
	}
	@When("user click on login button")
	public void user_click_on_login_button() {

	
		lib.click(loginpage.getBtnLogin(),"Login Button");
		
		
	}
	@Then("user navigated to dashboard screen")
	public void user_navigated_to_dashboard_screen() {
		
		loginpage.getHomepage_Header().isDisplayed();
		
		
	}

}
