package expressions;

public class SuccExpression extends Expression {

	private Expression left;
	private Expression right;
	private static int cpt = 0;
	
	public SuccExpression(Expression e1, Expression e2) {
		super(e1,e2, null);
		if (e1 instanceof IDExpression)
			cpt++;
		if (e2 instanceof IDExpression)
			cpt++;
	}
	
	public int getNbVar(){
		return cpt;
	}
	
}
