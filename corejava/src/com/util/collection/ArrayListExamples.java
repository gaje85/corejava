package com.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.util.general.Employee;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(list.get(2));
		
		Employee emp = new Employee(1,"google",22342.23);
		Employee emp1 = new Employee(2,"ebay",42342.23);
		Employee emp2 = new Employee(3,"google",12342.23);
		Employee emp3 = new Employee(4,"ebay",62342.23);
		Employee emp4 = new Employee(5,"google",25342.23);
		Employee[] empArr = {emp,emp1,emp2,emp3,emp4};
		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(empArr));
		System.out.println(empList);
		
		Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.getSalary(), o1.getSalary());
				
			}
		};
		
		Collections.sort(empList,comparator);
		System.out.println(empList);

	}

}
