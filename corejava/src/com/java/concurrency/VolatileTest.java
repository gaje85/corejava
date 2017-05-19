package com.java.concurrency;
public class VolatileTest extends Thread{
   volatile	boolean keepRunning = true;
   
		    public void run() {
		        long count=0;
		        while (keepRunning) {
		            count++;
		           
		        }

		        System.out.println("Thread terminated."+count);
		    }

		    public static void main(String[] args) throws InterruptedException {
		    	VolatileTest t = new VolatileTest();
		        t.start();
		        Thread.sleep(1000);
		        t.keepRunning = false;
		        System.out.println("keepRunning set to false.");
		    }
		

}

