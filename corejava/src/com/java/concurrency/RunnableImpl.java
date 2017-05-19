package com.java.concurrency;

public class RunnableImpl implements Runnable{

	String name;
	public RunnableImpl(String name){
		this.name = name;
		Thread thread = new Thread(this,name);
		thread.start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(name +" = "+i+" "+Thread.currentThread());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		RunnableImpl one = new RunnableImpl("one");
		
		RunnableImpl two = new RunnableImpl("two");
		
		System.out.println("Main Done "+Thread.currentThread());
		
	}
	
}
