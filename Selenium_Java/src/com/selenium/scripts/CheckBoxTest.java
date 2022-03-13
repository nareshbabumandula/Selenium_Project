package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class CheckBoxTest
{

    WebDriver driver;

    @Test
    public void  checkboxMethods() throws InterruptedException {
        String BROWSER = "chrome";
        String strRootPath = System.getProperty("user.dir");
        String strProjectPath = strRootPath + File.separator + "Selenium_Project";

        System.setProperty("webdriver.chrome.driver", strRootPath + "/Selenium_Java/browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize(); // Maximize the browser window
        driver.findElement(By.linkText("Sample Forms")).click();
        WebElement chkSentTo = driver.findElement(By.name("email_to[]"));
        System.out.println(chkSentTo.isDisplayed());
        System.out.println(chkSentTo.isEnabled());
        System.out.println("Before selecting the status selection status is : " + chkSentTo.isSelected());
        System.out.println(chkSentTo.getTagName());
        System.out.println(chkSentTo.getAttribute("type"));
        System.out.println(chkSentTo.getAttribute("name"));
        System.out.println(chkSentTo.getAttribute("value"));
        // Click on checkbox
        chkSentTo.click();
        System.out.println("After selecting the status selection status is : " + chkSentTo.isSelected());
        Thread.sleep(3000);
        driver.quit(); // Terminate the browser
    }



}
