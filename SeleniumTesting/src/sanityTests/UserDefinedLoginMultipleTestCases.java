package sanityTests;

import org.openqa.selenium.By;

public class UserDefinedLoginMultipleTestCases extends UserDefinedMethods
{
	public static void main(String[] args) 
	{
		UserDefinedLoginMultipleTestCases o = new UserDefinedLoginMultipleTestCases();
		
		//Test Case I
		o.launchBrowser();
		o.adminLogin("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/"))
			System.out.println("Test Case I :: Redirected to the User Interface - Test Case Passed");
		else
			System.out.println("Test Case I :: Not Redirected to the User Interface - Test Case Failed");
		o.closeBrowser();
		
		//Test Case II
		o.launchBrowser();
		o.adminLogin("admin", "admin@123");
		String url1 = driver.getCurrentUrl();
		if (url1.contains("http://www.gcrit.com/build3/admin/index.php"))
			System.out.println("Test Case II :: Admin Login was Successful - Test Case Passed");
		else
			System.out.println("Test Case II :: Admin Login was Unsuccessful - Test Case Failed");
		o.closeBrowser();
		
		//Test Case III
		o.launchBrowser();
		o.adminLogin("admin", "admin123");
		String errorMessage = driver.findElement(By.className("messageStackError")).getText();
		System.out.println(errorMessage);
		if (errorMessage.equals(" Error: Invalid administrator login attempt."))
			System.out.println("Test Case III :: Admin Login was Successful - Test Case Failed");
		else
			System.out.println("Test Case III :: Admin Login was Unsuccessful - Test Case Passed");
		o.closeBrowser();
		
	}
}
