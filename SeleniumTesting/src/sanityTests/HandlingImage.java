package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingImage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		
		f1.get("https://www.instagram.com/?hl=en");
		WebElement we1 = f1.findElement(By.className("_824m9"));
		System.out.println("The Attribute Value for the Selected Image Element is : " + we1.getAttribute("src"));
		Thread.sleep(2000);
		
		f1.navigate().to("http://bignosebird.com/docs/h41.shtml");
		WebElement we2 = f1.findElement(By.xpath("html/body/table/tbody/tr/td[1]/center/p/table/tbody/tr/td/table[2]/tbody/tr/td/form/pre/input[4]"));
		Thread.sleep(1000);
		we2.click();
		System.out.println("The URL of New Web Page is : " + f1.getCurrentUrl());
		System.out.println("The Page Source for the New Web Page is : " + f1.getPageSource());
		Thread.sleep(2000);
		
		f1.navigate().to("https://www.udemy.com/");
		System.out.println("The URL of the Current Web Page is : " + f1.getCurrentUrl());
		System.out.println("The Title of the Current Web Page is : " + f1.getTitle());
		Thread.sleep(1000);
		f1.findElement(By.xpath(".//*[@id='udemy']/div[3]/div[2]/div[2]/ui-view/div/div[1]/discovery-unit-container[2]/course-list-unit/react-component/div/div/div[3]/div/div/div[1]/div/a/span[1]/img")).click();
		System.out.println("The URL of the New Web Page is : " + f1.getCurrentUrl());
		System.out.println("The Title of the New Web Page is : " + f1.getTitle());
		
		Thread.sleep(2000);
		f1.quit();
	}

}
