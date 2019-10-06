package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="Features",
        glue={"stepDefinition"},
        plugin = {
                "json:target/cucumber/reportJSON.json",
                "html:target/cucumber/reportHTML.html",
                "pretty"},
        monochrome = false,
        dryRun = false,
        tags = {"~@Smoke, ~@Regression", "~@GoogleSearch"}
)

public class TestRunner {
}
