package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		c1.get("https://www.bankofamerica.com/");
		c1.manage().window().maximize();
		WebElement we1 = c1.findElement(By.linkText("Go"));
		we1.click();
		System.out.println("The Title of the Current Web Page is : " + c1.getTitle());
		Thread.sleep(2000);
		c1.findElement(By.xpath("//*[@id='cancelFlexModalStateAlertLayer']/span")).click();
		Thread.sleep(2000);
		
		c1.navigate().to("https://www.bankofamerica.com/");
		WebElement we2 = c1.findElement(By.partialLinkText("Investments"));
		System.out.println("The Displayed Status of Inveting Link in the Home Page is : " + we2.isDisplayed());
		System.out.println("The Enabled Status of Inveting Link in the Home Page is : " + we2.isEnabled());
		Thread.sleep(2000);
		
		c1.navigate().to("https://www.bankofamerica.com/");
		c1.findElement(By.className("search-query")).sendKeys("mobile banking");
		Thread.sleep(1000);
		c1.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		//c1.findElement(By.xpath("//*[@id='headerMenuContainer']/div/div[1]/div/div/div/div/div/div[4]/div/div/div/p/a/img"));
		//System.out.println("The Title of the New Web Page is : " + c1.getTitle());
		
		
		c1.navigate().to("http://content.time.com/time/specials/packages/completelist/0,29569,1974961,00.html");
		WebElement we3 = c1.findElement(By.partialLinkText("Charlie Bit"));
		String LinkName = we3.getText();
		System.out.println("The Name of the Selected Link is : " + LinkName);
		System.out.println("The URL of the Selected Link is : " + we3.getAttribute("href"));
		
		Thread.sleep(3000);
		c1.quit();
	}

}
