package stree;

import intermediary.InternTree;
import types.EnumType;
import types.Type;

public class StreeGT extends StreeBooleanOperator {

	public StreeGT(Stree left, Stree right) {
		super(left, right);
	}

	public void typeCheck(){
		this.left.typeCheck();
		this.right.typeCheck();
		if (!this.left.type.unify(this.right.type))
			System.err.println("unification error");
		else
			System.err.println("unification OK");
		type=new Type(EnumType.BOOLEAN);
	}
	
	@Override
	public InternTree buildInternTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
