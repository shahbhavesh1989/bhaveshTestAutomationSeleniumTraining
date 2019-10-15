package com.seleniumDemo.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Bhavesh Shah
 */

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/Features/MyTestScenario4.feature",
		glue = "com.seleniumDemo.stepDefinitions",
		monochrome = true,
		dryRun = false 
		//tags = {}
		)

public class TestRunner4 {

}
