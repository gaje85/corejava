package com.util.collection;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

import com.util.general.Employee;

public class WeakReferencesExample {
	
	    public static void main(String args[]) {
	        HashMap<Employee, String> aMap = new 
	                       HashMap<Employee, String>();

	        Employee emp = new Employee();
	        String s = "Programmer";

	        aMap.put(emp, s);

	        emp = null;

	        System.gc();
	        System.out.println("Size of Map" + aMap.size());
	        
	        WeakHashMap<Employee, String> aMapWeak = 
                    new WeakHashMap<Employee, String>();

        Employee empOne = new Employee();
        

        aMapWeak.put(empOne, s);

        empOne = null;

        System.gc();
       /* int count = 0;
        while (0 != aMapWeak.size()) {
            ++count;
            System.gc();
        }*/
        System.out.println("in weakHashMap size of : "
                + aMapWeak.size());

	    
	    
	    
	    HashMap<Employee, String> map =  new HashMap<Employee, String>();
  WeakReference<HashMap<Employee, String>> aMapWeakRef =  new WeakReference<HashMap<Employee, String>>(map);

  map = null;
  System.gc();
  //while (null != aMapWeakRef.get()) {
	  //aMapWeakRef.get().put(new Employee(),"one");
      System.out.println("Size of aMap " + aMapWeakRef.get());
    
  //}
  System.out.println("Its garbage collected");
	
}
}

