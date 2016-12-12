package types;

import semantic.EnumTag;

public class IntType extends Type {

	public IntType() {
		super(null, null, null, EnumTag.INTEGER);
	}
	
	public String toString() {
		return "Integer ";
	}
}
