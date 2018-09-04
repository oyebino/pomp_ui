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
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
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
 

public class Aketest {
	WebDriver driver = null;
	public void createChromeDriver(String url){
		 DesiredCapabilities capability = DesiredCapabilities.chrome();
	        capability.setBrowserName("chrome");
	        capability.setPlatform(Platform.WINDOWS);
	        try {
	            driver = new RemoteWebDriver(new URL("http://172.18.40.10:4444/wd/hub"), capability);
	        } catch (MalformedURLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	         driver.get(url);;
	}
	
	public static void main(String[] args) {
		Aketest a = new Aketest();
		a.createChromeDriver("http://47.106.221.58:5002/#/login");
	}
}
