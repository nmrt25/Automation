package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class testbase {

	public Properties prop;
	public FileInputStream data;
	public WebDriver driver;
	public String browserName;
	public String env;
	public String envurl;
	public FileInputStream url;

	public testbase() throws IOException {

		
	}
	
	public void readproperties() throws IOException {
		prop = new Properties();
		data = new FileInputStream("src//main//java//base//data.properties");
		prop.load(data);
		browserName = prop.getProperty("browser");
		env = prop.getProperty("envn");	
	}

	@SuppressWarnings("deprecation")
	public WebDriver initializeBrowser() throws IOException {

	
			
			
			URL url = new URL ("http://localhost:4444/");
			ChromeOptions options = new ChromeOptions();
			System.out.println(options);
			RemoteWebDriver driver = new RemoteWebDriver(url, options);

		//driver.manage().deleteAllCookies();

		return driver;

	}

	public void getenvURL() throws IOException {
		if (env.equals("uat1")) {
			FileInputStream url = new FileInputStream("src//main//java//base//url.properties");
			prop.load(url);
			envurl = prop.getProperty("uat1");
			System.out.println("fromTestBase" + envurl);
		}

		driver.get(envurl);
	}
	
	
	public void getWindowshandles() {
		String expectedURL = "https://netregistry-dev-7.a2development.net/execute2/account/newinterface/tabs/overview-tab";

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		for (int i = 0; i < tabs.size(); i++) {
			if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL)) {
				break;
			}
			this.driver = driver;
		}

	}
}
