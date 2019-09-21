package com.gmail.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.URL;

public class Testscript_02 {

    public static WebDriver driver;
    public static final String USERNAME = "bhaveshshah9";
    public static final String AUTOMATE_KEY = "qC6rmQyaSsdyEXPogb6q";
    public static final String remoteURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public static void Testscript_02() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Safari");
        caps.setCapability("browser_version", "11.1");
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "High Sierra");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("browserstack.debug", true);
        caps.setCapability("browserstack.networkLogs", true);
        caps.setCapability("name", "Bstack-[Java] Sample Testng Execution");

        driver = new RemoteWebDriver(new URL(remoteURL), caps);
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