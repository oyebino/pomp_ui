package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestDB {
    public static void main(String[] args) {
        String flat = " 完成操作";
        System.out.println((flat.subSequence(0, 1)).equals(" "));
    }
}