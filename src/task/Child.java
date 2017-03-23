package task;

public class Child extends Parent {
	final static int CMP_LESS = -1;
	final static int CMP_EQUAL = 0;
	final static int CMP_GREATER = 1;
	
	public Child(){
		super();
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
		return( "test1\\test2" );
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
		if( getValue() > p.getValue() )
			return CMP_GREATER;
		else if( getValue() < p.getValue() )
			return CMP_LESS;
			
		return CMP_EQUAL;
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
