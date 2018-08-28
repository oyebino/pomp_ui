package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestDB {

    @BeforeTest()
    public void beforeTest() {
    	
        System.out.println("@BeforeTest");
    }

    @AfterTest()
    public void afterTest() {
        System.out.println("@AfterTest");
    }

}