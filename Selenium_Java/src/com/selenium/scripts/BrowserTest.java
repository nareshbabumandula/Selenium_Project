package com.selenium.scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest
{
	
	WebDriver driver;
	
	public void launchBrowser(String BROWSER) throws InterruptedException {
		String strProjectPath = System.getProperty("user.dir");
		String strRootPath="";
		if(strProjectPath.contains("Selenium_Java")){
			strRootPath = strProjectPath.replaceAll("/Selenium_Java", "");
		}
		switch (BROWSER) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", strRootPath + "/Selenium_Java/browsers/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", strRootPath + "/Selenium_Java/browsers/geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", strRootPath + "/Selenium_Java/browsers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default:
			System.out.println("Invalid browser..!");
			break;
		}
		driver.get("https://www.mycontactform.com/");

		driver.findElement(By.id("user")).sendKeys("naresh");

		Thread.sleep(3000);
		driver.quit(); // Terminate the browser
	}

	public static void main(String[] args) throws InterruptedException {
		BrowserTest bt = new BrowserTest();
		bt.launchBrowser("chrome");

		bt.launchBrowser("firefox");
		//BrowserTest bt = new BrowserTest();
		//bt.launchBrowser("ie");


	}

}
