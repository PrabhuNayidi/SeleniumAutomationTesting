package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class WikiLinkTestCase1 
{
	public static WebDriver driver;
	public static int Browser;
	public static String BrowserName;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException 
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
			/*if (Browser == 2)
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				System.out.println("Internet Explorer Browser");
			}*/
			
			driver.get("https://en.wikipedia.org/wiki/YouTube");
			
			driver.manage().window().maximize();
			
			url = driver.getCurrentUrl();
			System.out.println("The Current Page's URL is : " + url);
			
			if (url.contains("wikipedia.org"))
			{
				System.out.println("The Internal Link (YouTube) in the wikipedia.org is working!");
			}
			else
			{
				System.out.println("The Internal Link (YouTube) in the wikipedia.org is not working!");
			}
			
			driver.findElement(By.linkText("YouTube.com")).click();
			
			url = driver.getCurrentUrl();
			System.out.println("The Current Page's URL is : " + url);
			
			if (url.contentEquals("https://www.youtube.com/"))
			{
				System.out.println("The External Link (youtube.com) of the wikipedia Application is working!");
			}
			else
			{
				System.out.println("The External Link (youtube.com) of the wikipedia Application is not working!");
			}
			
			Thread.sleep(1000);
			driver.quit();
		}
	}
}
