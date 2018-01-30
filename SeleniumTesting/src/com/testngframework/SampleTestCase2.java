package com.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase2 
{
	@Test
	public void test1() //Facebook
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.facebook.com/");
		f1.manage().window().maximize();
		
		String title = f1.getTitle();
		
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
		
		f1.quit();
	}
	
	@Test
	public void test3() //Snapchat
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.snapchat.com/");
		f1.manage().window().maximize();
		
		String title = f1.getTitle();
		
		Assert.assertEquals(title, "Snapchat - The fastest way to share a moment!");
		
		f1.quit();
	}
	
	@Test
	public void test2() //Amazon
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.com/");
		f1.manage().window().maximize();
		
		String title = f1.getTitle();
		
		Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
		f1.quit();
	}
	
	@Test
	public void test4() //Barnes & Noble
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.barnesandnoble.com/");
		f1.manage().window().maximize();
		
		String title = f1.getTitle();
		
		Assert.assertEquals(title, "Online Bookstore: Books, NOOK ebooks, Music, Movies & Toys | Barnes & Noble®");
		
		f1.quit();
	}
}
