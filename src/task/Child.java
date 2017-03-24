package task;

import properties.TestProperties;

public class Child extends Parent{
	
	static {
		TestProperties.NAME = "test1\\test2";
	}
	
	
	public String getName(){
	return name;	
	}
	
	public Child() {
		super();
	}
	
	public Child(int value) {
		super(value);
	}
	
	@Override
	public int compare(int value) {
		if (value == this.getValue())
			return 0;
		else
		{
			
			if (value > this.getValue())
			{
				return 1;	
			}
			else
			{
				return -1;
			}
		}	
	}
	
	public int compare(Parent obj) {
		return compare(obj.getValue());
}
	
	@Override
	public int getValue() {
		return super.getValue()+1;
	}
	
	public static String formatCompareResult (int result){
		if (result == 0)
		{
			return " equal to ";
		}
		else
		{
			if (result < 0)
			{
				return " greater than ";	
			}
			else
			{
				return " less than ";
			}
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		return true;
		}
	
}
