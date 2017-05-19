package com.java.java5;

public class ClassGenerics<T,S,R> {
	
	public ClassGenerics(){
		
	}
	
	public R getCustomer(T t,S s){
		return null;
	}
	
	public static void main(String[] args) {
		ClassGenerics<Double, Double, Integer> cs = new ClassGenerics<Double, Double, Integer>();
		Integer i = cs.getCustomer(20.0, 3.0);
	}

}
