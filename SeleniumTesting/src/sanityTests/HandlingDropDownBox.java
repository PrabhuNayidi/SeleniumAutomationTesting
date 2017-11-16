package sanityTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		
		c1.get("https://recipesfoodandcooking.com/");
		c1.manage().window().maximize();
		
		Select dd1 = new Select(c1.findElement(By.id("cat")));
		dd1.selectByIndex(7);
		Thread.sleep(4000);
		
		c1.navigate().back();
		dd1= new Select(c1.findElement(By.id("cat")));
		dd1.selectByIndex(15);
		
		c1.navigate().back();
		dd1 = new Select(c1.findElement(By.id("cat")));
		dd1.selectByVisibleText("Christmas");
		
		c1.navigate().back();
		
		dd1 = new Select(c1.findElement(By.id("cat")));
		List<WebElement> l1 = dd1.getOptions();
		int itemscount = l1.size();
		System.out.println("The Total Number of Categories in Recipies, Food and Cooking Website is : " + itemscount);
		
		c1.navigate().back();
		System.out.println("The Displayed Status of the Speccified Drop Down Box is : " + c1.findElement(By.id("cat")).isDisplayed());
		System.out.println("The Enabled Status of the Speccified Drop Down Box is : " + c1.findElement(By.id("cat")).isEnabled());
		
		Thread.sleep(2000);
		c1.quit();
	}

}
