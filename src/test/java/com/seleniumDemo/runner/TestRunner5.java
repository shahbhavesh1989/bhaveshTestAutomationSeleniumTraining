package com.seleniumDemo.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author bhaveshs
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions (
		features =	"src/test/resources/Features/MyTestScenario5.feature",
		glue = "com.seleniumDemo.stepDefinitions",
		plugin = {
			"json:target/cucumber-reports/report.json",
			"html:target/cucumber-reports/report.html",
			"pretty:target/cucumber-reports/report-pretty.txt",
			"rerun:target/cucumber-reports/rerun.txt",
			"usage:target/cucumber-reports/report-usage.json",
		},
		monochrome = true,
		dryRun = false,
		tags = {"@First, @Second"}
		)

public class TestRunner5 {
	
}

// NOT: tags = {"~@SmokeTest"} - this will skip all the scenarios that have @SmokeTest tags and will run other scenarios from the feature file.
// ORed: tags = {"@SmokeTest, @RegressionTest"} - this will run those scenarios which have either @SmokeTest tag OR @RegressionTest tag in the feature file associated with them.
// ANDed: tags = {"@SmokeTest", "@RegressionTest"} - this will run those scenarios that have both @SmokeTest tag AND @RegressionTest tag in the feature file associated with them.