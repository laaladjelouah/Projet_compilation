package stree;

import intermediary.InternTree;

public class StreeRETURN extends Stree {

	public StreeRETURN(Stree left) {
		super(left, null);
	}

	public void typeCheck(){
		left.typeCheck();
	}
	
	@Override
	public InternTree buildInternTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
