package test.aress.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Script3 {


public void method3() throws MalformedURLException{
//		
//	EdgeOptions EdgeOptions = new EdgeOptions();
//	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), EdgeOptions);
	ChromeOptions chromeOptions = new ChromeOptions();

	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
	driver.quit();
	}
}
