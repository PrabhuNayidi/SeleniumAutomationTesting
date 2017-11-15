package sanityTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsHandling1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver f1 = new FirefoxDriver();
		f1.get("https://www.youtube.com/");
		
		String title = f1.getTitle();
		System.out.println("The Title of the Current Web Page is : " + title);
		
		String url = f1.getCurrentUrl();
		System.out.println("The URL of Current Web Page is : " + url);
		
		/*String pagesource = f1.getPageSource();
		System.out.println("The Page Source for the Current Web Page is : " + pagesource);*/
	
		String windowhandle = f1.getWindowHandle();
		System.out.println("The Window Handle for the Current Web Page is : " + windowhandle);
		
		f1.navigate().to("https://www.google.com/");
		System.out.println("The Current Web Page's URL is : " + f1.getCurrentUrl());
		
		f1.navigate().back();
		System.out.println("The URL of Current Web Page is : " + f1.getCurrentUrl());
		
		f1.navigate().forward();
		System.out.println("The Current Web Page's URL is : " + f1.getCurrentUrl());
		
		f1.close();
	}

}
