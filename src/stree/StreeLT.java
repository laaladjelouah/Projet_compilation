package stree;

import intermediary.InternTree;
import types.EnumType;
import types.Type;

public class StreeLT extends StreeBooleanOperator {

	public StreeLT(Stree left, Stree right) {
		super(left, right);
	}

	public void typeCheck(){
		super.typeCheck();
		type=new Type(EnumType.BOOLEAN); 	    
	}
		
	@Override
	public InternTree buildInternTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
