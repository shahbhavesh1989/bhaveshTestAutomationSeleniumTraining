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
	        jsonReport = "target/cucumber/IEHalifaxIntermediaries/reportJSON.json",
	        retryCount = 3,
	        detailedReport = true,
	        detailedAggregatedReport = true,
	        overviewReport = true,
	        featureOverviewChart = true,
	        overviewChartsReport = true,
	        coverageReport = true,
	        jsonUsageReport = "target/cucumber/IEHalifaxIntermediaries/cucumber-usage.json",
	        usageReport = true,
	        toPDF = true,
	        pdfPageSize = "A4 landscape",
	        outputFolder = "target/cucumber/IEHalifaxIntermediaries/ExtendedCucumber"
)
@CucumberOptions(
		features = "src/test/resources/Features/IEHalifaxIntermediaries.feature",
		glue = "com.seleniumDemo.stepDefinitions",
	        plugin = {
	                "json:target/cucumber/IEHalifaxIntermediaries/reportJSON.json",
	                "pretty:target/cucumber/IEHalifaxIntermediaries/cucumber-pretty.txt",
	                "usage:target/cucumber/IEHalifaxIntermediaries/cucumber-usage.json",
	                "html:target/cucumber/IEHalifaxIntermediaries/reportHTML.html",
	                "rerun:target/cucumber/IEHalifaxIntermediaries/FailedScenarios/rerun.txt"
	         },
	        monochrome = true,
	        dryRun = false,
	        tags = {"@ieBrowser"}
	        )

public class IEHalifaxIntermediariesRunner {
}