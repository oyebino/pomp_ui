package com.wymall.test.utils.xmlpersistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Element;
import org.dom4j.tree.DefaultAttribute;

/**
 * xml元素转换工具
 * @author czy
 *
 */
public class ElementConverter {

	private static final String ELEMENTS = "elements";
	private static final Object ATTR_PKID = "pkid";
	public static Pattern longPn = Pattern.compile("[+|-]*[\\d]+");//整数
	public static Pattern doublePn = Pattern.compile("[+|-]*[\\d]+.[\\d]+");//小数
	
	/**
	 * 字符串值转换为基础数据类型
	 * Long,Integer,Double,Float,Boolean,String
	 * @param value
	 * @return
	 */
	protected static Object stringToBaseData(String value) {
		if("true".equals(value)){
			return true;
		}
		
		if("false".equals(value)){
			return false;
		}
		//先不进行数值类型转换
		if(true){
			return value;
		}
		//正则表达式 判断数值型
		try {
			Matcher match = longPn.matcher(value);
			if(match.matches()){
				Long lvar = Long.parseLong(value);
				if(  lvar >Integer.MIN_VALUE && lvar < Integer.MAX_VALUE ){ //Integer范围
					Integer ivar = Integer.parseInt(value);
					return ivar;
				}else{
					return lvar;
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return value;
		}
		try {
			Matcher match = doublePn.matcher(value);
			if(match.matches()){
				Double dvar = Double.parseDouble(value);
				if(  dvar >Float.MIN_VALUE && dvar < Float.MAX_VALUE ){ //Float范围
					Float fvar = Float.parseFloat(value);
					return fvar;
				}else{
					return dvar;
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return value;
		} 
		
		if("true".equals(value)){
			return true;
		}
		
		if("false".equals(value)){
			return false;
		}
		return value;
	}



	/**
	 * 节点元素转换为Map
	 * 如果选择深度转换,则下级元素也抓取
	 * @param element
	 * @param deep 是否深度转换
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map elementToMap(Element element,boolean deep){
		Map record = new LinkedHashMap();
		List<DefaultAttribute> attrs = element.attributes();
		//处理一般属性
		for(DefaultAttribute attr:attrs){
			String attrName = attr.getName();
			String value = element.attributeValue(attrName);
			if(attrName.equals(ATTR_PKID)){
				record.put(attrName, value);
			}else{
				Object valueObj = stringToBaseData(value);
				record.put(attrName, valueObj);
			}
		}
		if(deep){
			List<Element> sonEls = element.elements();
			//处理下级节点
			if(sonEls !=null && sonEls.size()>0){
				List sonList = new ArrayList();
				for(Element sonEl:sonEls){
					Map sonRecord = elementToMap(sonEl,true);
					sonList.add(sonRecord);
				}
				record.put(ELEMENTS, sonList);
			}
		}
		return record;
	}
	
	 
	
	/**
	 * 多个节点，转化为List<Map>对象
	 * @param eles
	 * @param b
	 * @return
	 */
	public static List elementsToList(List<Element> eles, boolean deep) {
		if(eles !=null && eles.size()>0){
			List records  = new ArrayList();
			for(Element ele:eles){
				Map record = elementToMap(ele,deep);
				records.add(record);
			}
			return records;
		}
		return null;
	}



	/**
	 * 数据写入Element
	 * @param data
	 * @param ele
	 * @param deep 是否深度写入
	 */
	public static void mapToElement(Map data,Element ele,boolean deep) throws Exception{
		if(data ==null ||data.size()==0){
			return ;
		}
		Iterator itor = data.entrySet().iterator();
		while(itor.hasNext()){
			Entry entry = (Entry) itor.next();
			String attrName = (String) entry.getKey();
			Object attrValue = entry.getValue();
			if(attrValue instanceof List){
				//数组类型 TODO  deep
			}else{
				//一般属性
				ele.addAttribute(attrName, attrValue.toString());
			}
		}
	}
}
