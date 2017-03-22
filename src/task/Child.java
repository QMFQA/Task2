package task;

import properties.TestProperties;

public class Child extends Parent {
	static {
		 TestProperties.NAME = "test1/test2";
		 }

	public Child() {
		super();
	}
	
	public Child(int i) {
		super(i);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name;
	}
	
	@Override
	public int getValue() {
		return (super.getValue()+1);
	}

	@Override
	public boolean equals(Object obj) {
		return (this.name==obj.toString());
	}
	
	static public String formatCompareResult (int difference) {
		String result = "equals to";
		if (difference>0) result="more than";
		if (difference<0) result="less than";
		return result; 
				
	}

	@Override
	public int compare(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compare(Parent obj1) {
		Child c = (Child) obj1;
		int i = c.getValue();
		return (this.getValue()-i);
	}
	
}