package com.wymall.test.utils.xmlpersistence;

import java.util.Comparator;
import java.util.Map;

/**
 * 序号比较器，比较Map里面的xseq属性值的大小
 * @author Administrator
 *
 */
public class SeqComparator implements Comparator{

	
	@Override
	public int compare(Object obj1, Object obj2) {
		int seq1 = Integer.parseInt((String) ((Map)obj1).get("xseq"));
		int seq2 = Integer.parseInt((String)((Map)obj2).get("xseq"));
		if(seq1>seq2){
			//obj1 值比obj2 大，则obj 排在后面（升序）
			return 1;
		}
		return 0;
	}

}
