package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Bhavesh Shah
 */

@RunWith(Cucumber.class)
@CucumberOptions (
        //specify the path of the feature file which you need to run using this runner class.
        features = {"src/test/resources/Features/MyFirstCucumberFeatureFile.feature"},

        //specify the path to your step definitions package where the selenium code will be found for the scenario test statements.
        glue = {"stepDefinitions"},

        //If set true, will display console output in much more readable format.
        monochrome = true,

        //If set true, it means that Cucumber will only checks that every Step mentioned in the Feature File have corresponding code
        // written in Step Definition file. If set false, Cucumber will actually execute the code.
        dryRun = false
)

public class MyFirstCucumberTestRunner {
}
