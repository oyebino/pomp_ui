package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class My {

	public static WebDriver getChromeDriver(WebDriver driver) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		try {
			return driver = new RemoteWebDriver(new URL("http://193.168.1.156:5558/wd/hub/"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		WebDriver driver = null;
		getChromeDriver(driver).get("https://www.baidu.com");
	}

}
