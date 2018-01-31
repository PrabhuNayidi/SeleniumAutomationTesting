package com.testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase5 
{
	@Test
	public static void signin()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.com/");
		f1.manage().window().maximize();
		
		f1.findElement(By.linkText("Your Amazon.com")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon Sign In");
		
		f1.quit();
	}
	
	@Test(dependsOnMethods={"signin"})
	public static void deals()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.com/");
		f1.manage().window().maximize();
		
		f1.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
		
		String linkName = f1.findElement(By.linkText("Deal of the Day")).getText();
		
		Assert.assertEquals(linkName, "Deal of the Day?");
		
		f1.quit();
	}
	
	@Test(dependsOnMethods={"deals"}, alwaysRun=true)
	public static void giftCards()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.com/");
		f1.manage().window().maximize();
		
		f1.findElement(By.xpath("//*[@id='nav-xshop']/a[3]")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon.com Gift Cards");
		
		f1.quit();
	}
	
	@Test(dependsOnMethods={"giftCards"})
	public static void registry()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.com/");
		f1.manage().window().maximize();
		
		f1.findElement(By.linkText("Registry")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon.com: : Registry");
		
		f1.quit();
	}
	
	@Test(dependsOnMethods={"registry"})
	public static void sell()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.com/");
		f1.manage().window().maximize();
		
		f1.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon.com: Sell Products Online with Selling on Amazon");
		
		f1.quit();
	}
	
	@Test(dependsOnMethods={"sell"})
	public static void help()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.com/");
		f1.manage().window().maximize();
		
		f1.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
		
		String newPageTitle = f1.getTitle();
		
		Assert.assertEquals(newPageTitle, "Amazon.com Help");
		
		f1.quit();
	}
}
