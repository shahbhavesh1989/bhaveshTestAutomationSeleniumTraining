package com.seleniumDemo.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Bhavesh Shah
 */

public class T03_WebElement_findElements {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        String baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);

        WebElement el1 = driver.findElement(By.id("email"));
        el1.click();
        el1.clear();
        el1.sendKeys("test123@gmail.com");

        WebElement el2 =  driver.findElement(By.partialLinkText("Forgotten"));
        el2.click();

        List <WebElement> elements = driver.findElements(By.xpath("//*[contains(text(), 'facebook')]"));
        System.out.println ("No. of elements on the Web page that contains text as 'facebook' = "+elements.size());
        Thread.sleep(1500);
        driver.close();
    }
}