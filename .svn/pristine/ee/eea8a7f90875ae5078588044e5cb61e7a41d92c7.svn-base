package stree;

import intermediary.InternTree;
import types.EnumType;
import types.Type;

public class StreeLIST extends Stree {

	public StreeLIST(Stree left) {
		super(left, null);
		if (left.type.getLabel() != EnumType.TIMES)
			System.err.println("Intern Type error");
		type=new Type(EnumType.LIST, left.left.type);
	}

	public void typeCheck(){		

	}

	@Override
	public InternTree buildInternTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
