package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowsers 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver firefox = new FirefoxDriver();
		firefox.get("https://www.facebook.com/");
		firefox.manage().window().maximize();
		String text = firefox.findElement(By.className("fb_logo")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		firefox.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com/");
		chrome.manage().window().maximize();
		chrome.findElement(By.className("gb_P")).click();
		chrome.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		chrome.findElement(By.className("whsOnd")).sendKeys(text);
		Thread.sleep(2000);
		chrome.close();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\IEDriverServer.exe");
		WebDriver ie = new InternetExplorerDriver();
		ie.get("https://twitter.com/");
		ie.manage().window().maximize();
		Thread.sleep(2000);
		ie.close();
	}

}
