package com.java.lang;

public class Employee {
	
	int id;
	String name;
	double sal;
	
	public Employee(){
		
	}
	public Employee(int id,String name,double sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private double getSal() {
		System.out.println("get sal invoked");
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
