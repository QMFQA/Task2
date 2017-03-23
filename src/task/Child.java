package task;

import properties.TestProperties;

public class Child extends Parent {
	static {
		TestProperties.NAME = "test1\\test2";
	}
	
	public Child(){
		this(TestProperties.VALUE);
	}
	
	public Child(int value){
		super(value);
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public int compare(int value) {
		int value_getValue = getValue();
		if (value_getValue > value) return 1;		
		else
			if (value_getValue == value) return 0;	
			else return -1;							
		
	}
	
	public int compare(Parent obj){
		return compare(obj.getValue());
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Parent){
			Parent p = (Parent)obj;
			return this.name.equals(p.name);
		}
		return false;
	}
	
	public static String formatCompareResult(int comp){
		switch (comp) {
		case -1: return "less than";
		case 0: return "equal to";
		case 1: return "greater than";
		default: return "wrong value";
		}
	}
	
	@Override
	public int getValue(){
		return super.getValue() + 1;
	}

}
