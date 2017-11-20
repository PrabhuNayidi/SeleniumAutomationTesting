package sanityTests;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDataInputTestCase 
{
	public static WebDriver driver;
	public static int Browser;
	public static String BrowserName;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Google Chrome Browser");

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
		Thread.sleep(2000);
		
		driver.findElement(By.name("j_password")).sendKeys("gld938");
		Thread.sleep(2000);
		
		Scanner scan = new Scanner(System.in); //System.in is an Input Stream.
		System.out.println("Please Enter the CAPTCHA to Login into your Account : ");
		String captcha = scan.nextLine();
		driver.findElement(By.id("nlpAnswer")).sendKeys(captcha);
		scan.close();
		
		driver.findElement(By.id("loginbutton")).click();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		if (url.contains("https://www.irctc.co.in/eticketing/home"))
		{
			System.out.println("You have Logged into your Account");
		}
		else
		{
			System.out.println("Please Login into your Account!");
		}
		
		driver.quit();
	}
}
