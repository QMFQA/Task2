package task;

public class Child extends Parent {

	static { 
		properties.TestProperties.NAME = "test1\\test2"; 
	}
	
	public Child() {}

	public Child(int value) {
	
		super(value);
		
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
		return super.getValue()+1;
	}
		
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj){ 
			return true;
		}
        if (obj == null){ 
        	return false;
        }
        if (getClass() != obj.getClass()){
        	return false;
        }
        
        Child other = (Child) obj;
        return name.equals(other.name);
	
	}
	
	public String getName() {
		return name;
	}
	
	public static String formatCompareResult(int compare) {
	
		if (compare > 0) return "more than";
		else if (compare < 0 ) return "less than";
		else return "equal to";
	}
}
