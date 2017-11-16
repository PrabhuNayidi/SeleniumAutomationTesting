package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInlineElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		
		c1.get("https://www.google.com/");
		c1.manage().window().maximize();
		//c1.findElement(By.className("gb_b")).click();
		c1.findElement(By.xpath("//*[@id='gbwa']/div[1]/a")).click();
		c1.findElement(By.xpath("//*[@id='gbwa']/div[2]/a[1]"));
		c1.findElement(By.xpath("//*[@id='gb49']/span[1]")).click();
		Thread.sleep(3000);
		c1.quit();
	}

}
