package com.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTestCase1 
{
	public static WebDriver f1;
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
	}
}
