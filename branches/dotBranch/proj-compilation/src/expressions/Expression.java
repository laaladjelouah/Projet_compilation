package expressions;

import semantic.*;
import types.Type;

public class Expression extends AbstractTree{
	
	public Expression() {
		super();
	}
	
	public Expression(Expression e1, Expression e2, EnumTag tag) {
		super(tag, e1,e2);
	}
	
	public Expression getLeft() {
		return (Expression)super.getLeft();
	}
	
	public Expression getRight() {
		return (Expression)super.getRight();
	}
	
	public Expression(Expression e) {
		super(e);
	}	
}
