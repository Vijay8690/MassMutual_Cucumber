package com.massmutual.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.massmutual.BasePage.BasePage;

public class valuespage extends BasePage {

	 public valuespage() 
	 {
	     PageFactory.initElements(driver, this);
	 }
	 
	
	@FindBy (id="lnk_values")
	private WebElement linkvalues;
	
	@FindBy (id="lbl_val_1")
	private WebElement Label1;
	

	@FindBy (id="lbl_val_2")
	private WebElement Label2;
	
	@FindBy (xpath="//span/child(contaisn(id,'txt_val'))")
	private List<WebElement> listTextBox;
	
	@FindBy (xpath="//span/child(contaisn(id,'lbl_val'))")
	private List<WebElement> listLabel;
	
	@FindBy (id="txt_val_1")
	private WebElement Textbox1;

	
	@FindBy (id="txt_val_2")
	private WebElement Textbox2;
	
	@FindBy (id="lbl_ttl_val")
	private WebElement TotalLabel;
	
	@FindBy (id="txt_ttl_val")
	private WebElement TotalTextbox;

	public WebElement getTotalTextbox() {
		return TotalTextbox;
	}
	
	public WebElement getLinkvalues() {
		return linkvalues;
	}
	public List<WebElement> getListTextBox() {
		return listTextBox;
	}
	
	public List<WebElement> getListLabel() {
		return listLabel;
	}

	
	
	

	
	
	

	
	

	
	

	
}
