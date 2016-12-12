package expressions;

public class EqExpression extends Expression {

	public EqExpression(Expression e1, Expression e2) {
		super(e1,e2, null);
	}
	
	public String toString() {
		return "Equal : " + this.getLeft().toString() + this.getRight().toString();
	}
}
