package com.seleniumDemo.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Bhavesh Shah
 */

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "@target/cucumber-reports/rerun.txt",
		glue = "com.seleniumDemo.stepDefinitions",
		plugin = {
						"json:target/cucumber-reports/report.json",
						"html:target/cucumber-reports/report.html",
						"pretty:target/cucumber-reports/report.txt",
						"rerun:target/cucumber-reports/rerun.txt",
		},
		monochrome = true,
		dryRun = false
		//tags = {}
		)

public class FailedScenarioRunner {

}
