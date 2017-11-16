package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.bharatmatrimony.com/");
		WebElement we1 = f1.findElement(By.xpath(".//*[@id='genderfemale']"));
		System.out.println("The Enabled Status of the Specified Radio Button before Selecting it : " + we1.isEnabled());
		System.out.println("The Displayed Status of the Specified Radio Button before Selecting it : " + we1.isDisplayed());
		System.out.println("The Selected Status of the Specified Radio Button before Selecting it : " + we1.isSelected());
		
		we1.click();
		System.out.println("The Enabled Status of the Specified Radio Button after Selecting it : " + we1.isEnabled());
		System.out.println("The Displayed Status of the Specified Radio Button after Selecting it : " + we1.isDisplayed());
		System.out.println("The Selected Status of the Specified Radio Button after Selecting it : " + we1.isSelected());
		
		Thread.sleep(4000);
		f1.quit();
	}

}
