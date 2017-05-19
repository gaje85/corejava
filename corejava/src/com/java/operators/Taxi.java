package com.java.operators;

public class Taxi extends Car{
	
	int i = 100;
	//constructor chaining
	public Taxi(){
		//super();
		System.out.println("Taxi cons empty");
	}
	public Taxi(int i){
		super(i);
		//this();
		System.out.println("Taxi cons one arg");
	}
	
	@Override
	public void brake() {
		//super.brake();
		System.out.println("brake in taxi called");
	}
	public static void main(String[] args) {
		//Taxi taxi = new Taxi(10);
		//taxi.brake();
		
		
		// Object substitution
		
		Car car = new Taxi();
		car.brake();
		System.out.println(car.i);
		System.out.println(car instanceof Taxi);
		
		
	}

}
