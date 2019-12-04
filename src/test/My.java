package test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class My {
	
	public static final String bytesToHexString(byte[] bArray){
		StringBuffer sb = new StringBuffer(bArray.length);
		for(int i =0;i<bArray.length;i++){
			String sTemp = Integer.toHexString(0xFF & bArray[i]);
			if (sTemp.length()<2){
				sb.append(0);
			}
			sb.append(sTemp.toUpperCase());
		}
			return sb.toString();	
	}
	
	public static String getSign(String key, String date, String secret)
		throws UnsupportedEncodingException
		  {
		    String signStr = key + ":" + date + ":" + secret;
		    System.out.println(signStr.toString());
		    MessageDigest md5 = null;
		    try
		    {
		      md5 = MessageDigest.getInstance("MD5");
		    }
		    catch (NoSuchAlgorithmException e)
		    {
		      e.printStackTrace();
		    }
		    System.out.println("sign:" + signStr.toString());
		    
		    byte[] newstr = md5.digest(signStr.toString().getBytes("utf-8"));
		    
		    String ret = bytesToHexString(newstr).toLowerCase();
		    System.out.println("签名后的sign是:" + ret);
		    
		    return ret;
		  } 

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
	public String getSomething(){
		String i ="123";
		if(i.equals("123")){
			return "123";
		}
		return "123456";
	}

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//		String a ="1;2;5;7;8;9";
//		String b[] = a.split(";");
//		System.out.println(b[3]);
		System.out.println(new My().getSomething());
	}

}
