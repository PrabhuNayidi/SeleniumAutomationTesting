package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin 
{
	static int i, browser;
	static String username, password, iteration;
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		for (i = 1; i <= 2; i++)
		{
			for (browser = 1; browser <= 2; browser++)
			{
				if (browser == 1)
				{
					System.out.println("Google Chrome Web Browser");
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
				}
				else if (browser == 2)
				{
					System.out.println("Firefox Web Browser");
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
				
				if (i == 1)
				{
					username = "admin";
					password = "admin@123";
					iteration = "Iteration 1: ";
				}
				else if (i == 2)
				{
					username = "admin";
					password = "admin123";
					iteration = "Iteration 2: ";
				}
				driver.get("http://www.gcrit.com/build3/admin/login.php");
				
				driver.manage().window().maximize();
				

				driver.findElement(By.name("username")).sendKeys(username);
				Thread.sleep(1000);
				driver.findElement(By.name("password")).sendKeys(password);
				Thread.sleep(1000);
				driver.findElement(By.id("tdb1")).click();
				
				String url = driver.getCurrentUrl();
				
				if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
				{
					System.out.println(iteration + "Test Data : (" + username + ", " + password + ") " + "Admin Login Successful -- Test Case Passed");
					driver.findElement(By.linkText("Logoff")).click();
					Thread.sleep(2000);
				}
				else if (!url.contains("http://www.gcrit.com/build3/admin/index.php"))
				{
					String errorMessage = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText();
					System.out.println("The Error Message is : " + errorMessage);
					if (errorMessage.contains(" Error: Invalid administrator login attempt."))
					{
						System.out.println(iteration + "Test Data : (" + username + ", " + password + ") " + "Invalid Admin Login Credentials -- Test Case Passed!");
					}
				}
				else
				{
					System.out.println(iteration + "Test Case Failed");
				}
				
				driver.quit();
			}
		}
	}

}
