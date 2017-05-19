package com.java.lang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Refl {
	
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("com.java.lang.Employee");
			
			Constructor cons[] = cls.getDeclaredConstructors();
			for (int i = 0; i < cons.length; i++) {
				System.out.println(cons[i]);
			}
			Employee emp = (Employee)cons[1].newInstance(10,"John",1233.3);
			System.out.println(emp);
			
			Field fields[] = cls.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}
			Method met[] = cls.getDeclaredMethods();
			for (int i = 0; i < met.length; i++) {
				//System.out.println(met[i]);
				if(met[i].getName().indexOf("getSal") != -1){
					met[i].setAccessible(true);
					met[i].invoke(emp);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
