package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLoginNegativeTestCase 
{
	public static WebDriver driver;
	public static int browser;
	public static String browserName;
	
	public static void main(String[] args) 
	{
		for (browser = 1; browser <= 2; browser++)
		{
			if (browser == 1)
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Google Chrome Web Browser");
			}
			else if (browser == 2)
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("Firefox Web Browser");
			}
			
			driver.get("http://www.gcrit.com/build3/admin/login.php");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.id("tdb1")).click();
			
			String url = driver.getCurrentUrl();
			System.out.println("The current URL is : " + url);
			
			if (url.contains("http://www.gcrit.com/build3/admin/login.php"))
			{
				String errorMessage = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText();
				System.out.println("The Error Message is : " + errorMessage);
			
				if (errorMessage.contains(" Error: Invalid administrator login attempt."))
				{
					System.out.println("Invalid Admin Login Credentials -- Test Case Passed!");
				}
			}
			else
			{
				System.out.println("Valid Admin Login Credentials -- Test Case Failed!");
			}
			
			driver.quit();
			
		}
	}

}
