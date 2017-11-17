package sanityTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleBrowsers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		
		f1.get("https://www.w3schools.com/html/html_links.asp");
		Thread.sleep(2000);
		f1.findElement(By.linkText("Try it Yourself »")).click();
		
		String windowHandle = f1.getWindowHandle(); // Single Window Handle.
		//System.out.println("The Window handle of the Current Web Browser Window is : " + windowHandle);
		
		Set <String> windowHandles = f1.getWindowHandles();
		int windowCount = windowHandles.size();
		System.out.println("The Number of Opened Browser Windows are : " +  windowCount);
		
		//Switching Between Browsers.
		for (String s:windowHandles)
		{
			if (!s.equals(windowHandle))
			{
				f1.switchTo().window(s);
				System.out.println("The Current Page's URL is : " + f1.getCurrentUrl());
			}
		}
		f1.switchTo().window(windowHandle);
		
		/*Thread.sleep(3000);
		f1.close();*/
		//f1.quit();
	}

}
