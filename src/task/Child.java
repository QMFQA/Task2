package task;
import properties.TestProperties;
import task.Parent;

public class Child extends Parent {
	static {
		properties.TestProperties.NAME = "test1\test2"; 
	}
	protected int value; 
	public Child () {}; 
	
	public Child (int value) {
		super.getValue();        
	}   
		@Override
    	public int getValue() {
    		return super.getValue() + 1;
 }
		public int compare(Parent obj1, Child obj2) {
		
			return obj2.compare(obj1.getValue());
		}
		public String getName(Child obj2) {
			return properties.TestProperties.NAME;
		}		
		@Override
		public int compare(int value) {
				return obj2.compare(TestProperties.VALUE)  ;
		}
}