package com.seleniumDemo.runner;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

/**
 * @author Bhavesh Shah
 */

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "target/cucumber-reports/report.json",

		/*
		retryCount if specified will initialize number of retry whenever failure occurs.
		Specifies maximal number of retries.
		*/
		retryCount = 3,
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		coverageReport = true,
		jsonUsageReport = "target/cucumber-reports/report-usage.json",
		usageReport = true,
		featureOverviewChart = true,
		toPDF = true,
		pdfPageSize = "A4 landscape",
		outputFolder = "Reports/cucumber-extended"
)
@CucumberOptions (
		features = "src/test/resources/Features/MyTestScenario3.feature",
		glue = "com.seleniumDemo.stepDefinitions",
		plugin = {
				"json:target/cucumber-reports/report.json",
				"html:target/cucumber-reports/report.html",
				"pretty:target/cucumber-reports/report-pretty.txt",
				"rerun:target/cucumber-reports/rerun.txt",
				"usage:target/cucumber-reports/report-usage.json",
		},
		monochrome = true,
		dryRun = false
)

public class TestRunner3 {

}