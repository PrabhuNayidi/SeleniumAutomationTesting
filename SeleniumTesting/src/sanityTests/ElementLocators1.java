package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver d1 = new FirefoxDriver();
		d1.get("https://www.facebook.com/");
		d1.findElement(By.id("u_0_9")).sendKeys("fname");
		d1.findElement(By.id("u_0_b")).sendKeys("lname");
		d1.findElement(By.name("reg_email__")).sendKeys("1234567890");
		d1.findElement(By.name("reg_passwd__")).sendKeys("SamplePassWord");
		d1.findElement(By.name("birthday_month")).sendKeys("Dec");
		/*d1.findElement(By.name("birthday_day")).sendKeys("5");
		d1.findElement(By.name("birthday_year")).sendKeys("2000");
		d1.findElement(By.xpath(".//*[@id='u_0_4']")).click();*/
		d1.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver d2 = new ChromeDriver();
		d2.get("https://www.facebook.com/login/identify?ctx=recover&lwv=110");
		WebElement e1 = d2.findElement(By.xpath(".//*[@id='identify_email']"));
		e1.sendKeys("newemail@gmail.com");
		e1.clear();
		
		d2.findElement(By.xpath(".//*[@id='identify_email']")).sendKeys("sample.new@gmail.com");
		d2.findElement(By.name("did_submit")).click();
		
		
		d2.close();
	}

}
