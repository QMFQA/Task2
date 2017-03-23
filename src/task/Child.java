package task;

import properties.TestProperties;

public class Child extends Parent {

	static {
		TestProperties.NAME = "test1\\test2";
	}

	public Child() {
		super();
	}

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

	public int getValue() {
		return super.getValue() + 1;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((super.name == null) ? 0 : super.name.hashCode());
		result = prime * result + super.getValue();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Child))
			return false;
		Child other = (Child) obj;
		if (super.name == null) {
			if (other.name != null)
				return false;
		} else if (!super.name.equals(other.name))
			return false;
		return true;
	}

	public static String formatCompareResult(int comp_result) {
		if (comp_result == 0) {
			return "equal to";
		}
		if (comp_result > 0) {
			return "greater than";
		} else
			return "less than";
	}
}