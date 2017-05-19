package com.java.lang;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ExceptionExample {
	
	public ExceptionExample() {
		try{
			int count = 10;
			double d = count / 0;
		}catch (Exception e) {
			//e.printStackTrace();
		}
		int i[] = {1,2,34,4};
		//System.out.println(i[5]);
		try{
			URL url = new URL("http://www.google.com");
			URLConnection connection = url.openConnection();
			System.out.println("last line of try");
			return;
		}catch(MalformedURLException e){
			System.out.println("Mal formed URL exception");
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println("finally");
		}
		
		System.out.println("After finally");
	}
	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		try {
			ee.getCustomer();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			ee.getCustomerTwo();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	
	public void getCustomer() throws MalformedURLException,IOException{
		//ExceptionExample ee = null;
		//ee.hashCode();
		URL u = new URL("http://www.google.com");
	}
	public void getCustomerOne() throws MalformedURLException{
		/*try{
			ExceptionExample ee = null;
			ee.hashCode();
		}catch (Exception e) {
			throw new MalformedURLException();
		}*/
		int count = 10;
		if(count > 100){
			throw new MalformedURLException();
		}
	}
	
	public void getCustomerTwo() throws CustomException{
		int count = 1000;
		if(count > 100){
			throw new CustomException("greater than 100");
		}
	}
	

}
