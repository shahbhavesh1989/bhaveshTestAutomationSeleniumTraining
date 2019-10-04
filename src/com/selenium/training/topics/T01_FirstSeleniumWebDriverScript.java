package com.selenium.training.topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_FirstSeleniumWebDriverScript {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://www.facebook.com/";
        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle;

        driver.get(baseUrl);
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}
