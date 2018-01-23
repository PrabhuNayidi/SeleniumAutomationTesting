package sanityTests;

public class UserDefinedLoginValidTestCase extends UserDefinedMethods
{
	public static void main(String[] args) {
		UserDefinedLoginValidTestCase o =new UserDefinedLoginValidTestCase();
		o.launchBrowser();
		o.adminLogin("admin", "admin@123");
		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
			System.out.println("Admin Login was Successful - Test Case Passed");
		else
			System.out.println("Admin Login was Unsuccessful - Test Case Failed");
		o.closeBrowser();
	}
}
