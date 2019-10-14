package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Bhavesh Shah
 */

public class cucumberStepDefs {

    WebDriver driver;

    @Given("^I open chrome browser$")
    public void i_open_chrome_browser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^I navigate to google url$")
    public void i_navigate_to_google_url() throws Throwable {
        driver.get("https://www.google.co.in");
    }

    @Given("^I enter text to search and hit enter$")
    public void i_enter_text_to_search_and_hit_enter() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("^I should see google search page$")
    public void i_should_see_google_search_page() throws Throwable {
        String expectedPage = " - Google Search";
        if(driver.getTitle().contains(expectedPage)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
        driver.quit();
    }
}
