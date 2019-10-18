/**
 * 
 */
package com.seleniumDemo.stepDefinitions;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

/**
 * @author bhaveshs
 *
 */

public class HalifaxIntermediariesStepDefs {

	WebDriver driver;
    WebDriverWait wait;
    final String memoWord = "memorable123456";
    final String USERNAME = "";
    final String AUTOMATE_KEY = "";
    final String path = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Given("^I open the chrome browser$")
    public void i_open_the_chrome_browser() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "77.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1366x768");
        caps.setCapability("browserstack.debug", true);
        caps.setCapability("name", "Bstack-[Java] CucumberParallelTest");
        driver = new RemoteWebDriver(new URL(path), caps);
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 15);
    }

    @Given("^I open the IE browser$")
    public void i_open_the_IE_browser() throws Throwable {
    	DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1366x768");
        caps.setCapability("browserstack.debug", true);
        caps.setCapability("name", "Bstack-[Java] CucumberParallelTest");
        driver = new RemoteWebDriver(new URL(path), caps);
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 15);
    }

    @Given("^I enter halifax intermediaries url$")
    public void i_enter_halifax_intermediaries_url() {
        driver.get("https://www.halifax-intermediariesonline.co.uk/IntermediariesOnline/Login/Public/Login.aspx");
    }

    @Given("^I navigate to home page of halifax intermediaries$")
    public void i_navigate_to_home_page_of_halifax_intermediaries() {
        String expectedTitle = "Intermediaries - Sign In Page";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Validate title", expectedTitle, actualTitle);
        System.out.println("Title validated successfully");
    }

    @Given("^I enter invalid credentials$")
    public void i_enter_invalid_credentials() throws Exception {
        driver.findElement(By.id("ctl00_MainContentPage_login__userName_TextBox")).sendKeys("ABCD123456");
        driver.findElement(By.id("ctl00_MainContentPage_login__password_TextBox")).sendKeys("Password1");
        driver.findElement(By.id("ctl00_MainContentPage_login__loginButton")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContentPage__memorablePhrase__characterDropDown1_DropDownList")));

        By char1 = By.id("ctl00_MainContentPage__memorablePhrase__characterDropDown1__LabelID");
        By char2 = By.id("ctl00_MainContentPage__memorablePhrase__characterDropDown2__LabelID");
        By char3 = By.id("ctl00_MainContentPage__memorablePhrase__characterDropDown3__LabelID");

        int num1 = getNumber(driver.findElement(char1).getText().trim());
        int num2 = getNumber(driver.findElement(char2).getText().trim());
        int num3 = getNumber(driver.findElement(char3).getText().trim());

        Select dropdown1 = new Select (driver.findElement(By.id("ctl00_MainContentPage__memorablePhrase__characterDropDown1_DropDownList")));
        Select dropdown2 = new Select (driver.findElement(By.id("ctl00_MainContentPage__memorablePhrase__characterDropDown2_DropDownList")));
        Select dropdown3 = new Select (driver.findElement(By.id("ctl00_MainContentPage__memorablePhrase__characterDropDown3_DropDownList")));

        dropdown1.selectByVisibleText(memoWord.substring(num1-1, num1));
        dropdown2.selectByVisibleText(memoWord.substring(num2-1, num2));
        dropdown3.selectByVisibleText(memoWord.substring(num3-1, num3));
    }

    @When("^I click submit button$")
    public void i_click_submit_button() throws Throwable {
        driver.findElement(By.id("ctl00_MainContentPage__submitButton")).click();
    }

    @Then("^I get error message displayed$")
    public void i_get_error_message_displayed() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContentPage_login__userName_TextBox")));
        String expectedTitle = "Intermediaries - Sign In Page";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Validate title", expectedTitle, actualTitle);
        boolean actualValue = driver.getPageSource().contains("The details you have entered are not valid. Please try again.");
        Assert.assertTrue("Validate error message", actualValue);
        System.out.println("Error message validated successfully");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static int getNumber(String label) {
        return Integer.valueOf(label.split(" ")[1]);
    }
}
