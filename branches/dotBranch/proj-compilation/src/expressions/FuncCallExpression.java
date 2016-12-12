package expressions;

import semantic.EnumTag;
import types.Type;

public class FuncCallExpression extends Expression {
	
	private Type ret;
	
	public FuncCallExpression(Expression e, Type t) {
		super(e, null, EnumTag.FUNCCALL);
		ret = t;
	}
	
	public Type getType() {
		return ret;
	}
	
	public String toString() {
		return "Func call expression ";
	}

}
