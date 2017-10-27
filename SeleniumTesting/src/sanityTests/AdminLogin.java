package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Admin Logged in - Test Case Passed");
		}
		else
		{
			System.out.println("Admin not logged in - Test Case Failed");
		}
		driver.close();
	}

}
