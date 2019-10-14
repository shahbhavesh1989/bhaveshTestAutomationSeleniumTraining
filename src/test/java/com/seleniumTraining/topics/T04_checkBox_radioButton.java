package com.seleniumTraining.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Bhavesh Shah
 */

public class T04_checkBox_radioButton {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/selenium server standalone/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);

        List <WebElement> elements = driver.findElements(By.xpath("//input[@type = 'radio']"));
        System.out.println ("No. of elements on the Web page that have type as 'radio' = "+elements.size());

        System.out.println ("By default Male radio button is selected = "+elements.get(0).isSelected());
        System.out.println ("By default Female radio button is selected = "+elements.get(1).isSelected());
        System.out.println ("By default Male radio button is displayed = "+elements.get(0).isDisplayed());
        System.out.println ("By default Female radio button is displayed = "+elements.get(1).isDisplayed());
        System.out.println ("By default Male radio button is enabled = "+elements.get(0).isEnabled());
        System.out.println ("By default Female radio button is enabled = "+elements.get(1).isEnabled());

        elements.get(0).click();
        System.out.println ("is Male radio button selected now? = "+elements.get(0).isSelected());
        Thread.sleep(1500);
        elements.get(1).click();
        System.out.println ("is Female radio button selected now? = "+elements.get(1).isSelected());

        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("checkbox3")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("checkbox3")).click();

        Thread.sleep(1500);
        driver.close();
    }
}