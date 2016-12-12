package stree;

import intermediary.BINOP;
import intermediary.EnumOp;
import intermediary.InternTree;

public class StreeMINUS extends StreeArithmeticOperator {

	public StreeMINUS(Stree left, Stree right) {
		super(left, right);
		buildInternTree();
	}
	
	@Override
	public InternTree buildInternTree() {
		
		return new BINOP(EnumOp.MINUS, left.buildInternTree(),right.buildInternTree());
		
	}
}
