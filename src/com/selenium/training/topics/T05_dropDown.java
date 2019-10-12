package com.selenium.training.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

/**
 * @author Bhavesh Shah
 */

public class T05_dropDown {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");

        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByIndex(1);
        Thread.sleep(1000);
        skills.selectByValue("AutoCAD");
        Thread.sleep(1000);
        skills.selectByVisibleText("Python");
        Thread.sleep(1000);

        System.out.println("Can we select multiple options for skill dropdown field? = "+skills.isMultiple());

        driver.findElement(By.xpath("//*[@role = 'combobox']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@class = 'select2-search__field']")).sendKeys("INDIA");
        Thread.sleep(800);
        driver.findElement(By.xpath("//*[@class = 'select2-results__option select2-results__option--highlighted']")).click();

        Thread.sleep(1500);
        driver.close();
    }
}