package com.java.operators;

public class Car {
	
	private String model;
	int i = 10;
	private double speed = 20;
	
	
	public Car(){
		System.out.println("empty cons called ");
	}
	
	public Car(int speed){
		this();
		this.speed = speed;
		System.out.println("one arg cons called ");
	}
	
	public Car(int speed ,String model){
		this(speed);
		this.speed = speed;
		this.model = model;
		System.out.println("two arg cons called ");
	}
	
	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public boolean start(){
		return true;
	}

	public void accelerate(){
		speed += 10;
	}
	public void accelerate(int speed){}
	public void accelerate(double speed){}
	public void accelerate(int speed,String mod){}
	public void accelerate(String mod,int speed){}
	//public int accelerate(int speed){}
	//public void accelerate(int speed){}
	
	
	public void changeInt(int i){
		i = i + 10;
		
	}
	// public , protected, , private
	
	protected void brake(){
		System.out.println("brake in Car called");
	}
	public static void main(String[] args) {
		//Car car1 = new Car(100);
		Car car2 = new Car(100,"Audi");
		
		//car1.speed = 20.0; // encapsulation 
		car2.speed = 30.0;
		
		
		
		//System.out.println(car1.speed);
		System.out.println(car2.speed);
		int count = 100;
		//car1.changeInt(count);
		System.out.println(count);
		
		
		
		
	}
	
}
