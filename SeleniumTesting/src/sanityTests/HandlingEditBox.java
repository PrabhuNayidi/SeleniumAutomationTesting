package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingEditBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//f1.findElement(By.id("identifierId")).sendKeys("name@gmail.com");
		//f1.findElement(By.name("identifier")).sendKeys("name@gmail.com");
		//f1.findElement(By.className("whsOnd")).sendKeys("name@gmail.com");
		//f1.findElement(By.tagName("input")).sendKeys("name@gmail.com");
		//f1.findElement(By.cssSelector(".whsOnd")).sendKeys("name@gmail.com");
		//f1.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("name@gmail.com");
		
		WebElement eb1 = f1.findElement(By.xpath(".//*[@id='identifierId']"));
		eb1.sendKeys("samplename@gmail.com"); //Enter a value into a Text Box.
		System.out.println("The Existing value in the Selected Edit Box is : " + eb1.getText());
		Thread.sleep(3000);
		eb1.clear(); //Clear the existing value.
		
		System.out.println("The Return type of the Selected Edit Box is : " + eb1.getAttribute("type"));;//Return Type of the Object
		
		System.out.println("The Displayed Status of the Selected Edit Box is : " + eb1.isDisplayed());
		
		System.out.println("The Enabled Status of the Selected Edit Box is : " + eb1.isEnabled());
		
		f1.quit();
	}

}
