package expressions;
public class MultExpression extends Expression {

	public MultExpression(Expression e1, Expression e2) {
		super(e1,e2, null);
	}
	
	public String toString() {
		return "Multiply : " + this.getLeft().toString() + this.getRight().toString();
	}
}
