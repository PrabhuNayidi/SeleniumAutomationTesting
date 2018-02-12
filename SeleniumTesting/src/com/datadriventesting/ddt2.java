package com.datadriventesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ddt2 
{
	public WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test(dataProvider="testData")
	public void login(String username, String password)
	{
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://www.gcrit.com/build3/admin/index.php");
	}
	
	@DataProvider(name="testData")
	public Object [] [] readExcelData() throws BiffException, IOException 
	{
		File f1 = new File("C:\\Users\\PrabhuPushpaKumar\\Desktop\\AdminDataFile2.xls");
		Workbook w1 = Workbook.getWorkbook(f1);
		Sheet s1 = w1.getSheet(0);
		int rows = s1.getRows();
		int columns = s1.getColumns();
		
		String dataArray [] [] = new String [rows][columns];
		for (int i=0; i<rows; i++)
			for (int j=0; j<columns; j++)
			{
				Cell c = s1.getCell(j, i);
				dataArray[i][j] = c.getContents();
			}
		return dataArray;
	}
	
	@AfterClass
	public void quitBrowser()
	{
		driver.quit();
	}
}
