package com.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase1 
{
	// General Selenium WebDriver Test Case.
	
	/*public static WebDriver f1;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		f1= new FirefoxDriver();
		f1.manage().window().maximize();
		f1.get("https://www.udemy.com/");
		
		String pageTitle = f1.getTitle();
		
		if (pageTitle.equals("Online Courses - Learn Anything, On Your Schedule | Udemy"))
			System.out.println("Test Passed!!");
		else
			System.out.println("Test Failed!");
		
		f1.quit();
	}*/
	
	// TestNG Test Case.
	
	@Test 
	public void titleCheck()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1= new FirefoxDriver();
		f1.manage().window().maximize();
		f1.get("https://www.udemy.com/");
		
		String pageTitle = f1.getTitle();
		
		Assert.assertEquals(pageTitle, "Online Courses - Learn Anything, On Your Schedule | Udemy");
		
		f1.quit();
	}
}
