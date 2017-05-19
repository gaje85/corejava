package com.java.lang;

public class StringExamples {
	
	public StringExamples(){
		
	}
	
	public static void main(String[] args) {
		String one = "Good"; //String literal
		String oneObj = new String("Good"); // String object
		
		String two = "Good";
		System.out.println(one == two);
		
		System.out.println(one.equals(two));
		
		System.out.println(one.equals(oneObj));
		System.out.println(one.hashCode());
		one = one + "bad";
		System.out.println(one);
		System.out.println(one.hashCode());
		
		System.out.println(one.concat(oneObj));
		
		String s = "this, is, an, example";
		String ss[] = s.split(",");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append("ss");
		sb.append("two");
		sb.append("three");
		System.out.println(sb);
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("ss");
		sbuilder.append("two");
		sbuilder.append("three");
		System.out.println(sbuilder);
	}

}
