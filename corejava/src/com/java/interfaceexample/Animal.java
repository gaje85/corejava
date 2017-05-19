package com.java.interfaceexample;

public abstract class Animal implements Travel,Owner{

	
	
}
class Dog extends Animal {

	@Override
	public int getSpeed() {
		//count++;
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
class Cat extends Animal {

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
class Rabbit extends Animal {

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
