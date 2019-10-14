package com.seleniumTraining.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Bhavesh Shah
 */

public class T06_webTable {

    public static void main(String[] args) throws Exception {
        int i,j;
        System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");

        driver.findElement(By.linkText("Link Test")).click();

        List <WebElement> el1 = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));
        for (i = 1; i <=el1.size(); i++) {
            List <WebElement> el2 = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td[1]//following-sibling::td"));
            for (j = 1; j <= el2.size(); j++) {
                String str = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td[1]//following-sibling::td[" + j + "]")).getText();
                System.out.print("\t"+str+ "\n");
            }
            System.out.println(" ----- ");
        }
        Thread.sleep(1000);
        driver.close();
    }
}