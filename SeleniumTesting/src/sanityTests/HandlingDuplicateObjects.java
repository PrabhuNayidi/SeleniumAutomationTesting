package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDuplicateObjects {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		
		c1.get("http://www.gcrit.com/build3/admin/login.php?");
		c1.manage().window().maximize();
		
		c1.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1500);
		
		c1.findElement(By.name("password")).sendKeys("admin@123");
		Thread.sleep(1500);
		
		c1.findElement(By.className("ui-button")).click();
		Thread.sleep(1500);
		
		String url = c1.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			c1.findElement(By.linkText("Online Catalog")).click();
		}
		System.out.println("The URL of the Current Web Page is : " + "'" + c1.getCurrentUrl() + "'");
		
		c1.quit();
	}

}
