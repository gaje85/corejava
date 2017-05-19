package com.java.java5;

import com.java.operators.Car;
import com.java.operators.PoliceCar;
import com.java.operators.SportsCar;
import com.java.operators.Taxi;

public class AutoBoxing {

	
	public static void main(String[] args) {
		
		Integer val = new Integer(10);
	
		val++;
		
		int k = val + 20;
		
		System.out.println(k);
		getItem(10, new PoliceCar(),new SportsCar(),new Taxi());
		
	}
	
	public static void getItem(int count,Car... car){
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		
	}
}
