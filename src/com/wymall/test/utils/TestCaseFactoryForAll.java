package com.wymall.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import jxl.read.biff.BiffException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import com.google.common.base.Joiner;

import edu.emory.mathcs.backport.java.util.Arrays;

/**
 * 
 * @author xy-incito-wy
 * @Description 自动生成测试代码的工具类,生成所有模块的测试类
 *
 */
public class TestCaseFactoryForAll {

	public static void main(String[] args) {
		File sourceFile = null;
		String sheetName = null;
		int sheetNum = 0;
		Set<String> floderName = new TreeSet();
		
		for (String file : getListFloder("res/testcase",floderName)) {
			String caseFolder = "src/com/wymall/test/testcases/";
			String fatherFunction = getMiddleStr(file,"/");
			caseFolder = caseFolder + fatherFunction + "/";
			String excelCasePath = "res/testcase/" + fatherFunction;
			for (int i = 0; i < getFunctionNum(file); i++) { // 第一层循环 取得模块的个数
				try {

					String functionName = getFunctionName(excelCasePath, i);// 获得每轮循环的
																			// 模块名

					functionName = functionName.replaceFirst(functionName.substring(0, 1),
							functionName.substring(0, 1).toLowerCase());
					// 如果包名不存在，就新建
					File functionPackage = new File(caseFolder + "/" + functionName);
					if (functionPackage.exists()) {
						System.out.println(functionName + "包已经存在，自动跳过！");
						System.out.println("正在生成用例到" + functionName + "包下，请稍等...");
					} else {
						functionPackage.mkdirs();
						System.out.println(functionName + "包已创建！");
						System.out.println("正在生成用例到" + functionName + "包下，请稍等...");
					}

					for (int j = 0; j < getSheetNum(getExcelRelativePath(excelCasePath, i)); j++) { // 第二层循环，根据传入的模块文件路径获得
						// 模块中sheet数量
						// 也就是用例个数
						if (j == getSheetNum(getExcelRelativePath(excelCasePath, i)) - 1) {

							break;
						}
						try {
							sheetName = getSheetName(j + 1, getExcelRelativePath(excelCasePath, i)); // 取得sheetName
							// 只进行一次全局异常捕获
							sheetNum = getSheetNum(getExcelRelativePath(excelCasePath, i));
						} catch (BiffException e1) {
							e1.printStackTrace();
						}
						sourceFile = new File(caseFolder
								+ functionName.replaceFirst(functionName.substring(0, 1),
										functionName.substring(0, 1).toLowerCase())
								+ File.separator
								+ functionName.replaceFirst(functionName.substring(0, 1),
										functionName.substring(0, 1).toUpperCase())
								+ "Page_" + sheetName + "_Test.java");// 创建测试用例源码，指定存放路径
						FileWriter writer = new FileWriter(sourceFile);

						// 生成测试用例代码的头文件
						writer.write("package com.wymall.test.testcases." + fatherFunction.replaceAll("/", ".") + "." + functionName + "; \n"
								+ "import org.testng.annotations.Test; \n"
								+ "import com.wymall.test.base.BaseParpare; \n "
								+ "import com.wymall.test.utils.SuperAction; \n" + "public class "
								+ functionName.replaceFirst(functionName.substring(0, 1),
										functionName.substring(0, 1).toUpperCase())
								+ "Page_" + sheetName + "_Test extends BaseParpare{ \n");

						// @Test的主体部分，也就是测试用例的方法
						String firstLetter = sheetName.substring(sheetName.indexOf("_") + 1).substring(0, 1);
						String others = sheetName.substring(sheetName.indexOf("_") + 1).substring(1);
						String function = firstLetter.toLowerCase() + others;
						writer.write(
								"@Test \n" + " public void" + " " + function + "() { \n" + "SuperAction.parseExcel(\"" + fatherFunction +"/"
										+ functionName.replaceFirst(functionName.substring(0, 1),
												functionName.substring(0, 1).toUpperCase())
										+ "\",\"" + sheetName + "\",seleniumUtil);\n" + " }\n");

						// 代码结尾大括号
						writer.write("}");
						writer.close();
					}
				} catch (IOException e) {
					Assert.fail("IO异常", e);
				}
				System.out.println("模块[" + getFunctionName(excelCasePath, i) + "] 的用例已经生成完毕，共计：" + (sheetNum - 1)
						+ "条，请到" + caseFolder + getFunctionName(excelCasePath, i).toLowerCase() + "路径下查阅！");
			}
		}
	}

