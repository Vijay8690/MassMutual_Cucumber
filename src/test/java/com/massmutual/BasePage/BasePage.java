package com.massmutual.BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.massmutual.CoreUtil.Setup;
import com.massmutual.CoreUtil.Wait;
import com.massmutual.CoreUtil.WebLibrary;

import io.cucumber.java.Before;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;
    protected WebLibrary lib;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
  
        
    }
    
    public WebDriver getDriver()
    {
    	return this.driver;
    }
}
