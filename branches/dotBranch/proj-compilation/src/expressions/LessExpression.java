package expressions;

public class LessExpression extends Expression {
	public LessExpression(Expression e1, Expression e2) {
		super(e1,e2, null);
	}
	
	public String toString() {
		return "< : " + this.getLeft().toString() + this.getRight().toString();
	}
}
