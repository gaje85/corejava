package com.java.lang;

public class ObjectExamples {

	int count;
	String desc;
	
	public ObjectExamples(){
		
	}
	/*@Override
	public String toString() {
		return count +","+desc;
	}*/
	
	public ObjectExamples(int count,String desc){
		this.count = count;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "ObjectExamples [count=" + count + ", desc=" + desc + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null){
			if(obj instanceof ObjectExamples){
				ObjectExamples oe = (ObjectExamples)obj;
				if(count == oe.count && desc.equals(oe.desc)){
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return count + desc.length() * 2;
	}

	public static void main(String[] args) {
		ObjectExamples oe = new ObjectExamples(100,"test");
		System.out.println(oe);
		System.out.println(oe.hashCode());
		Class clss = oe.getClass();
		Class cls = ObjectExamples.class;
		
		ObjectExamples oeOne = new ObjectExamples(100,"test");
		
		System.out.println(oe.equals(oeOne));
		System.out.println(oe.hashCode() + " === "+oeOne.hashCode());
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize () called ");
	}
}
