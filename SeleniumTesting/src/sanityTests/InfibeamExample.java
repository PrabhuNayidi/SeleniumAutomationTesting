package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfibeamExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		
		c1.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
		c1.manage().window().maximize();
		
		c1.findElement(By.id("new-account-btn")).click();
		c1.findElement(By.xpath("//*[@id='password']")).sendKeys("PASSWORD");
	
		Thread.sleep(3000);
		c1.quit();
	}

}
