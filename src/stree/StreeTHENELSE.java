package stree;

import intermediary.InternTree;

public class StreeTHENELSE extends Stree {

	public StreeTHENELSE(Stree left, Stree right) {
		super(left, right);
	}

	public StreeTHENELSE(Stree left) {
		super(left, null);
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
