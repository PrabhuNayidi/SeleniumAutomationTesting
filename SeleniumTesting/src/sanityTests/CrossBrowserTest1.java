package sanityTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTest1 
{
	public static WebDriver driver; // WebDriver Object
	public static int browser; // Class Level Variable
	public static String browserName; // Class Level Variable
	
	public static void main(String[] args) 
	{
		
		for (browser = 1; browser <= 3; browser++)
		{
			if (browser == 1)
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				
				browserName = "Mozilla Firefox Browser";
			}
			else if (browser == 2)
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
				browserName = "Google Chrome Browser";
			}
			else if (browser == 3)
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
				browserName = "Internet Explorer Browser";
			}
			
			driver.get("https://www.stanford.edu");
			
			String title = driver.getTitle();
			
			if (title.equals("Stanford University"))
			{
				System.out.println("Stanford University Application Status for " + browserName + " - Success");
				System.out.println(driver.getCurrentUrl());
			}
			else
			{
				System.out.println("Stanford University Application Status for " + browserName + " - Failure");
				System.out.println(driver.getCurrentUrl());
			}
			
			driver.quit();
		}
		
	}
}
