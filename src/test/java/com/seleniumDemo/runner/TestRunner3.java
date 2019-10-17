package com.seleniumDemo.runner;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions (
		jsonReport = "target/cucumber-reports/report.json",
        retryCount = 3, // Defines the number of time failed tests should re-run until it gets pass
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "target/cucumber-reports/report-usage.json",
        usageReport = true,
        featureOverviewChart = true,
        toPDF = true,
       	pdfPageSize = "A4 landscape",
        //excludeCoverageTags = {"@flaky" } - Used to define which tags are to be excluded from coverage report.
        //includeCoverageTags = {"@passed" } - Used to define which tags are to be included in coverage report.
        outputFolder = "target/cucumber-extended"
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
		//tags = {}
		)

public class TestRunner3 {

}