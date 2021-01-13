package com.massmutual.Runner;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Features/scenerio.feature",
		glue = {"com.massmutual.stepdefs","com.massmutual.CoreUtil"},
		plugin = {"pretty","html:target/HtmlReports"},
		monochrome = true
)

public class Runner {
}
