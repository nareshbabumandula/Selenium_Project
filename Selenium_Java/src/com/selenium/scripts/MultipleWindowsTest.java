package com.selenium.scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsTest {

    WebDriver driver;

    public void multipleWindowsExample() throws InterruptedException {
        String strRootPath = System.getProperty("user.dir");
        if(strRootPath.contains("Selenium_Java")){
            strRootPath = strRootPath.replaceAll("\\Selenium_Java", "");
        }
        System.setProperty("webdriver.chrome.driver", strRootPath + "/Selenium_Java/browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize(); // Maximize the browser window
        String mainwindowID = driver.getWindowHandle(); // Session ID
        System.out.println("Main window ID is : " + mainwindowID);
        String newTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.linkText("Sample Forms")).sendKeys(newTab);
        Set<String> windowIDs = driver.getWindowHandles(); // Session ID's of multiple windows
        System.out.println("Window ID's are : " + windowIDs);

        Iterator<String> iter = windowIDs.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
            String childWindow = iter.next();
            if(!mainwindowID.equals(childWindow)){
                driver.switchTo().window(childWindow);
            }
        }

        driver.findElement(By.id("subject")).sendKeys("Test Subject");

        Thread.sleep(3000);
        driver.quit(); // Terminate the browser
    }


    public static void main(String[] args) throws InterruptedException {
        MultipleWindowsTest bt = new MultipleWindowsTest();
        bt.multipleWindowsExample();
    }

}
