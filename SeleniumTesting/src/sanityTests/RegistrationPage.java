package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage 
{
	public static WebDriver driver;
	public static int browser;
	public static String browserName;
	
	public static void main(String[] args) throws InterruptedException 
	{
		for (browser = 1; browser <= 2; browser++)
		{
			if (browser == 1)
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Google Chrome Web Browser");
				
				driver.get("http://gcrit.com/build3/");
				driver.manage().window().maximize();
				
				driver.findElement(By.linkText("create an account")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
				driver.findElement(By.name("firstname")).sendKeys("John");
				driver.findElement(By.name("lastname")).sendKeys("Doe");
				driver.findElement(By.id("dob")).sendKeys("01/01/1999");
				driver.findElement(By.name("email_address")).sendKeys("johndoe@sample.com");
				
				driver.findElement(By.name("street_address")).sendKeys("1528 33rd St NW, Apt 138");
				driver.findElement(By.name("postcode")).sendKeys("20007");
				driver.findElement(By.name("city")).sendKeys("Washington");
				driver.findElement(By.name("state")).sendKeys("DC");
				Select countryDropdown = new Select (driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")));
				countryDropdown.selectByVisibleText("United States");
				
				driver.findElement(By.name("telephone")).sendKeys("2028657824");
				
				driver.findElement(By.name("password")).sendKeys("Sample@123xyz");
				driver.findElement(By.name("confirmation")).sendKeys("Sample@123xyz");
				
				driver.findElement(By.id("tdb4")).click();
				
				System.out.println("The Current URL is : " + driver.getCurrentUrl());
				
				String confirmationMessage = driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
				
				if (confirmationMessage.equals("Your Account Has Been Created!"))
				{
					System.out.println("Customer Account Registration was Successfull - Test Case Passed!");
				}
				else
				{
					System.out.println("Customer Account Registration was Unsuccessfull - Test Case Failed!!");
				}
				
				Thread.sleep(2000);
				
				driver.quit();
			}
			
			else if (browser == 2)
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("Firefox Web Browser");
				
				driver.get("http://gcrit.com/build3/");
				driver.manage().window().maximize();
				
				driver.findElement(By.linkText("create an account")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
				driver.findElement(By.name("firstname")).sendKeys("Jane");
				driver.findElement(By.name("lastname")).sendKeys("Doe");
				driver.findElement(By.id("dob")).sendKeys("01/01/1999");
				driver.findElement(By.name("email_address")).sendKeys("janedoe@sample.com");
				
				driver.findElement(By.name("street_address")).sendKeys("1528 33rd St NW, Apt 138");
				driver.findElement(By.name("postcode")).sendKeys("20007");
				driver.findElement(By.name("city")).sendKeys("Washington");
				driver.findElement(By.name("state")).sendKeys("DC");
				Select countryDropdown = new Select (driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")));
				countryDropdown.selectByVisibleText("United States");
				
				driver.findElement(By.name("telephone")).sendKeys("2028657824");
				
				driver.findElement(By.name("password")).sendKeys("Sample@123xyz");
				driver.findElement(By.name("confirmation")).sendKeys("Sample@123xyz");
				
				driver.findElement(By.id("tdb4")).click();
				
				System.out.println("The Current URL is : " + driver.getCurrentUrl());
				
				String confirmationMessage = driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
				
				if (confirmationMessage.equals("Your Account Has Been Created!"))
				{
					System.out.println("Customer Account Registration was Successfull - Test Case Passed!");
				}
				else
				{
					System.out.println("Customer Account Registration was Unsuccessfull - Test Case Failed!!");
				}
				
				Thread.sleep(2000);
				
				driver.quit();
			}
			
		}
	}

}
