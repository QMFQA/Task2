package task;

import properties.TestProperties;


public class Child extends Parent {
	static {
	TestProperties.NAME="test1\\test2";
		}

	public Child() {
	}

	public Child(int value) {
		super(value);
	}

	@Override
	public int compare(int value) {
		if (value == getValue())
			return 0;
		if (value > getValue())
		return 1;
		else
			return -1;
	}
	
	public int compare(Parent obj) {
		
		int value = obj.getValue();
		return compare(value);
	}
	
	@Override
	public int getValue()
	{
		return super.getValue()+1;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public boolean equals(Object obj)

	{
		String str1 = getName();
		String str2 = ((Child)obj).getName();
		
		if (str1.equals(str2))
				return true;
		else return false;
	}
	
	public static String formatCompareResult(int compareResult)
	
	{
		switch (compareResult){
		case 0: return "equal to";
		case 1: return "more than";
		case -1: return "less than";
		default: return "!!!";
				}			
	}

	
	
}
