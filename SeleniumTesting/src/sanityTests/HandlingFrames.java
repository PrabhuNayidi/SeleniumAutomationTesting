package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		f1.switchTo().frame(2);
		Thread.sleep(2000);
		f1.findElement(By.linkText("org.openqa.selenium.html5")).click();
		Thread.sleep(3000);
		
		f1.navigate().back();
		f1.switchTo().defaultContent();
		Thread.sleep(2000);
		f1.switchTo().frame("packageListFrame");
		f1.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(2000);
		
		f1.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		//f1.switchTo().defaultContent();
		Thread.sleep(2000);
		f1.switchTo().frame("packageFrame");
		f1.findElement(By.linkText("AcceptAlert")).click();
		Thread.sleep(3000);
		
		f1.quit();
	}

}
