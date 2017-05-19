package com.util.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class QueueExample {
	public static void main(String[] args) {
		
		Comparator<String> lenCom = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Long.compare(o1.length(), o2.length());
				
			}
		};
		
		PriorityQueue<String> queue = new PriorityQueue<>(10,lenCom);
		
		queue.add("3233223");
		queue.add("23323");
		queue.add("224");
		queue.add("wewewweweew");
		System.out.println(queue);
		
		Stack<String> stack = new Stack<String>();
		stack.add("3eee");
		stack.add("3eeesd");
		
		System.out.println(stack);
	}

}
