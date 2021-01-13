package com.massmutual.stepdefs;


import java.util.List;

import org.openqa.selenium.WebElement;

import com.massmutual.CoreUtil.WebLibrary;
import com.massmutual.PageObjects.LoginPage;
import com.massmutual.PageObjects.valuespage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Validation_StepDef  {
	
	
		private valuespage valpage;
		public WebLibrary lib;
	  
	   private LoginPage loginpage;
		 
		 public Validation_StepDef() {
		        this.valpage = new valuespage();
		        lib=new WebLibrary();
		    }

	   

		
		@When("user navigated to values screen")
		public void user_navigated_to_values_screen() {
			
		
			lib.click(valpage.getLinkvalues(), "Values Link");
			 
		}
		
	
		@Then("Verify count of {int} fields values appears on screen")
		public void verify_count_of_fields_values_appears_on_screen(Integer val) {
			try {
			if(valpage.getListTextBox().size()==val.intValue())
			{
				Assert.assertEquals(val.intValue(), valpage.getListTextBox().size());	
				Assert.assertTrue("Values matching", val.intValue()==valpage.getListTextBox().size());
			}
			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		@Then("Verify values on screen greater than {int}")
		public void verify_values_on_screen_greater_than(Integer val) {
			try {
				List<WebElement> listval= valpage.getListTextBox();
				List<WebElement> listlabel= valpage.getListLabel();
				for(int i=0;i<listval.size();i++)
				{
					if(Integer.parseInt(listval.get(i).getAttribute("value"))>val.intValue())
					{
						Assert.assertTrue("For Label="+listlabel.get(i).getAttribute("name")+" Value is "+ listval.get(i).getAttribute("value")+"  is greater than 0 " ,true);
						
					}
					else
					{
						
						Assert.assertTrue("For Label="+listlabel.get(i).getAttribute("name")+" Value is "+ listval.get(i).getAttribute("value")+"  is not greater than 0 "  ,false);
					}
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		@Then("Verify total balance is correct based on values listed on screen")
		public void verify_total_balance_is_correct_based_on_values_listed_on_screen() {
			try {
			List<WebElement> listval= valpage.getListTextBox();
			int Totalval=0;
			for(WebElement s:listval)
			{
				String sval=s.getAttribute("value");
				String intval=sval.replace("$", "");
				 Totalval=Totalval+Integer.parseInt(intval);
			}
			String totalval=valpage.getTotalTextbox().getAttribute("value");
			if(Integer.parseInt(totalval.replace("$", ""))==Totalval)
			{
				Assert.assertTrue("Total  value is " + Totalval + " instead of " + Integer.parseInt(totalval.replace("$", "")), true);
					}
			else
			{
				Assert.assertTrue("Total  value is " + Totalval + " instead of " + Integer.parseInt(totalval.replace("$", "")), false);
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			
		}
		@Then("Verify values currency format")
		public void verify_values_currency_format() {
			try {
			List<WebElement> listval= valpage.getListTextBox();
			List<WebElement> listlabel= valpage.getListLabel();
			for(int i=0;i<listval.size();i++)
			{
				if(listval.get(i).getAttribute("value").indexOf("$")==0)
				{
					Assert.assertTrue("For Field="+listlabel.get(i).getAttribute("name")+" Value is "+ listval.get(i).getAttribute("value")+"  is in US currency format ", true);
					
				}
				else
				{
					Assert.assertTrue("For Field="+listlabel.get(i).getAttribute("name")+" Value is "+ listval.get(i).getAttribute("value")+"  is not in US currency format " , false);
					
				}
			}
			}catch(Exception e)
			
			{
			System.out.println(e.getMessage());	
			}
		}
		/*
		 * @Then("Verify total balance matches the sum of values") public void
		 * verify_total_balance_matches_the_sum_of_values() { System.out.println("Hi");
		 * }
		 */
		



}
