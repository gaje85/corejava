package com.java.java5;

import java.util.ArrayList;
import java.util.List;

import com.java.operators.Car;
import com.java.operators.Taxi;

public class GenericExample {

	public static void main(String[] args) {
		
		// before jdk 1.5
		List list = new ArrayList();
		
		list.add("String one");
		list.add("String two");
		list.add("String three");
		
		String val = (String)list.get(1);
		System.out.println(val);
		
		// JDK 1.5
		List<String> listOne = new ArrayList<>();
		
		listOne.add("String one");
		listOne.add("String two");
		listOne.add("String three");
		
		String valOne = listOne.get(1);
		System.out.println(valOne);
		add(20.3,20.4);
		add("one","one");
		add(new Car(),new Taxi());
	}
	
	
	public static <T,S> double add(T t,S s){
		System.out.println(t);
		System.out.println(s);
		return 20.0;
	}
	
}
