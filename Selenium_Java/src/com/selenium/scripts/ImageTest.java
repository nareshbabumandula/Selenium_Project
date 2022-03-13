package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ImageTest
{

    WebDriver driver;

    @Test
    public void  imageMethods() throws InterruptedException {
        String BROWSER = "chrome";
        String strRootPath = System.getProperty("user.dir");
        String strProjectPath = strRootPath + File.separator + "Selenium_Project";

        System.setProperty("webdriver.chrome.driver", strRootPath + "/Selenium_Java/browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize(); // Maximize the browser window

        WebElement imageLogo = driver.findElement(By.className("test_img"));
        System.out.println(imageLogo.isDisplayed());
        System.out.println(imageLogo.isEnabled());
        System.out.println(imageLogo.getTagName());
        System.out.println(imageLogo.getAttribute("src"));
        System.out.println(imageLogo.getAttribute("alt"));
        System.out.println(imageLogo.getAttribute("class"));

        // Click on image
        imageLogo.click();
        Thread.sleep(3000);
        driver.quit(); // Terminate the browser
    }



}
