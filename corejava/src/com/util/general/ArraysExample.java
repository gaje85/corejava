package com.util.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

public class ArraysExample {
	static int count = 0;
	public static void main(String[] args) {
		int one[] = {4,33,3,2,3,2};
		int two[] = Arrays.copyOf(one,one.length);
		for (int i = 0; i < two.length; i++) {
			System.out.println(two[i]);
		}
		System.out.println("-----------------");
		Arrays.sort(one);
		
		for (int i = 0; i < two.length; i++) {
			System.out.println(one[i]);
		}
		
		
		Employee emp = new Employee(1,"google",22342.23);
		Employee emp1 = new Employee(2,"ebay",42342.23);
		Employee emp2 = new Employee(3,"google",12342.23);
		Employee emp3 = new Employee(4,"ebay",62342.23);
		Employee emp4 = new Employee(5,"google",25342.23);
		Employee[] empArr = {emp,emp1,emp2,emp3,emp4};
		
		System.out.println("-----------------");
		System.out.println(Arrays.toString(empArr));
		
		Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				/*if(o1.getSalary() > o2.getSalary()){
					return -1;
				}
				if(o1.getSalary() < o2.getSalary()){
					return 1;
				}
				return 0;*/
				return Double.compare(o2.getSalary(), o1.getSalary());
				
			}
		};
		
		Arrays.sort(empArr,comparator);
		System.out.println(Arrays.toString(empArr));
		//Arrays.toString(empArr);
		StringJoiner sj = new StringJoiner(":", "[", "]");
		 sj.add("George").add("Sally").add("Fred");
		 String desiredString = sj.toString();
		System.out.println(desiredString);
		
		
		StringTokenizer st = new StringTokenizer("this, is, a, test",",");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	     String ar[] = "this, is, a, test".split(",");
	     
	     Timer timer  = new Timer();
	     timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("called ...");
				if(count == 3){
					
					timer.cancel();
				}
				count++;
			}
		}, 3000,5000);
		
	}

}
