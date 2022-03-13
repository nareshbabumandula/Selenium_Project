package com.selenium.scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ButtonTest
{
	
	WebDriver driver;
	
	public void  buttonMethods(String BROWSER) throws InterruptedException {
		String strRootPath = System.getProperty("user.dir");
		String strProjectPath = strRootPath + File.separator + "Selenium_Project";

		System.setProperty("webdriver.chrome.driver", strRootPath + "/Selenium_Java/browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize(); // Maximize the browser window

		WebElement btnLogin = driver.findElement(By.name("btnSubmit"));
		System.out.println(btnLogin.isDisplayed());
		System.out.println(btnLogin.isEnabled());
		System.out.println(btnLogin.getTagName());
		System.out.println(btnLogin.getAttribute("name"));
		System.out.println(btnLogin.getAttribute("type"));
		System.out.println(btnLogin.getAttribute("class"));
		System.out.println(btnLogin.getAttribute("value"));
		System.out.println(btnLogin.getAttribute("tabindex"));
		// Click on button
		btnLogin.click();
		Thread.sleep(3000);
		driver.quit(); // Terminate the browser
	}

	public static void main(String[] args) throws InterruptedException {
		ButtonTest bt = new ButtonTest();
		bt.buttonMethods("chrome");
	}

}
