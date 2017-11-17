package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		c1.get("https://www.harvard.edu/");
		c1.manage().window().maximize();
		
		WebElement schools = c1.findElement(By.linkText("Schools"));
		
		Actions mddlist = new Actions(c1); // Creating an Instance for the Actions Interface.
		mddlist.moveToElement(schools).build().perform(); // Performing the Mouse Hover Event.
		Thread.sleep(2000);
		c1.findElement(By.linkText("Graduate School")).click(); // Clicking Graduate School Link Under Schools Drop Down Menu.
		Thread.sleep(3000);
		
		c1.navigate().back();
		
		Thread.sleep(3000);
		c1.quit();
	}

}
