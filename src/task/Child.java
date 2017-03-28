package task;

import task.Parent;

public class Child extends Parent {
	static {
		properties.TestProperties.NAME = "test1\\test2"; 
	}
	public static String formatCompareResult (int result) {
		if (result > 0) {
			return "less than ";
		} else if (result < 0) {
			return "greater than ";
		} else { 
			return "equal to ";
		}
	}
	
	public Child () {
		super();
	}; 
	
	public Child (int value) {
		super(value);        
	}
	
	@Override
	public int getValue() {
		return super.getValue() + 1;
	}
	
	public int compare (int value) {
		return value - this.getValue();
	}
	
	public int compare(Parent obj) {		
		return obj.getValue() - this.getValue();
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj != null && obj instanceof Child) {			
			return this.getName().equals(((Child)obj).getName());
		}
		else {
			return false;
		}
	}
	
	public String getName() {
		return this.name;
	}
}