package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.base.Joiner;

import edu.emory.mathcs.backport.java.util.Arrays;
 

public class AkeTest {
	static WebDriver driver;
	// 启用远程调用chrome
    public static WebDriver createRemoteChromeDriver() {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
     //   capability.setVersion("62");
        capability.setPlatform(Platform.WINDOWS);
        try {
            driver = new RemoteWebDriver(new URL("http://172.18.10.41:11450/wd/hub"), capability);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return driver;
    }

	
	public static void main(String[] args) {
		WebDriver driver = createRemoteChromeDriver();

		driver.get("http://www.baidu.com");
		WebElement baiduInput = driver.findElement(By.id("kw"));
		baiduInput.sendKeys("Cherry_chrome");
		WebElement btnSearch = driver.findElement(By.id("su"));
		btnSearch.click();
		try {
			WebElement CherrySearchResult = driver.findElement(By.cssSelector(".op_dict3_font24.op_dict3_marginRight"));
			System.out.println("Find search result Successfully!");
		} catch (NoSuchElementException e) {
			System.out.println("Can't find search result!, Search failed!");
		}
	}
}
