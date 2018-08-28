package com.wymall.test.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.wymall.test.utils.actions.ActionType;
import com.wymall.test.utils.actions.ParamConstant;
import com.wymall.test.utils.commons.xml.XmlHander;
import com.wymall.test.utils.xmlpersistence.XmlDao;
/**
 * 
 * @author xy-incito-wy
 * @Description 把Selenium操作的变成关键字操作
 *
 */
public class SuperAction {
	public static Logger logger = Logger.getLogger(SuperAction.class.getName());
	//static  String pageFilePath = "res/page/PageElements.xlsx";
	static String pageFileDir = "res/page/";
	public static String commonDataFileDir  = System.getProperty("user.dir")+File.separator+"data"+File.separator+"commonData.xml";
	public static Alert a = null;
	public static String pluginPth="//ACTIONS";
	public static HashMap<String,String> actionMap = new HashMap<String,String>();
	public static HashMap<String,String> commonDataValueMap = new HashMap<String,String>();
	public static HashMap<String,String> caseDataValueMap = new HashMap<String,String>();
	
	static {
		 initActionMap();
		 initCommonData(commonDataValueMap,commonDataFileDir,"//root");
	}
	
	/**
	 * 初始化操作类型Map
	 * 
	 */
	public static void initActionMap(){
		//读取action的xml配置文件
		XmlDao xmlaction=new XmlDao();
		XmlHander xmlhander=new XmlHander();
		try {
			xmlhander.loadXML(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"config"+File.separator+"actionkey.xml")));
			xmlhander.visitNode(pluginPth);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<Map> actionList = xmlaction.getDatas(xmlhander, pluginPth, false);
		for(Map curActionMap : actionList){
			String key = (String) curActionMap.get("name");
			String clazzName = (String) curActionMap.get("class");
			actionMap.put(key, clazzName);
		}
	}
	
	/**
	 * 
	 * @param locateWay 定位方式
	 * @param locateValue 定位的方式的具体值
	 * @return 定位的方式（By）
	 */
	public static By getLocateWay(String locateWay,String locateValue){
		 By elementLocator=null;
		 	if(locateWay.equalsIgnoreCase("xpath")){
		 		elementLocator=By.xpath(locateValue);
		 	}
		 	else if(locateWay.equalsIgnoreCase("className")){
		 		elementLocator=By.className(locateValue);
		 	}
		 	else if(locateWay.equalsIgnoreCase("id")){
		 		elementLocator=By.id(locateValue);
		 	}
		 	else	if(locateWay.equalsIgnoreCase("linktext")){
		 		elementLocator=By.linkText(locateValue);
		 	}
		 	else	if(locateWay.equalsIgnoreCase("name")){
		 		elementLocator=By.name(locateValue);
		 	}
		 	else	if(locateWay.equalsIgnoreCase("css")){
		 		elementLocator=By.cssSelector(locateValue);
		 	}
		 	else	if(locateWay.equalsIgnoreCase("tagname")){
		 		elementLocator=By.tagName(locateValue);
		 	}
		 	else{
		 		Assert.fail("你选择的定位方式：["+locateWay+"] 不被支持!");
		 	}
		 	return elementLocator;
		 }
	

	/**
	 * 
	 * @param sheet - 测试用例表中的sheet
	 * @param rowIndex - 测试用例表中的行index
	 * @param locateColumnIndex - 测试用例表中的定位列的index
	 * @return 从page表中 返回定位方式和定位值
	 * @Description 根据testcase中的元素定位列，去取得page页中的 定位方式和定位值
	 */
	public static String[] getPageElementLocator(Sheet sheet,int rowIndex,int locateColumnIndex,String pageName){

			XSSFWorkbook pageBook = null;
			//定位方式
			String elementLocatorWay = null;
			//定位值
			String elementLocatorValue = null;
			//sheet表
			Sheet pageSheet = null;
			//page excel路径
			String pageFilePath = "";
			String pageFileName = pageName.trim()+".xlsx";
			FloderUtil floder = new FloderUtil();
			for(String pageFile: (LinkedList<String>) floder.getListFloder(pageFileDir)){
				if(floder.getLastFloder(pageFile).toLowerCase().equals(pageFileName.toLowerCase())){
					pageFilePath = pageFile;
					break;
				}
			}
			//获取定位列的值
			String locator = sheet.getRow(rowIndex).getCell(locateColumnIndex).getStringCellValue();
			//用.分割开元素定位值
			String locatorSplit[] = locator.split("\\.");
		try {
			pageBook = new XSSFWorkbook(new FileInputStream(new File(pageFilePath)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

		  pageSheet =  pageBook.getSheetAt(0); //取得第一个sheet
		 int pageRowNum =  pageSheet.getPhysicalNumberOfRows();//获得这个sheet的实际有效行数
		 for (int j = 0; j < pageRowNum; j++) {
			 //如果获取到的别名和指定的别名相同，就存储当前行的定位值和定位方式
			if(pageSheet.getRow(j).getCell(0).getStringCellValue().equalsIgnoreCase(locatorSplit[1])){
				 elementLocatorWay = pageSheet.getRow(j).getCell(1).getStringCellValue();
				 elementLocatorValue = pageSheet.getRow(j).getCell(2).getStringCellValue();
				break;
			}
		}
		return new String[]{elementLocatorWay,elementLocatorValue};
	
	}
	/**
	 * @param founction
	 *            excel文件的名字
	 * @param caseName
	 *            excel中sheet的名字
	 * @param seleniumUtil
	 *            引用seleniumUtil
	 * @Description 读取excel中每个sheet的操作步骤，进而生成测试用例
	 * */
	public static void parseExcel(String founction, String caseName, SeleniumUtil seleniumUtil) {
		FileInputStream filePath = null;
		XSSFWorkbook workbook = null;
		String locateSplit[]  = null;//页面sheet中的定位方式和定位值拆解
		String locateSplitType = null;
		String locateSplitValue = null;
		String locator = null;//用例页面的定位列
		String file = "res/testcase/" + founction + ".xlsx";
		String screenShot_dir = System.getProperty("user.dir")+File.separator+"result"+File.separator+"screenshot"+File.separator+founction+File.separator+caseName;
		String log_dir = System.getProperty("user.dir")+File.separator+"data"+File.separator+"founction"+File.separator+caseName;
		
		FloderUtil fileUtil = new FloderUtil();
		fileUtil.delAllFile(screenShot_dir);
		fileUtil.delAllFile(log_dir);
			
		try {
			filePath = new FileInputStream(file);// 读取功能模块
		} catch (FileNotFoundException e) {
			logger.error("文件：" + file + "不存在");
			Assert.fail("文件：" + file + "不存在");
		}
		try {
			workbook = new XSSFWorkbook(filePath);
		} catch (IOException e) {
			logger.error("IO异常");
			Assert.fail("IO异常");
		}
		/**取得指定的case名字*/
		Sheet sheet = workbook.getSheet(caseName);
		/**获得的实际行数*/
		int rows = sheet.getPhysicalNumberOfRows(); 
		/** excel中的测试数据*/
		String testData = null;
		//获取首行的单元格数
		int cellsNumInOneRow = sheet.getRow(0).getPhysicalNumberOfCells();
		//声明一个数组存储列值的角标
		String column[] = new String[cellsNumInOneRow];
		//声明一个迭代器
		Iterator<Cell> cell = sheet.getRow(0).iterator();
		int ii =0;
		while(cell.hasNext()){
			column[ii]= String.valueOf(cell.next()); 
			ii++;
		}
		//定义动作列的角标
		int actionColumnIndex =0;
		//定义元素定位列的角标
		int locateColumnIndex = 0;
		//定义测试数据列的角标
		int testDataColumnIndex = 0;
		//动态获取这几个关键列所在位置
		 for (int i = 0; i < column.length; i++) {
			 if(column[i].equals("动作")){
				 actionColumnIndex = i;
			 }
			 if(column[i].equals("元素定位")){
				 locateColumnIndex = i;
			 }
			 if(column[i].equals("测试数据")){
				 testDataColumnIndex = i;
			 }
			
		}
		
		Map paramMap = new HashMap();
		paramMap.put(ParamConstant.SELENIUM_UTIL, seleniumUtil);
		
			// 循环每行的操作，根据switch来判断每行的操作是什么，然后转换成具体的代码，从第二行开始循环，因为第一行是列的说明数据。	
		
		for (int i = 1; i < rows; i++) {
			try {
			//正在解析excel:[monthticket/MonthTicketManager.xlsx]中的sheet(用例)：[001_addInternalTicket]的第1行步骤...	
			//	logger.info("正在解析excel:[" + founction + ".xlsx]中的sheet(用例)：[" + caseName + "]的第" + i + "行步骤...");
				logger.info("(用例)：[" + caseName + "]的第" + i + "行步骤...");
				Row row = null;
				Cell testDataCell = null;
				Cell locatorCell = null;

				row = sheet.getRow(i);
				String testDataStr = null;
				if (row != null) {
					testDataCell = row.getCell(testDataColumnIndex);
					if (testDataCell != null) {
						// 先设置Cell的类型，然后就可以把纯数字作为String类型读进来了
						testDataCell.setCellType(Cell.CELL_TYPE_STRING);
						testDataStr = testDataCell.getStringCellValue();
						testDataStr = handleData(testDataStr);
						
					}

					locatorCell = row.getCell(locateColumnIndex);
					if (locatorCell != null) {
						locatorCell.setCellType(Cell.CELL_TYPE_STRING);
						locator = locatorCell.getStringCellValue();
						if (locator.length() > 0) {
							locateSplit = getPageElementLocator(sheet, i, locateColumnIndex, locator.split("\\.")[0]); // 找到定位方式、定位值
							locateSplitType = locateSplit[0];
							locateSplitValue = locateSplit[1];
						}
					}

					paramMap.put(ParamConstant.TEST_DATA, testDataStr); // 测试数据
					paramMap.put(ParamConstant.LOCATOR_ELE, locator); // 元素定位
					paramMap.put(ParamConstant.LOCATOR_TYPE, locateSplitType); // 定位方式
					paramMap.put(ParamConstant.LOCATOR_VALUE, locateSplitValue); // 定位值
					paramMap.put(ParamConstant.FUNCTION_NAME, founction); // 模块名
					paramMap.put(ParamConstant.CASE_NAME, caseName); // 用例名
					System.out.println(paramMap);

					String action = row.getCell(actionColumnIndex).getStringCellValue();
					String actionTypeClass = actionMap.get(action);
					ParamConstant.CURR_PARAM = paramMap;
					ActionType actionType = (ActionType) Class.forName(actionTypeClass).getConstructor().newInstance();
					actionType.doAction(paramMap);
				} else {
					throw new Exception("sheet.getRow(i) is NULL . i =" + i);
				}

			} catch (Exception e) {// 错误截图
				e.printStackTrace();
				// seleniumUtil.screenShot(founction,caseName,"错误截图");
			}
		}
		 
	}
	
	/**
	 * 处理数据体
	 * @param testData2
	 * @return
	 */
	public static String handleData(String testData2){
		if (testData2.length() > 0) {
			// 判断是否多参数
			if (testData2.contains(";")) {
				String firstData = getXmlValue(testData2.split(";")[0]);
				String secondData = getXmlValue(testData2.split(";")[1]);
				testData2 = firstData + ";" + secondData;
			}
			// 判断是不是全局变量，如果是则在公共数据表获取数值
			// 判断是不是案例变量，如果 是案例变量优先取案例变量的值
			return getXmlValue(testData2);
		}else{
			return testData2;
		}
	}
	
	/**
	 * 解析带有$符号的值
	 *
	 * @param testData2
	 * @return
	 */
	public static String getXmlValue(String parameter) {
		if ("$".equals(parameter.substring(0, 1))) {
			//获取案例中的储存变量
			if ("${".equals(parameter.substring(0, 2))) {
				String getCaseDataXmlName = parameter.substring(parameter.indexOf("{") + 1, parameter.lastIndexOf("}"));
				FloderUtil floder = new FloderUtil();
				LinkedList<String> fileList = (LinkedList<String>) floder.getListFloder("data");
				for (String filePathName : fileList) {
					if (filePathName.contains(getCaseDataXmlName)) {
						initCommonData(caseDataValueMap, filePathName, "//root");
						parameter = caseDataValueMap.get(parameter.split("\\.")[1]);
					}
				}
			} else {
				//全局变量获取
				parameter = commonDataValueMap.get(parameter.substring(1));
			}
		}
		return parameter;
	}
	
	/**
	 * 初始化公共数据表的键值
	 * @param objMap
	 * 			存放数据的Map
	 * @param file
	 * 			公共数据xml
	 * @param pluginPth
	 * 			xpth路径
	 */
	public static void initCommonData(HashMap<String,String> objMap,String file,String pluginPth){
		XmlDao xmlCommonData=new XmlDao();
		XmlHander xmlhander=new XmlHander();
		try {
			xmlhander.loadXML(new FileInputStream(new File(file)));
			xmlhander.visitNode(pluginPth);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<Map> commonDataList = xmlCommonData.getDatas(xmlhander, pluginPth, false);
		for(Map commonDataMap : commonDataList){
			String key = (String) commonDataMap.get("name");
			String value = (String) commonDataMap.get("value");
			objMap.put(key, value);
		}
	}
}
