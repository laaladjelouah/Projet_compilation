package expressions;
public class AddExpression extends Expression {

	public AddExpression(Expression e1, Expression e2) {
		super(e1,e2, null);
	}
	
	public String toString() {
		return "Add : " + this.getLeft().toString() + this.getRight().toString();
	}
}
