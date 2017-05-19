package com.java.lang;

public class RuntimeExamples {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		long startNano = System.nanoTime();
				
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(){
			@Override
			public void run() {
				System.out.println("JVM is shutting down ");
			}
		});
		int pro = runtime.availableProcessors();
		System.out.println(pro);
		long end = System.currentTimeMillis();
		long endNano = System.nanoTime();
		System.out.println(end-start);
		
		System.out.println(endNano-startNano);
		System.out.println(System.getenv());
		
		int one[] = {12,23,21,2,3};
		int two[] = new int[one.length];
		
		for (int i = 0; i < one.length; i++) {
			two[i] = one[i];
		}
		
		System.arraycopy(one, 0, two, 0, one.length);
		
		//JDK 1.5 ProcessBuilder 
		/*try {
			Process process = runtime.exec("notepad");
			process.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
	}

}
