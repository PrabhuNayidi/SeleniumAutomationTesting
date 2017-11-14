package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.amazon.com/");
		String t1 = f1.getTitle();
		System.out.println("The Title of the Crrent Web Page in Firefox Window is : " + t1);
		/*String pageSource1 = f1.getPageSource();
		System.out.println(pageSource1);*/
		String url1 = f1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Firefox Window is : " + url1);
		
		f1.navigate().to("https://www.google.com/");
		url1 = f1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Firefox Window is : " + url1);
		
		f1.navigate().back();
		url1 = f1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Firefox Window is : " + url1);
		
		f1.navigate().forward();
		url1 = f1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Firefox Window is : " + url1);
		
		f1.navigate().refresh();
		url1 = f1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Firefox Window is : " + url1);
		
		f1.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		f1.findElement(By.id("identifierNext")).click();
		
		f1.get("https://www.facebook.com/");
		boolean val1 = f1.findElement(By.className("inputtext")).isEnabled();
		if (val1 == true)
		{
			System.out.println("The Username Text box in Facebook Login Page was Enabled");
		}
		else
		{
			System.out.println("Please Enable the Username Text Box for Facebook Login Page!");
		}
		
		f1.get("https://www.facebook.com/");
		boolean val2 = f1.findElement(By.name("pass")).isDisplayed();
		if (val2 == true)
		{
			System.out.println("The Password Text box in Facebook Login Page was Displayed");
		}
		else
		{
			System.out.println("Please Display the Password Text Box for Facebook Login Page!");
		}
		
		f1.get("https://twitter.com/signup");
		boolean val3 = f1.findElement(By.className("use-cookie-personalization-field")).isSelected();
		if (val3 == true)
		{
			System.out.println("The Option 'Personalize Twitter based on where you've seen Twitter content on the web' was Selected");
		}
		else
		{
			System.out.println("Please Select the Option 'Personalize Twitter based on where you've seen Twitter content on the web'!");
		}
		/*f1.findElement(By.className("use-cookie-personalization-field")).click();
		val3 = f1.findElement(By.className("use-cookie-personalization-field")).isSelected();
		if (val3 == true)
		{
			System.out.println("The Option 'Personalize Twitter based on where you've seen Twitter content on the web' was Selected");
		}
		else
		{
			System.out.println("Please Select the Option 'Personalize Twitter based on where you've seen Twitter content on the web'!");
		}*/
		
		f1.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		c1.get("https://www.bestbuy.com/");
		c1.manage().window().maximize();
		String t2 = c1.getTitle();
		System.out.println("The Title of the Crrent Web Page in Chrome Window is : " + t2);
		/*String pageSource2 = c1.getPageSource();
		System.out.println(pageSource2);*/
		String url2 = c1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Chrome Window is : " + url2);
		
		c1.navigate().to("https://www.staples.com/");
		url2 = c1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Chrome Window is : " + url2);
		
		c1.navigate().back();
		url2 = c1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Chrome Window is : " + url2);
		
		c1.navigate().forward();
		url2 = c1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Chrome Window is : " + url2);
		
		c1.navigate().refresh();
		url2 = c1.getCurrentUrl();
		System.out.println("The Current URL of the Web Page in the Chrome Window is : " + url2);
		
		c1.get("https://www.google.com/");
		c1.findElement(By.id("lst-ib")).sendKeys("United States of America");
		c1.findElement(By.id("lst-ib")).clear();
		c1.findElement(By.linkText("Privacy")).click();
		
		c1.close();
	}

}
