package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserDefinedMethods 
{
	public static WebDriver driver;
	
	//Launch a Browser
	public void launchBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	//User Defined Method Login without Parameters
	public void adminLogin()
	{
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}
	
	//User Defined Method Login with Parameters
	public void adminLogin(String Username, String Password)
	{
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.id("tdb1")).click();
	}
	
	// Close a Browser
	public void closeBrowser()
	{
		if (! driver.toString().contains("null"))
			driver.close();
	}
	public static void main(String[] args) 
	{
		//Create an object for Class UserDefinedMethods
		UserDefinedMethods o1 = new UserDefinedMethods();
		o1.launchBrowser();
		o1.adminLogin();
		o1.closeBrowser();
		o1.launchBrowser();
		o1.adminLogin("admin", "admin@123");
		o1.closeBrowser();
	}
}
