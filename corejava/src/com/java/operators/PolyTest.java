package com.java.operators;

public final class PolyTest {

	
	public static void main(String[] args) {
		
		final int count = 20;
		//count++;
		final Taxi t = new Taxi();
		t.i = 40;
		//t = new Taxi();
		
		PolyTest pt = new PolyTest();
		SportsCar sc = new SportsCar();
		PoliceCar pc = new PoliceCar();
		Taxi taxi = new Taxi();
		
		pt.brake(pc);
		pt.brake(sc);
		pt.brake(taxi);
		
		Car car[] = {new Taxi(),new PoliceCar(),new SportsCar()};
		for (int i = 0; i < car.length; i++) {
			car[i].brake();
		}
		
	}
	
	public void brake(Car car){
		car.brake();
	}
}
