package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDef {
    public static WebDriver driver;

    @Given("^I open the Chrome browser and launch the google url$")
    public void i_open_the_Chrome_browser_and_launch_the_google_url() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium server standalone\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }

    @And("^I enter some text in search box$")
    public void i_enter_some_text_in_search_box() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Bhavesh Shah");
        Thread.sleep(2000);
    }

    @When("^I hit return key$")
    public void i_hit_return_key() throws Throwable {
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
    }

    @Then("^google should display search results$")
    public void google_should_display_search_results() throws Exception {
        Boolean actualValue = driver.getTitle().contains("Google Search");
        Assert.assertTrue("webPageTitleAssertion", actualValue);
        System.out.println("Page title is: "+driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}