package sanityTests;

import org.openqa.selenium.By;

public class UserDefinedMethodsTestCase extends UserDefinedMethods
{
	public static void main(String[] args) 
	{
		UserDefinedMethodsTestCase o = new UserDefinedMethodsTestCase();
		o.launchBrowser();
		o.adminLogin("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/"))
			System.out.println("Redirected to the User Interface - Test Case Passed");
		else
			System.out.println("Not Redirected to the User Interface - Test Case Failed");
		o.closeBrowser();
	}
}
