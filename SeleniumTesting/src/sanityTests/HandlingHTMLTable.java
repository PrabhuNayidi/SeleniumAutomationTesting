package sanityTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHTMLTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		
		c1.get("http://faculty.uml.edu/ahillier/");
		c1.manage().window().maximize();
		
		String value = c1.findElement(By.id("table8")).getText();
		System.out.println("The Cell value for the Specified Web Element is : " + value);
		
		WebElement table1 = c1.findElement(By.id("table9"));
		List <WebElement> l1 = table1.findElements(By.tagName("tr"));
		int rows = l1.size();
		System.out.println("The Number of Rows in the Specified HTML Table are : " + rows);
		
		List <WebElement> l2 = table1.findElements(By.tagName("td"));
		int cells = l2.size();
		System.out.println("The Number of Cells in the Specified HTML Table are : " + cells);
		
		Thread.sleep(3000);
		c1.quit();
	}

}
