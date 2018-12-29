package com.wymall.test.utils.xmlpersistence;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.dom4j.Element;

import com.wymall.test.utils.commons.xml.XmlHander;

/**
 * xml 数据访问类
 * @author czys
 *
 */
public class XmlDao {
	/**
	 * 工作目录
	 */
	public static String projectWorkPath = "";
	
	protected String xmlFilePath;
	
	public XmlDao(){
		
	}
	
	public String getXmlFilePath() {
		return xmlFilePath;
	}

	public void setXmlFilePath(String xmlFilePath) {
		this.xmlFilePath = xmlFilePath;
	}


	public XmlHander getXmlHander() throws Exception{
		XmlHander xmlHander = new XmlHander();
		xmlHander.loadXML(new FileInputStream(getXmlFilePath()));
		return xmlHander;
	}
	
	
	/**
	 * 保存xml文件
	 * @param xmlHander
	 */
	public void saveXmlfile(XmlHander xmlHander){
		xmlHander.outPutXMLPretty(getXmlFilePath(), "UTF-8");
	}

	
	//DAO层常用方法=======================================
	//=====================================================================
	
	/**
	 * 获取指定节点的数据
	 * 不会进行深度抓取
	 * @param xmlHander
	 * @param pluginPth
	 * @param deep 是否深度抓取内部数据 
	 * @return
	 */
	public Map getData(XmlHander xmlHander,String elementPth,Boolean deep){
		xmlHander.visitNode(elementPth);
		Element element = xmlHander.getEle();
		Map data = ElementConverter.elementToMap(element,deep);
		return data;
	}
	
	/**
	 * 获取指定节点下的多行数据
	 * 注意：不会进行深度抓取
	 * @param xmlHander
	 * @param pluginPth
	 * @param deep 是否深度抓取内部数据 
	 * @return
	 */
	public List getDatas(XmlHander xmlHander,String pluginPth,Boolean deep){
		xmlHander.visitNode(pluginPth);
		Element pluginEle = xmlHander.getEle();
		List<Element> dataEles = pluginEle.elements();
		if(dataEles !=null && dataEles.size()>0){
			List datas =  new ArrayList();
			for(Element dataEle:dataEles){
				Map data = ElementConverter.elementToMap(dataEle,deep);
				datas.add(data);
			}
			return datas;
		}
		return null;
	}
	
	/**
	 * 插入一条数据
	 * @param total
	 * @param plugin
	 * @param data
	 * @param dataTagName
	 * @throws Exception 
	 */
	public void insertData(XmlHander xmlHander,String totalPth,String pluginPth ,Map data,String dataTagName ) throws Exception{
		long total = 0;
		Element totalEle = null;
		boolean hasTotalEle = true;
		if(totalPth == null){
			hasTotalEle = false;
		}
		if(hasTotalEle){
			xmlHander.visitNode(totalPth);
			totalEle = xmlHander.getEle();
			try {
				total = Long.parseLong(totalEle.attributeValue("total"));
			} catch (Exception e) {
				
			}
		}
		xmlHander.visitNode(pluginPth);
		Element pluginEle = xmlHander.getEle();
		Element newELe = pluginEle.addElement(dataTagName);
		ElementConverter.mapToElement(data, newELe,false);
		if(hasTotalEle){
			total++;
			totalEle.addAttribute("total", total+"");
		}
	}
	
	/**
	 * 插入多条数据
	 * @param total 标记总记录数的节点，必须含有total属性
	 * @param plugin 挂载点，新数据加载在哪个节点下
	 * @param datas 要插入的数据
	 * @param dataTagName
	 * @throws Exception 
	 */
	public void insertDatas(XmlHander xmlHander,String totalPth,String pluginPth ,List<Map> datas,String dataTagName ) throws Exception{
		if(datas == null || datas.size()<=0){
			return ;
		}
		long total = 0;
		Element totalEle = null;
		boolean hasTotalEle = true;
		if(totalPth == null){
			hasTotalEle = false;
		}
		if(hasTotalEle){
			xmlHander.visitNode(totalPth);
			totalEle = xmlHander.getEle();
			try {
				total = Long.parseLong(totalEle.attributeValue("total"));
			} catch (Exception e) {
				
			}
		}
		xmlHander.visitNode(pluginPth);
		Element pluginEle = xmlHander.getEle();
		for(Map data:datas){
			Element newELe = pluginEle.addElement(dataTagName);
			if(hasTotalEle){
				total++;
			}
			ElementConverter.mapToElement(data, newELe,false);
		}
		if(hasTotalEle){
			totalEle.addAttribute("total", total+"");
		}
	}

