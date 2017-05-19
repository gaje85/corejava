package com.java.interfaceexample;
import static java.lang.Math.PI;
import static java.lang.Math.abs;
public class Test  {

	public static void main(String[] args) {
		Travel travelOne = new Car();
		Travel travelTwo = new Dog();
		
		System.out.println(travelOne instanceof Car);
		
		
		Travel travelThree = new Rabbit();
		
		Owner owner = (Rabbit)travelThree;
		
		double d = PI;
		abs(12);
	}
	
}
