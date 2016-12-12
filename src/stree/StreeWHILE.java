package stree;

import intermediary.InternTree;

public class StreeWHILE extends Stree {

	public StreeWHILE(Stree left, Stree right) {
		super(left, right);
	}

	public void typeCheck(){
		left.typeCheck();
		right.typeCheck();
	}
	@Override
	public InternTree buildInternTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
