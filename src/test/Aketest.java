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
import java.util.TreeSet;

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

import com.google.common.base.Joiner;

import edu.emory.mathcs.backport.java.util.Arrays;
 

public class Aketest {
	public static String getListFloderPath(String path) {
		List list = new ArrayList<String> ();
		File file = new File(getFloderPath(path));
		if (file.exists()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				if (file2.isFile()) {
					list.add("../../" + file2.toString());
				} 
			}
		}else{
			return "文件不存在...";
		}
		if(!list.isEmpty()){
			return Joiner.on(";").join(list);
		}else{
			return "没有截图文件...";
		}
	}
	
	public static String getFloderPath(String filePath){
		String newPath = filePath.replaceAll("\\\\", "/");
		int index = newPath.lastIndexOf('/');
		if(index != -1){
			return newPath.substring(0 , index + 1);
		}
		return newPath;
	}
	public static void main(String[] args) {
		
		String path = "result\\screenshot\\system\\Miniprogram_user\\002_setPower\\运行错误_2018_08_28_16_14_14.jpg";
		System.out.println(getListFloderPath(getFloderPath(path)));
		
	}
}
