package com.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestCase6 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public static void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test(priority = 4)
	public static void webApp1()
	{
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 3)
	public static void webApp2()
	{
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public static void webApp3()
	{
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 5)
	public static void webApp4()
	{
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public static void webApp5()
	{
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public static void webApp6()
	{
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public static void exitBrowser()
	{
		driver.quit();
	}
}
