package expressions;

import semantic.EnumTag;

public class OrExpression extends Expression {
	public OrExpression(Expression e1,Expression e2, EnumTag tag) {
		super(e1,e2, tag);
	}
	
	public String toString() {
		return "OR : " + this.getLeft().toString() + this.getRight().toString();
	}
}
