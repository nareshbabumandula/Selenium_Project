package com.selenium.scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TextboxTest
{
	
	WebDriver driver;
	
	public void textboxMethods(String BROWSER) throws InterruptedException {
		String strProjectPath = System.getProperty("user.dir");
		String strRootPath = "";
		if (strProjectPath.contains("Selenium_Java")) {
			strRootPath = strProjectPath.replaceAll("\\Selenium_Java", "");
		} else {
			strRootPath = System.getProperty("user.dir");
		}
		System.setProperty("webdriver.chrome.driver", strRootPath + "/Selenium_Java/browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize(); // Maximize the browser window

		WebElement username = driver.findElement(By.id("user"));
		System.out.println(username.isDisplayed());
		System.out.println(username.isEnabled());
		System.out.println(username.getTagName());
		System.out.println(username.getAttribute("name"));
		System.out.println(username.getAttribute("type"));
		System.out.println(username.getAttribute("class"));
		System.out.println(username.getAttribute("id"));
		System.out.println(username.getAttribute("tabindex"));
		// Enter text in textbox
		username.sendKeys("testuser");
		Thread.sleep(3000);
		driver.quit(); // Terminate the browser
	}

	public static void main(String[] args) throws InterruptedException {
		TextboxTest bt = new TextboxTest();
		bt.textboxMethods("chrome");
	}

}
