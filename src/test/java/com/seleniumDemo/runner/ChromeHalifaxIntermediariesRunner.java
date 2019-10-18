/**
 * 
 */
package com.seleniumDemo.runner;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;

/**
 * @author bhaveshs
 *
 */

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
	        jsonReport = "target/cucumber/ChromeHalifaxIntermediaries/reportJSON.json",
	        retryCount = 3,
	        detailedReport = true,
	        detailedAggregatedReport = true,
	        overviewReport = true,
	        featureOverviewChart = true,
	        overviewChartsReport = true,
	        coverageReport = true,
	        jsonUsageReport = "target/cucumber/ChromeHalifaxIntermediaries/cucumber-usage.json",
	        usageReport = true,
	        toPDF = true,
	        pdfPageSize = "A4 landscape",
	        outputFolder = "target/cucumber/ChromeHalifaxIntermediaries/ExtendedCucumber"
)
@CucumberOptions(
		features = "src/test/resources/Features/ChromeHalifaxIntermediaries.feature",
		glue = "com.seleniumDemo.stepDefinitions",
	        plugin = {
	                "json:target/cucumber/ChromeHalifaxIntermediaries/reportJSON.json",
	                "pretty:target/cucumber/ChromeHalifaxIntermediaries/cucumber-pretty.txt",
	                "usage:target/cucumber/ChromeHalifaxIntermediaries/cucumber-usage.json",
	                "html:target/cucumber/ChromeHalifaxIntermediaries/reportHTML.html",
	                "rerun:target/cucumber/ChromeHalifaxIntermediaries/FailedScenarios/rerun.txt"
	         },
	        monochrome = true,
	        dryRun = false,
	        tags = {"@chromeBrowser"}
	        )

public class ChromeHalifaxIntermediariesRunner {
}