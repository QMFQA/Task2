package task;

import properties.TestProperties;

public abstract class Parent {

	private int value;
	protected final String name;

	protected Parent() {
		this(TestProperties.VALUE);
	}

	protected Parent(int value) {
		this.value = value;
		this.name = TestProperties.NAME;
	}

	public abstract int compare(int value);

	public int getValue() {
		return value;
	}
	
}
