package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {
	
	 public static final String USERNAME = "merwyn_n";
	 public static final String ACCESS_KEY = "c50b0efb797a43b6a34ae66a16f7ac9b";
	 public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 7");
		browserOptions.setCapability("browserVersion", "78.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
		/*DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platformName", "Windows 7");
	    caps.setCapability("browserVersion", "76.0");*/
		
		WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), browserOptions);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
