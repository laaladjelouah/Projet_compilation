package stree;

import intermediary.InternTree;

public class StreeIF extends Stree {

	public StreeIF(Stree left, Stree right) {
		super(left, right);
	}

	public void typeCheck(){
		left.typeCheck();
		right.typeCheck();
		type=null;
	}
	
	@Override
	public InternTree buildInternTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
