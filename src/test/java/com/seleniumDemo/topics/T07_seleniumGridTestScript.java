package com.seleniumDemo.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @author Bhavesh Shah
 */

public class T07_seleniumGridTestScript {

    static WebDriver driver;
    static final String hubURL = "http://localhost:4444/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(BrowserType.CHROME);
        caps.setPlatform(Platform.WIN10);

        //System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
        //driver = new ChromeDriver();

        driver = new RemoteWebDriver(new URL(hubURL), caps);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        String baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("test456@yahoo.com");
        driver.findElement(By.className("login_form_input_box")).clear();
        driver.findElement(By.className("login_form_input_box")).click();
        driver.findElement(By.className("login_form_input_box")).sendKeys("test789@msn.com");
        driver.findElement(By.partialLinkText("Forgotten")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Cancel")).click();
        driver.findElement(By.cssSelector("a#reg-link")).click();
        driver.findElement(By.cssSelector("input[id=u_0_n]")).sendKeys("userfirstname");
        driver.findElement(By.cssSelector("input.inputtext[name=lastname]")).sendKeys("userlastname");
        boolean valuePrevious = driver.findElement(By.xpath("//input[@id='u_0_v']")).isDisplayed();
        System.out.println("Boolean value is = "+valuePrevious);
        driver.findElement(By.xpath("//input[@id='u_0_s']")).sendKeys("seleniumDemo@mailinator.com");
        boolean valueCurrent = driver.findElement(By.xpath("//input[@id='u_0_v']")).isDisplayed();
        System.out.println("Boolean value is = "+valueCurrent);
        driver.findElement(By.xpath("//input[@id='u_0_z']")).sendKeys("codeRed12#");
        Thread.sleep(3000);
        driver.close();
    }
}