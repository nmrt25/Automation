package test.aress.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Script2 {

@Test
public void method2() throws MalformedURLException{
		
//	FirefoxOptions firefoxOptions = new FirefoxOptions();
//	
//	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444//ui"), firefoxOptions);
	ChromeOptions chromeOptions = new ChromeOptions();

	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), chromeOptions);
	driver.get("https://www.gmail.com");
	System.out.println(driver.getTitle());
	driver.quit();
	}
}
