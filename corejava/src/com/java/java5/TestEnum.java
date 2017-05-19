package com.java.java5;

public class TestEnum {
	
	public static void main(String[] args) {
		 Level level = Level.HIGH;
		 System.out.println(level.getClass().getName());
		 System.out.println(level.name());
		 System.out.println(level.ordinal());
		 System.out.println(level.levelCode);
		 System.out.println(level.getLevelCode());
		/* for (Level levelOne : Level.values()) {
		    System.out.println(levelOne);
		}*/
		 Level levelOne[] = Level.values();
		 for (int i = 0; i < levelOne.length; i++) {
			 System.out.println(levelOne);
		}
		 

	}

}
