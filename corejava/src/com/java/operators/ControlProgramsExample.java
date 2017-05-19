package com.java.operators;

public class ControlProgramsExample {
	
	public static void main(String[] args) {
		int count = 10;
		
		if(count < 20){
			System.out.println(20);
		}else if(count == 10){
			System.out.println(10);
		}else{
			System.out.println("None");
		}
		
		int response  = count > 20 ? 100 : 20;
		System.out.println("Switch");
		int choice  = 20;
		switch (choice) {
		case 10:
			System.out.println(10);
			break;
		case 20:
			System.out.println(20);
			break;
		case 30:
			System.out.println(30);
			break;

		default:
			System.out.println("default");
			break;
		}
		
		switch ("one") {
		case "rr":
			System.out.println("rr");
			System.out.println("test");
			break;
		case "one":
			System.out.println("one");
			System.out.println("test");
			break;
		case "two":
			System.out.println("two");
			break;

		default:
			System.out.println("default");
			break;
		}
		
		int i = 0;
		while (i < 10) {
		   System.out.println("i = " + i);
		   i++;
		}
		
		i = 0;
		do {
		  System.out.println("DO while i = " + i);
		  i++;
		} while (i < 10);
		
		for (i = 0; i < 10; i++){
		    System.out.println("for loop "+i);
		}
		
		for (i = 0; i < 10; i++){
			if(i == 3){
		    	continue;
		    }
		    System.out.println("for loop break "+i);
		    
		    if(i == 5){
		    	break;
		    }
		}
		
		
		
outer:	for(int j=0;j<5;j++){
	inner:	for(int k=0;k<3;k++){
				if(k == 1){
					continue outer;
				}
				if(k == 2){
					continue inner;
				}
				System.out.println(" j = "+j+" k = "+k);
			}
		}
		
		// for each -- JDK 5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
