package stree;

import intermediary.BINOP;
import intermediary.EnumOp;
import intermediary.InternTree;

public class StreeMUL extends StreeArithmeticOperator {

	public StreeMUL(Stree left, Stree right) {
		super(left, right);
		buildInternTree();
	}
	
	@Override
	public InternTree buildInternTree() {		
		return new BINOP(EnumOp.MUL, left.buildInternTree(),right.buildInternTree());		
	}
}
