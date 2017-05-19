package com.java.interfaceexample;

public abstract class Vehicle implements Travel,Owner{

	
}
class Car extends Vehicle {

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
class Cycle extends Vehicle {

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
class Bus extends Vehicle {

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
