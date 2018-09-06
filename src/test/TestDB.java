package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestDB {
	public static void main(String[] args) {
		String flat = "false";
		Boolean fa = Boolean.parseBoolean(flat);
		System.out.println(fa);
	}
}