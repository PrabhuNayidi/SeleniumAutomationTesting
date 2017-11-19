package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForgotPasswordTestCase 
{
	public static WebDriver driver;
	public static int Browser;
	public static String BrowserName;
	public static void main(String[] args) 
	{
		for(Browser = 0; Browser <= 1; Browser++)
		{
			if (Browser == 0)
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Google Chrome Browser");
			}
			if (Browser == 1)
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("Mozilla Firefox Browser");
			}
			
			driver.get("https://www.wellsfargo.com/");
			driver.manage().window().maximize();
			
			boolean linkExistence = driver.findElement(By.linkText("Forgot Password/Username?")).isDisplayed();
			
			if (linkExistence == true)
			{
				System.out.println("The Forgot Password/Username Link Exists in the Wells Fargo Web Application");
			}
			else
			{
				System.out.println("The Forgot Password/Username Link Doesn't Exist in the Wells Fargo Web Application");
			}

			try
			{
				driver.get("https://www.wellsfargo.com/");
				driver.manage().window().maximize();
				linkExistence = driver.findElement(By.linkText("Mortgage Loan")).isDisplayed();
				if (linkExistence == true)
				{
					System.out.println("The Mortagage Loan Link Exists in the Wells Fargo Web Application");
				}
			}
			catch (NoSuchElementException e)
			{
				System.out.println("The Mortagage Loan Link Doesn't Exist in the Wells Fargo Web Application");
			}
			driver.quit();
		}
	}

}
