package com.java.lang;

import com.java.operators.Car;
import com.java.operators.Taxi;

public class CloneExample implements Cloneable{
	
	Car car;
	Taxi taxi;
	public CloneExample(){
		car = new Car();
		taxi = new Taxi();
	}
	
	public static void main(String[] args) {
		
		try{
			CloneExample ceOne = new CloneExample();
			CloneExample ceTwo = (CloneExample)ceOne.clone();
			
			System.out.println(ceOne.hashCode() + " === "+ceTwo.hashCode());
			System.out.println(ceOne.car.hashCode() + " car hashcode "+ceTwo.car.hashCode());
			System.out.println(ceOne.taxi.hashCode() + " taxi hashcode "+ceTwo.taxi.hashCode());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
