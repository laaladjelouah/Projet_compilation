package expressions;

import semantic.EnumTag;
import types.*;

public class VariableExpression extends Expression {
	
	private String s;
	private Type t;
	
	public VariableExpression(String string, Type type) {
		super(null, null, EnumTag.VARIABLE);
		s = string;
		t = type;	
	}
	
	public String toString() {
		return "Variable : " + t.toString() + " : " + s;
	}

}
