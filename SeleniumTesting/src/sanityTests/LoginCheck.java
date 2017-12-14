package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginCheck 
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
			
			driver.get("http://www.gcrit.com/build3/");
			driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
			
			driver.manage().window().maximize();
			
			driver.findElement(By.name("email_address")).sendKeys("johndoe@sample.com");
			driver.findElement(By.name("password")).sendKeys("Sample@123xyz");
			driver.findElement(By.id("tdb5")).click();
			
			String url = driver.getCurrentUrl();
			
			if (url.equals("http://www.gcrit.com/build3/index.php"))
			{
				System.out.println("Customer Account Login was Succesful - Test Case Passed!");
			}
			else
			{
				System.out.println("Customer Account Login was Unsuccesful - Test Case Failed!");
			}
			
			driver.quit();
		}
	}

}
