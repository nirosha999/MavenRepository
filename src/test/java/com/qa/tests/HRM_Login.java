package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class HRM_Login {
	
	WebDriver driver;
	
	
	@BeforeTest
	
	public void login()
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.testingmasters.com/hrm");
	    driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("user02");
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("TM1234");
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	    
	}
	
	
	@AfterTest
	
	public void logout() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Welcome kodi")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div/div/div/ul/li[3]")).click();
				
	}
	
}
