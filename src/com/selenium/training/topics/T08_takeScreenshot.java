package com.selenium.training.topics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T08_takeScreenshot {

    static WebDriver driver;

    public static void main(String[] args)  throws Exception {
        Date currentDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd_hhmmss");
        ft.format(currentDate);
        System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
        driver = new ChromeDriver();
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
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\screenshots\\"+ ft.format(currentDate) + ".png"));
        driver.close();
    }
}