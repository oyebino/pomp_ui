package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.base.Joiner;

import jxl.read.biff.BiffException;

/**
 * 
 * @author xy-incito-wy
 * @Description 自动生成测试代码的工具类,生成所有模块的测试类
 *
 */
public class Autotest {
	public static Set<String> getListFloder(String path,Set<String> list) {
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				if (file2.isFile()) {
					//System.out.println("文件夹:" + file2.getAbsolutePath());
					list.add(file2.getAbsolutePath());
				//	list.add(getMiddleStr(file2.toString().replaceAll("\\\\", "/"),"/"));
				} else {
				//	System.out.println("文件:" + file2.getAbsolutePath());
					getListFloder(file2.getAbsolutePath(),list);
				}
			}
		}else{
			System.out.println("文件不存在...");
		}
		return list;
	}
	
	public static int getSheetNum(String filePath)
			throws FileNotFoundException, IOException {
		int casesNum = 0;
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(
				filePath)));
		casesNum = workbook.getNumberOfSheets();

		return casesNum;
	}
	
	public static String getSheetName(int sheetIndex, String filePath)
			throws BiffException, IOException {
		String casesName = "";
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(filePath));
		casesName = workbook.getSheetName(sheetIndex);

		return casesName;

	}
	

   public static void main(String[] args) throws FileNotFoundException, IOException, BiffException {
	   Autotest a=new Autotest();
		Set<String> list = new TreeSet<String>();
		String path = "D:/uiProject/autotest_wymall_backend/src/com/wymall/test/testcases";
		a.getListFloder(path,list);
		for(Iterator iter = ((TreeSet<String>) list).descendingIterator(); iter.hasNext(); ) { 
		    
		    System.out.println(iter.next());
		}
   }
}
