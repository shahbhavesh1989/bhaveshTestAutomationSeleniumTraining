package com.seleniumDemo.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Bhavesh Shah
 */

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/Features",
		glue = "com.seleniumDemo.stepDefinitions",
		plugin = {
				"json:target/cucumber-reports/json-report.json",
				"html:target/cucumber-reports/html-report.html",
				"pretty:target/cucumber-reports/pretty-report.txt",
				"rerun:target/cucumber-reports/rerun.txt",
				"usage:target/cucumber-reports/usage-report.json"
				},
		monochrome = true,
		dryRun = false
		//tags = {}
		)

public class TestRunner {

}
