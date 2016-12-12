package stree;

import intermediary.BINOP;
import intermediary.EnumOp;
import intermediary.InternTree;

public class StreeDIV extends StreeArithmeticOperator {

	public StreeDIV(Stree left, Stree right) {
		super(left, right);
		buildInternTree();
	}

	@Override
	public InternTree buildInternTree() {		
		return new BINOP(EnumOp.DIV, left.buildInternTree(),right.buildInternTree());		
	}
}