package com.gmail.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testscript_01 {

    public static void main(String[] args) throws Exception {
        //Path to browser specific driver executable file.
        System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");

        /*
        Creating a reference variable "driver" for WebDriver interface and casting it to ChromeDriver.
        This driver will be able to send selenium commands (Selenese) to your browser specific driver which will then
        send a request to your browser on local machine and perform the specified action.
        */
        WebDriver driver = new ChromeDriver();

        //Maximize the browser window
        driver.manage().window().maximize();

        //Command to navigate to required URL.
        driver.get("https://accounts.google.com/signup");
        String str = driver.getTitle();
        System.out.println("Webpage title is: "+str);

        /*
        Selenium locator strategy:
        Depending on the locators present in DOM (Document Object Model) make use of following:
        1. id
        2. name
        3. cssSelector
        4. partialLinkText
        5. linkText
        6. tagName
        7. xpath
        */

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("firstName")));

        //Find element using className
        driver.findElement(By.name("firstName")).sendKeys("seleniumDemo");

        //Find element using name
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