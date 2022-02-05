package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class RadioButton
{

    WebDriver driver;

    @Test
    public void  radioMethods() throws InterruptedException {
        String BROWSER = "chrome";
        String strRootPath = System.getProperty("user.dir");
        String strProjectPath = strRootPath + File.separator + "Selenium_Java";

        System.setProperty("webdriver.chrome.driver", strRootPath + "/Selenium_Java/browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize(); // Maximize the browser window
        driver.findElement(By.linkText("Sample Forms")).click();
        WebElement radioButton = driver.findElement(By.id("q4"));
        System.out.println(radioButton.isDisplayed());
        System.out.println(radioButton.isEnabled());
        System.out.println(radioButton.getTagName());
        System.out.println(radioButton.getAttribute("type"));
        System.out.println(radioButton.getAttribute("name"));
        System.out.println(radioButton.getAttribute("id"));
        System.out.println(radioButton.getAttribute("value"));
        // Click on radio button
        radioButton.click();
        Thread.sleep(3000);
        driver.quit(); // Terminate the browser
    }



}
