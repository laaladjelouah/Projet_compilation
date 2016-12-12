package stree;

import intermediary.InternTree;
import intermediary.MOVE;
import types.EnumType;

public class StreeAFF extends Stree {

	public StreeAFF(Stree left, Stree right) {
		super(left, right);
		typeCheck();
		buildInternTree();
	}

	public void typeCheck(){
		left.typeCheck();
		right.typeCheck();
		if (right.type == null) {
			StreeFUNCCALL func = (StreeFUNCCALL) right;
			System.err.println("Function " + func.getFuncName() + " is a procedure, not a function !");
			return;
		}
		if (!left.type.unify(right.type)) 
			if (!(left.type.isFloat() && right.type.getLabel() == EnumType.INTEGER))
				System.err.println("Cannot assignment "+ left.type.toString() + " with " + right.type.toString());
		type=null;
	}

	@Override
	public InternTree buildInternTree() {
		return new MOVE(left.buildInternTree(),right.buildInternTree());

	}
}
