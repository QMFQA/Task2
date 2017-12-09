package task;

import properties.TestProperties;

public class Child extends Parent {
	
	static {
		TestProperties.NAME = "test1\\test2";
	}

	public Child() {
		super();
	}

	public Child(int value) {
		super(value);
	}
	
	public String getName() {
		return super.name;
	}
	
	@Override
	public int compare(int value) {
		return getValue() - value;
	}
	
	public int compare(Parent obj) {
		return compare(obj.getValue());
	}
	
	@Override
	public int getValue() {
		return super.getValue() + 1;  
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
	        return false;
	    }
		
		if (obj == this) {
			return true;
		}
		
		if (!(obj instanceof Child)) {
			return false;
		}
		
		return getName().equals(((Child)obj).getName());
	}
	
	public static String formatCompareResult(int compareResult) {
		if (compareResult < 0) {
			return "less than";
		} else if (compareResult == 0) {
			return "equal to";
		} else {
			return "more than";
		}
	}
	
}
