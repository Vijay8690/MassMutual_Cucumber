package com.massmutual.CoreUtil;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.massmutual.BasePage.BasePage;



public class WebLibrary extends BasePage

{

	 private WebDriver driver;
	 
	 public WebLibrary(){
		 
	  Wait wait=new Wait(driver);
	  
	 }

		/* Description:Click method used to click on element
		 * Parameter :weblement and string message
		 *  */
	public void click(WebElement element,String msg)
	{
		try {
			wait.forLoading(3);
			if(element.isDisplayed())
			{
			element.click();
			Assert.assertTrue("Able to click on"+msg +" successfully", true);
			}
			else
			{
				Assert.assertTrue("Unable to click on"+msg +" element", false);
			}
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	/* Description:enter method used to enter text
	 * Parameter :weblement ,data and string message
	 *  */
	public void enter(WebElement element,String data,String msg)
	{
		try {
			wait.forLoading(3);
			if(element.isDisplayed())
			{
			element.sendKeys(data);
			Assert.assertTrue("Able to update "+msg +" field successfully", true);
			}
			else
			{
				Assert.assertTrue("Unable to update "+msg +" successfully", false);
			}
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
