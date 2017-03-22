package task;

public class Child extends Parent {

	private final String name = "test1\\test2";
	
	public Child() {}

	public Child(int value) {
		super(value);
	}

	@Override
	public int compare(int value) {
	   if (value > getValue())
	       return -1;
	   if (value < getValue())
	       return 1;
	   return 0;
	}

	public int getValue() {
		return super.getValue() + 1;
	}
	
	public String getName()
	{
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Child other = (Child) obj;
		if (name != other.name)
			return false;
		return true;
	}
	
	public static String formatCompareResult(int result)
	{
		String stringCompareResult = "";
		switch (result)
		{
		case 1: 
			stringCompareResult = "more than";
			break;
		case 0: 
			stringCompareResult = "equal to";
			break;
		case -1: 
			stringCompareResult = "less than";
			break;
		}
		return stringCompareResult;
	}

	public int compare(Parent obj1) {		
		return compare(obj1.getValue());
	}
}
