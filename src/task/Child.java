package task;

import properties.TestProperties;

public class Child extends Parent {
	static {
		TestProperties.NAME = "test1\\test2";
	}
	
	final static int CMP_LESS = -1;
	final static int CMP_EQUAL = 0;
	final static int CMP_GREATER = 1;
	
	public Child(){
//		super();
	}

	public Child( int value ){
		super( value );
	}
	
	public static String formatCompareResult(int Result) {
	
		switch(Result) {
			case CMP_GREATER:
				return("greater then");
			case CMP_LESS:
				return("less then");
			case CMP_EQUAL:
				return("equal to");
		}
		return( "Can not fromat a result" );
	}
	
	public String getName() {
		return( name );
	}

	@Override
	public int getValue() {
		return super.getValue()+1;
	}

	@Override
	public int compare(int value) {
		if( getValue() > value )
			return CMP_GREATER;
		else if( getValue() < value )
			return CMP_LESS;
			
		return CMP_EQUAL;
	}

	public int compare(Parent p) {
		return compare(p.getValue());
	}	
	
	@Override
	public boolean equals(Object arg0) {
		
		if( arg0 == null )
			return false;
		if(!(arg0 instanceof Child))
			return false;
		if( this.getName().compareTo(((Child) arg0).getName()) == 0 )
			return true;
		return false;
	}
	
}
