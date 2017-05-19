package com.util.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExamples {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("one",12);
		map.put("two",121);
		map.put("three",123);
		map.put("four",124);
		
		System.out.println(map);
		
		Set<String> set = map.keySet();
		Collection<Integer> val = map.values();
		Iterator<String> iterKey = set.iterator();
		Iterator<Integer> iterVal = val.iterator();
		
		while(iterKey.hasNext()){
			System.out.println(iterKey.next() + " == "+iterVal.next());
			iterKey.remove();
		}
		Integer value = map.get("four");
		System.out.println(value);
		
		
		Map<String,Integer> mapLink = new LinkedHashMap<String,Integer>();
		
		mapLink.put("one",12);
		mapLink.put("two",121);
		mapLink.put("three",123);
		mapLink.put("four",124);
		System.out.println(mapLink);
		
		TreeMap<String,Integer> mapTree = new TreeMap<String,Integer>();
		
		mapTree.put("one",12);
		mapTree.put("two",121);
		mapTree.put("three",123);
		mapTree.put("four",124);
		System.out.println("treemap"+mapTree);
		NavigableMap<String, Integer> naviMap = mapTree.headMap("three", true);
		System.out.println(naviMap);
		
		NavigableMap<String, Integer> naviMapTail = mapTree.tailMap("three", true);
		System.out.println(naviMapTail);
	}
}
