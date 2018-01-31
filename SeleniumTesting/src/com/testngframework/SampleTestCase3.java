package com.testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SampleTestCase3 
{
	@Test(priority = 0)
	public static void signin()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.in/");
		f1.manage().window().maximize();
		
		f1.findElement(By.id("nav-your-amazon")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon Sign In");
		
		f1.quit();
	}
	
	@Test(priority = 1)
	public static void deals()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.in/");
		f1.manage().window().maximize();
		
		f1.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
		
		String linkName = f1.findElement(By.linkText("All Deals")).getText();
		
		Assert.assertEquals(linkName, "All Deals");
		
		f1.quit();
	}
	
	@Test(priority = 2)
	public static void pay()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.in/");
		f1.manage().window().maximize();
		
		f1.findElement(By.linkText("Amazon Pay")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon.in: Amazon Pay");
		
		f1.quit();
	}
	
	@Test(priority = 3)
	public static void sell()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.in/");
		f1.manage().window().maximize();
		
		f1.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon.in: Sell on Amazon - SYH");
		
		f1.quit();
	}
	
	@Test(priority = 4)
	public static void help()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.in/");
		f1.manage().window().maximize();
		
		f1.findElement(By.linkText("Customer Service")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon.in Help");
		
		f1.quit();
	}
}
