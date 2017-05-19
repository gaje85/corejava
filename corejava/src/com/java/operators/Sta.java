package com.java.operators;

public class Sta {
	
	static int count = 10;
	int two = 10;
	static{
		
		count++;
		System.out.println("first static block"+count);
	}
	
	public Sta(){
		count++;
		System.out.println("cons "+count);
	}
	
	public void getItem(){
		count++;
		System.out.println("instance () "+count);
	}
	public static void getCus(){
		//two++;
		count++;
		System.out.println("static ()"+count);
	}
	public static void main(String[] args) {
		Sta.count++;
		Sta.getCus();
		//Class cls = Sta.class;
		Sta sta = new Sta();
		sta.getItem();
		sta.getCus();
		sta.count++;
		System.out.println("value = "+count);
		
	}
	static{
		count++;
		System.out.println("second static block"+count);
	}

}
