package com.util.general;

import java.util.Hashtable;
import java.util.Vector;

public class OldDS {
	
	public static void main(String[] args) {
		Vector vec = new Vector();
		
		vec.add(12);
		vec.add("one");
		vec.add(12.22);
		
		Double dou = (Double)vec.get(2);
		System.out.println(dou);
		
		Vector<String> vecStr = new Vector<String>();
		vecStr.add("one");
		vecStr.add("two");
		vecStr.addElement(null);
		
		String s = vecStr.get(1);
		System.out.println(s);
		
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("one", 1); // 4
		ht.put("two", 2); // 2
		ht.put("three", 22); // 4
		
		int i = ht.get("two"); //2
		int i3 = ht.get("three");
		System.out.println(i);
	}

}
