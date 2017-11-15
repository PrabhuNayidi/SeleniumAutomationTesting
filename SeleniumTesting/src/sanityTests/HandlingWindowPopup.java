package sanityTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1  = new FirefoxDriver();
		f1.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		f1.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		Alert popup = f1.switchTo().alert();
		String emsg = popup.getText(); // Returns the Error Message of a Window Popup
		System.out.println("The Error Message in the alerted Window Popup is : " + emsg);
		
		popup.dismiss(); // popup.accept(); //Closes OK Button.
		Thread.sleep(3000);
		
		f1.findElement(By.id("login1")).sendKeys("myName");
		Thread.sleep(1000);
		f1.findElement(By.name("passwd")).sendKeys("samplePassword");
		Thread.sleep(1000);
		f1.quit();
	}

}
