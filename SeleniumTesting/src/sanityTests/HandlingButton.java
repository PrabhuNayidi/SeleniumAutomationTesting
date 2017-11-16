package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		c1.get("https://www.facebook.com/");
		c1.manage().window().maximize();
		WebElement e1 = c1.findElement(By.id("u_0_r"));
		System.out.println("The Enabled Status of the Specified Button is : " + e1.isEnabled());
		c1.findElement(By.id("u_0_r")).click();
		System.out.println("The Displayed Status of the Specified Button is : " + e1.isDisplayed());
		System.out.println("The Enabled Status of the Specified Button is : " + e1.isEnabled());
		System.out.println("The Type of the Specified Button is : " + e1.getAttribute("type"));
		System.out.println("The Name of the Specified Button is : " + e1.getAttribute("name"));
		
		Thread.sleep(2000);
		c1.quit();
	}

}
