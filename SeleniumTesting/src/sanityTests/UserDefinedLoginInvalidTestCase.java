package sanityTests;

import org.openqa.selenium.By;

public class UserDefinedLoginInvalidTestCase extends UserDefinedMethods
{
	public static void main(String[] args) {
		UserDefinedLoginInvalidTestCase o = new UserDefinedLoginInvalidTestCase();
		o.launchBrowser();
		o.adminLogin("admin", "admin123");
		String errorMessage = driver.findElement(By.className("messageStackError")).getText();
		System.out.println(errorMessage);
		if (errorMessage.contains(" Error: Invalid administrator login attempt."))
			System.out.println("Admin Login was Successful - Test Case Failed");
		else
			System.out.println("Admin Login was Unsuccessful - Test Case Passed");
		o.closeBrowser();
	}
}
