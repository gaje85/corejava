package com.java.operators;

public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(100);
		CarExample carExample = new CarExample();
		
		carExample.aMethod(car);
		System.out.println("speed "+car.getSpeed());
		
	}

	public void aMethod(Car car){
		car.setSpeed(300);
	}
}
