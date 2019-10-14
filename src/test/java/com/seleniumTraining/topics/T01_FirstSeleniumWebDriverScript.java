package com.seleniumTraining.topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Bhavesh Shah
 */

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

        // Do not use == in if clause condition as code won't work properly. Reason being  == checks if both objects point 
        // to the same memory location whereas contentEquals() compares the String with the String Buffer and returns a boolean value.
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}
