package com.wymall.test.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;

import com.google.common.base.Joiner;
/**
 * @author eason.sun
 * @decription 动态生成各个模块中的每条用例的日志，运行完成用例之后请到result/log目录下查看
 * */
public class LogConfiguration {
	
		public static void initLog(String fileName){
			//获取到模块名字
			String founctionName = getMiddleStr(fileName,"\\.").replace('.', '/');
			String fileCase = getLastFloder(fileName);
			//声明日志文件存储路径以及文件名、格式
		    final String logFilePath  = "./result/log/"+founctionName+"/"+fileCase+".log";  
			Properties prop = new Properties();
			//配置日志输出的格式
			prop.setProperty("log4j.rootLogger","info, toConsole, toFile");
			prop.setProperty("log4j.appender.file.encoding","UTF-8" );
			prop.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
			prop.setProperty("log4j.appender.toConsole.Target","System.out");
			prop.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout ");
			prop.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");		
			prop.setProperty("log4j.appender.toFile", "org.apache.log4j.DailyRollingFileAppender");
			prop.setProperty("log4j.appender.toFile.file", logFilePath);
			prop.setProperty("log4j.appender.toFile.append", "false");
			prop.setProperty("log4j.appender.toFile.Threshold", "info");
			prop.setProperty("log4j.appender.toFile.layout", "org.apache.log4j.PatternLayout");
			prop.setProperty("log4j.appender.toFile.layout.ConversionPattern", "[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
			//使配置生效
			PropertyConfigurator.configure(prop);

		}
		
		
	    /**取得模块名字*/
	    public static String getFunctionName(String fileName){
			String functionName = null; 
			int firstUndelineIndex = fileName.indexOf("_"); 
			functionName = fileName.substring(0, firstUndelineIndex-4);
			return functionName;
	    
	}
	    
	    /**
	     * 获取目录路径
	     * @param src
	     * @param split
	     * @return
	     */
	    public static String getMiddleStr(String src, String split){
			String[] strs = src.split(split);
			List<String> dest = new ArrayList<String>();
			for(int i= 4; i< strs.length - 1; i++){
				dest.add(strs[i]);
			}
			if(!dest.isEmpty()){
				return Joiner.on(".").join(dest);
			}
			return "default";
		}
	    
	    /**
	     * 获取最后一个文件
	     * @param filePath
	     * @return
	     */
		public static String getLastFloder(String filePath){
			
			int index = filePath.lastIndexOf('.');
			
			if(index != -1){
				return filePath.substring(index + 1);
			}
			return filePath;
		}
}