	/**
	 * 更新一条数据
	 * @param total
	 * @param plugin
	 * @param data
	 * @param dataTagName
	 * @throws Exception 
	 */
	public void updateData(XmlHander xmlHander,Map data,String dataTagName ) throws Exception{
		String pkid = (String) data.get("pkid");
		String dataPth = "//"+dataTagName+"[@pkid='"+pkid+"']";
		xmlHander.visitNode(dataPth);
		Element dataELe = xmlHander.getEle();
		ElementConverter.mapToElement(data, dataELe,false);
	}
	
	/**
	 * 更新一条数据
	 * @param data
	 * @param element
	 * @throws Exception 
	 */
	public void updateData(XmlHander xmlHander,Map data,Element element ) throws Exception{
		Element dataELe = xmlHander.getEle();
		ElementConverter.mapToElement(data, dataELe,false);
	}
	
	/**
	 * 更新多条数据
	 * 每条数据记录必须含有pkid主键
	 * @param total
	 * @param plugin
	 * @param data
	 * @param dataTagName
	 * @throws Exception 
	 */
	public void updateDatas(XmlHander xmlHander,List<Map> datas,String dataTagName ) throws Exception{
		if(datas == null || datas.size()<=0){
			return ;
		}
		for(Map data:datas){
			String pkid = (String) data.get("pkid");
			String dataPth = "//"+dataTagName+"[@pkid='"+pkid+"']";
			xmlHander.visitNode(dataPth);
			Element dataELe = xmlHander.getEle();
			ElementConverter.mapToElement(data, dataELe,false);
		}
	}
	
	/**
	 * 删除一条数据
	 * 数据中必须有主键pkid值
	 * @param total
	 * @param plugin
	 * @param data
	 * @param dataTagName
	 * @throws Exception 
	 */
	public void deleteData(XmlHander xmlHander,String totalPth,Map data,String dataTagName ) throws Exception{
		long total = 0;
		Element totalEle = null;
		boolean hasTotalEle = true;
		if(totalPth == null){
			hasTotalEle = false;
		}
		if(hasTotalEle){
		xmlHander.visitNode(totalPth);
		totalEle = xmlHander.getEle();
			try {
				total = Long.parseLong(totalEle.attributeValue("total"));
			} catch (Exception e) {
				
			}
		}
		String pkid = (String) data.get("pkid");
		String dataPth = "//"+dataTagName+"[@pkid='"+pkid+"']";
		xmlHander.visitNode(dataPth);
		Element dataELe = xmlHander.getEle();
		dataELe.getParent().remove(dataELe);
		if(hasTotalEle){
			total--;
			totalEle.addAttribute("total", total+"");
		}
	}
	
	/**
	 * 删除多条数据
	 * 每条数据必须有主键pkid值
	 * @param total
	 * @param plugin
	 * @param data
	 * @param dataTagName
	 * @throws Exception 
	 */
	public void deleteDatas(XmlHander xmlHander,String totalPth,List<Map> datas,String dataTagName ) throws Exception{
		long total = 0;
		Element totalEle = null;
		boolean hasTotalEle = true;
		if(totalPth == null){
			hasTotalEle = false;
		}
		if(hasTotalEle){
			xmlHander.visitNode(totalPth);
			totalEle = xmlHander.getEle();
			try {
				total = Long.parseLong(totalEle.attributeValue("total"));
			} catch (Exception e) {
				
			}
		}
		for(Map data:datas){
			String pkid = (String) data.get("pkid");
			String dataPth = "//"+dataTagName+"[@pkid='"+pkid+"']";
			xmlHander.visitNode(dataPth);
			Element dataELe = xmlHander.getEle();
			dataELe.getParent().remove(dataELe);
			if(hasTotalEle){
				total--;
			}
		}
		if(hasTotalEle){
			totalEle.addAttribute("total", total+"");
		}
	}
	
	/**
	 * 清空挂载元素下的全部数据
	 * 每条数据必须有主键pkid值
	 * @param total
	 * @param plugin
	 * @param data
	 * @param dataTagName
	 * @throws Exception 
	 */
	public void clearDatas(XmlHander xmlHander,String totalPth,String pluginPth) throws Exception{
		Element totalEle = null;
		boolean hasTotalEle = true;
		if(totalPth == null){
			hasTotalEle = false;
		}
		if(hasTotalEle){
			xmlHander.visitNode(totalPth);
			totalEle = xmlHander.getEle();
			totalEle.addAttribute("total","0");
		}
		Element pluginEle = xmlHander.visitNode(pluginPth).getEle();
		pluginEle.clearContent();
 	}
}
