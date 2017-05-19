package com.util.collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
	
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		System.out.println(map);
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
			iter.remove();
		}
		
		System.out.println(map);
	}

}