	/**
	 * 获得当前路径下模块下excel文件个数
	 * 
	 * @return 得到模块的个数
	 */
	public static int getFunctionNum(String path) {
	//	String path = "res/testcase";
		File file = new File(path);
		int i = 0;
		File[] array = file.listFiles();
		for(File arr : array){
			if(arr.isFile()){
				i++;
			}
		}
		return i;
	}

	/**
	 * 获得模块名字 也就是excel 表名
	 * 
	 * @param 循环模块名称的角标
	 * @return 得到对应index的模块名字
	 */
	public static String getFunctionName(String excelCasePath,int index) {
		String functionName = "";
		// get file list where the path has
		File file = new File(excelCasePath);
		// get the folder list
		File[] array = file.listFiles();
		if (array[index].isFile()) {
			functionName = array[index].getName().substring(0,
					array[index].getName().lastIndexOf("."));
		}

		return functionName;
	}

	/**
	 * 获得excel的相对路径
	 * 
	 * @param 循环模块名称的角标
	 * @return 得到对应index的模块名字
	 */
	public static String getExcelRelativePath(String excelCasePath,int index) {
		String functionName = "";
		// get file list where the path has
		File file = new File(excelCasePath);
		// get the folder list
		File[] array = file.listFiles();
		functionName = array[index].getPath();
		return functionName;
	}

	/**
	 * 获得当前excel的sheet数量 - 每个模块的用例数
	 * 
	 * @param filePath
	 *            文件路径
	 * @return 获得excel的sheet数量
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static int getSheetNum(String filePath)
			throws FileNotFoundException, IOException {
		int casesNum = 0;
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(
				filePath)));
		casesNum = workbook.getNumberOfSheets();

		return casesNum;
	}

	/**
	 * 
	 * @param sheetIndex
	 *            sheet的位置
	 * @param filePath
	 *            excel文件路径相对的
	 * @return 返回sheet的名字
	 * @throws BiffException
	 * @throws IOException
	 */
	public static String getSheetName(int sheetIndex, String filePath)
			throws BiffException, IOException {
		String casesName = "";
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(filePath));
		casesName = workbook.getSheetName(sheetIndex);

		return casesName;

	}
	public static String getLastFloder(String filePath){
		String newPath = filePath.replaceAll("\\\\", "/");
		
		int index = newPath.lastIndexOf('/');
		
		if(index != -1){
			return newPath.substring(index + 1);
		}
		return newPath;
	}
	
	/**
	 * 获取所有的模块路径
	 * @param path
	 * @param list
	 * @return
	 */
	public static Set<String> getListFloder(String path,Set<String> list) {
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				if (file2.isFile()) {
					list.add(getFloderPath(file2.toString()));
				} else {
					getListFloder(file2.toString(),list);
				}
			}
		}else{
			System.out.println("文件不存在...");
		}
		return list;
	}
	
	/**
	 * 获取文件名的路径
	 * @param filePath
	 * @return
	 */
	public static String getFloderPath(String filePath){
		String newPath = filePath.replaceAll("\\\\", "/");
		
		int index = newPath.lastIndexOf('/');
		
		if(index != -1){
			return newPath.substring(0 , index + 1);
		}
		return newPath;
	}
	
	/**
	 * 
	 * @param src
	 * @param split
	 * @return
	 */
	public static String getMiddleStr(String src, String split){
		String[] strs = src.split(split);
		List<String> dest = new ArrayList<String>();
		for(int i= 2; i< strs.length; i++){
			dest.add(strs[i]);
		}
		if(!dest.isEmpty()){
			return Joiner.on("/").join(dest);
		}
		return "default";
	}
}
