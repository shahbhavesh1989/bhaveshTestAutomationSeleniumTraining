package com.seleniumDemo.stepDefinitions;

import cucumber.api.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumDemo.Pages.GoogleSignUpPageObjects;
import cucumber.api.java.en.*;
import utilities.screenCapture;

/**
 * @author Bhavesh Shah
 */

public class stepDefs {
	
	WebDriver driver;
	GoogleSignUpPageObjects pg ;

/*
WebDriverManager class helps to remove the pre-requisite step (i.e.) System.setProperty where we specify the path to
respective browser drivers executable files.
*/

	@Given("^I launch chrome browser$")
	public void i_launch_chrome_browser() throws Throwable {
	//	System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
		WebDriverManager.chromedriver().arch32().setup();
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
	
		@Given("^I open chrome browser$")
		public void i_open_chrome_browser() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium server standalone\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		@Given("^I enter Google URL$")
		public void i_enter_Google_URL() throws Throwable {
			driver.get("https://www.google.co.in");
		}

		@Given("^I search virtusa$")
		public void i_search_virtusa() throws Throwable {
			driver.findElement(By.name("q")).sendKeys("Virtusa");
		}

		@When("^I click enter$")
		public void i_click_enter() throws Throwable {
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}

		@Then("^I should get search result page$")
		public void i_should_get_search_result_page() throws Throwable {
			System.out.println(driver.getTitle());
		}
		
		@Given("^I search \"([^\"]*)\"$")
		public void i_search(String arg1) throws Exception {
			driver.findElement(By.name("q")).sendKeys(arg1);
			Thread.sleep(3000);
			screenCapture.takeScreenshot(driver);
			Thread.sleep(1000);
		}
		
		@Given("^I navigate to google account signup page$")
		public void i_navigate_to_google_account_signup_page(){
			System.setProperty("webdriver.chrome.driver", "C:\\selenium server standalone\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://accounts.google.com/signup");
			pg = new GoogleSignUpPageObjects(driver);
			pg.FirstName.sendKeys("seleniumUserFirstName");
			pg.LastName.sendKeys("seleniumUserLastName");
		}

		@After
		public void tearDown() {
			if (driver !=null) {
				driver.quit();
			}
		}
}