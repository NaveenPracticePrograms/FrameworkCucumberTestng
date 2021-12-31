package com.coding.Runner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "target/rerun.txt", 
				glue = "com.coding.StepDefinitions",		
				monochrome = true, plugin = {
						"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-reports/cucumber.json",
						"junit:target/cucumber-reports/cucumber.xml",
						"rerun:target/rerun.txt"
						})

public class FailedScenarios extends AbstractTestNGCucumberTests{

}
