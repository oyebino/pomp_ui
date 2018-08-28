package test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.emory.mathcs.backport.java.util.Arrays;
 

public class Aketest {
private static WebDriver driver;
	
	@BeforeClass
	public static void before(){
		driver=new FirefoxDriver();
		driver.get("https://www.baidu.com");
		driver.manage().window().maximize();
		System.out.println("there are " + driver.getWindowHandles().size() + " window");
	}
	
	/*
	@Test
	public void getWindowMethod1(){
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL + "n").perform();
		switchToWindow("新标签页", driver);
		driver.get("http://www.sina.com.cn");
		System.out.println("there are " + driver.getWindowHandles().size() + " windows");
	}*/
	
	@Test
	public void getWindowMethod3(){
		//	String href = driver.findElement(By.partialLinkText("新闻")).getAttribute("href");
		JavascriptExecutor oJavaScriptExecutor = (JavascriptExecutor)driver;
		oJavaScriptExecutor.executeScript("window.open('http://10.10.18.66:8080/jiekou.html');");
		System.out.println("there are " + driver.getWindowHandles().size() + " windows");
	}
	
	@Test
	public void getWindowMethod2(){
		JavascriptExecutor oJavaScriptExecutor = (JavascriptExecutor)driver;
		oJavaScriptExecutor.executeScript("window.open();");
		System.out.println("there are " + driver.getWindowHandles().size() + " windows");
	}
	
/*	
	@AfterClass
	public static void after(){
		switchToWindow("模拟进出场",driver);
		driver.close();
		//driver.quit();
	}*/
	
	
	public static boolean switchToWindow(String windowTitle,WebDriver dr){  
	    boolean flag = false;  
	    try { 
	    	//将页面上所有的windowshandle放在入set集合当中
	        String currentHandle = dr.getWindowHandle();  
	        Set<String> handles = dr.getWindowHandles();  
	        for (String s : handles) {  
	            if (s.equals(currentHandle))  
	                continue;  
	            else {  
	            	dr.switchTo().window(s);
	        //和当前的窗口进行比较如果相同就切换到windowhandle
	        //判断title是否和handles当前的窗口相同
	                if (dr.getTitle().contains(windowTitle)) {  
	                    flag = true;  
	                    System.out.println("Switch to window: "  
	                            + windowTitle + " successfully!");  
	                    break;  
	                } else  
	                    continue;  
	            }  
	        }  
	    } catch (Exception e) {  
	        System.out.printf("Window: " + windowTitle  
	                + " cound not found!", e.fillInStackTrace());  
	        flag = false;  
	    }  
	    return flag;  
	}
}
