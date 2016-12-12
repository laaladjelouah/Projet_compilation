package stree;

import intermediary.BINOP;
import intermediary.EnumOp;
import intermediary.InternTree;

public class StreePLUS extends StreeArithmeticOperator {

	public StreePLUS(Stree left, Stree right) {
		super(left, right);
		typeCheck();
		buildInternTree();
	}

	public void typeCheck() {
		super.typeCheck();
	}

	@Override
	public InternTree buildInternTree() {		
		return new BINOP(EnumOp.PLUS, left.buildInternTree(),right.buildInternTree());		
	}
}
