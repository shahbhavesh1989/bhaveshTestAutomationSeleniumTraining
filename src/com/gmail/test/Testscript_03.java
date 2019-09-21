package com.gmail.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.URL;

public class Testscript_03 {

    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeTest
    public void setupBrowser(String browserName) {
        System.out.println("Starting on local - " + browserName + "browser");
        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\selenium server standalone\\chromedriver.exe");
                driver = new ChromeDriver();
                System.out.println("Driver handle created on local for Chrome browser");
                break;

            case "ie":
                System.setProperty("webdriver.ie.driver", "C:\\selenium server standalone\\IEDriverServerWin32.exe");
                driver = new InternetExplorerDriver();
                System.out.println("Driver handle created on local for IE browser");
                break;

            default:
                System.out.println("Please provide correct browser name to start on local.");
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


    @Test
    public static void Testscript_03() throws Exception {
        driver.get("https://accounts.google.com/signup");
        String str = driver.getTitle();
        System.out.println("Webpage title is: "+str);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("firstName")));
        driver.findElement(By.name("firstName")).sendKeys("seleniumDemo");
        driver.findElement(By.name("lastName")).sendKeys("User123");
        driver.findElement(By.name("Username")).clear();
        driver.findElement(By.name("Username")).sendKeys("userSelenium1");
        driver.findElement(By.name("Passwd")).sendKeys("Password1234#");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("password1234");
        driver.findElement(By.xpath("//span[@class='JIzqne IMVfif']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='JIzqne y7T4L']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
