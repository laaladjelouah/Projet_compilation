package expressions;

public class MinusExpression extends Expression {
	public MinusExpression(Expression e1, Expression e2) {
		super(e1,e2, null);
	}
	
	public String toString() {
		return "Sub : " + this.getLeft().toString() + this.getRight().toString();
	}
}
