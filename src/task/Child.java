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
		return name;
	}
    public boolean equals(Object obj)
    {
    	if(getName() == ((Child) obj).getName())
    	{ 
    		return true;
    	}
        else
        {
        	return false;
        }
    }
	public static Object formatCompareResult(int compare) {
		if (compare > 0)
		{
			return "greater than";
		}
		if (compare == 0)
		{
			return "equal to";
		}
		else 
		{
			return "less than";
		}
	}
	@Override
	public int compare(int value) {
		return getValue() - value;
	}
	
	@Override
	public int getValue() {
		return super.getValue() + 1;
		
	}
	public int compare(Parent obj) {
		return compare(obj.getValue());
	}
	
}
