package expressions;

public class DiffExpression extends Expression {

	public DiffExpression(Expression e1,Expression e2) {
		super(e1,e2, null);
	}
	
	public String toString() {
		return "Not equal : " + this.getLeft().toString() + this.getRight().toString();
	}
}
