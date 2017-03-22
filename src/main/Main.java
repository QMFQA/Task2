package main;

import properties.TestProperties;
import task.Child;
import task.Parent;

public class Main {
	
	private static final String FORMAT = "%s is %s %s";
	
	public static void main(String[] args) {
		Parent obj1 = new Child();
		Child obj2 = new Child(10);
		System.out.println("Object1 name is '" + TestProperties.NAME + "'"); // FIXME
		System.out.println("Object2 name is '" + obj2.getName() + "'");
		if (obj1.equals(obj2)) System.out.println("Objects are equal");
		
		System.out.println(String.format(FORMAT, obj2.getValue(), Child.formatCompareResult(obj2.compare(obj1)), obj1.getValue()));
		System.out.println(String.format(FORMAT, obj2.getValue(), Child.formatCompareResult(obj2.compare(TestProperties.VALUE)), TestProperties.VALUE));
	}

}
