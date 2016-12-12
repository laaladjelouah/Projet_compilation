package stree;

import intermediary.InternTree;
import types.EnumType;
import types.Type;

public class StreeGE extends StreeBooleanOperator {

	public StreeGE(Stree left, Stree right) {
		super(left, right);
	}

	public void typeCheck(){
		super.typeCheck();
		type=new Type(EnumType.BOOLEAN);

	}

	@Override
	public InternTree buildInternTree() {		
		return null;
	}
}
