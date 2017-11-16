package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("http://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement we1 = f1.findElement(By.name("color"));
		
		System.out.println("The Displayed Status of the Specified Check Box before Selecting it : " + we1.isDisplayed());
		System.out.println("The Enabled Status of the Specified Check Box before Selecting it : " + we1.isEnabled());
		System.out.println("The Selected Status of the Specified Check Box before Selecting it : " + we1.isSelected());
		
		we1.click();
		
		System.out.println("The Displayed Status of the Specified Check Box after Selecting it : " + we1.isDisplayed());
		System.out.println("The Enabled Status of the Specified Check Box after Selecting it : " + we1.isEnabled());
		System.out.println("The Selected Status of the Specified Check Box after Selecting it : " + we1.isSelected());
		
		Thread.sleep(3000);
		f1.quit();
	}

}
