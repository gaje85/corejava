package com.java.operators;

public abstract class Abs {
	
	public Abs(){
		
	}
	
	public abstract void getItem();
	
	public static void main(String[] args) {
		//Abs abs = new Abs();
		SubAbs sub = new SubAbs();
	}
	
}

class SubAbs extends Abs{

	@Override
	public void getItem() {
		
	}
	
	
}
