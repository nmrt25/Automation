package test.aress.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Script1 {
	
@Test
public void method1() throws MalformedURLException{
		
	ChromeOptions chromeOptions = new ChromeOptions();

	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), chromeOptions);
	driver.get("http://www.google.com");
	driver.quit();
		
		
	}
}
