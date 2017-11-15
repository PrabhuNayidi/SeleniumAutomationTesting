package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextArea {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		c1.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		c1.manage().window().maximize();
		String s = c1.findElement(By.xpath("//*[@id='headingText']")).getText();
		System.out.println(s);
		c1.findElement(By.className("RveJvd")).click();
		String emsg = c1.findElement(By.className("dEOOab")).getText();
		System.out.println(emsg);
		c1.quit();
	}

}
